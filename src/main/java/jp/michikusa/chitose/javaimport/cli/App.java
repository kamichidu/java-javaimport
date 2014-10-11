package jp.michikusa.chitose.javaimport.cli;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Sets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Pattern;

import lombok.Getter;
import lombok.Setter;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.spi.FileOptionHandler;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.google.common.collect.Iterables.*;

import static java.util.Arrays.asList;

public class App
{
    public static class AppOption
    {
        public Iterable<File> getJarpaths()
        {
            return asList(this.jarpaths);
        }

        public void setJarpaths(Iterable<? extends File> jarpaths)
        {
            this.jarpaths= asList(jarpaths).toArray(new File[0]);
        }

        @Getter @Setter
        @Option(name= "-o", aliases= "--outputdir", required= true, handler= FileOptionHandler.class, usage= "Output directory")
        private File dataDir;

        @Argument(required= true, multiValued= true, handler= FileOptionHandler.class, usage= "Jar paths")
        private File[] jarpaths;

        @Getter @Setter
        @Option(name= "-h", aliases= "--help", help= true, usage= "Print this message.")
        private boolean help;
    }

    public static void main(String[] args)
    {
        final AppOption option= new AppOption();
        final CmdLineParser parser= new CmdLineParser(option);

        try
        {
            parser.parseArgument(args);

            if(option.isHelp())
            {
                parser.printUsage(System.err);
                return;
            }

            logger.info("Start to analyze and emmit class information with {");
            logger.info("--datadir=`{}'", option.getDataDir());
            logger.info("--jarpaths=`{}'", option.getJarpaths());
            logger.info("}");

            final long startTime= System.nanoTime();
            for(final File jarpath : option.getJarpaths())
            {
                try
                {
                    logger.info("Analyze {}", jarpath);
                    new Analyzer(option.getDataDir(), jarpath).run();
                }
                catch(IOException e)
                {
                    logger.error("An exception occured during analyzing.", e);
                }
            }
            final long endTime= System.nanoTime();
            System.out.format("time required: %s [ms]",
                NumberFormat.getNumberInstance().format(TimeUnit.NANOSECONDS.toMillis(endTime - startTime))
            );
        }
        catch(CmdLineException e)
        {
            System.err.println(e.getMessage());
            parser.printUsage(System.err);
        }
        catch(Exception e)
        {
            logger.error("An exception occured.", e);
        }
    }

    private static class Analyzer
        implements Runnable
    {
        public Analyzer(File outputDir, File jarpath)
            throws IOException
        {
            this.outputDir= new File(outputDir, jarpath.getName());
            this.jar= new JarFile(jarpath);
        }

        @Override
        public void run()
        {
            try
            {
                if(!this.outputDir.exists())
                {
                    this.outputDir.mkdirs();
                }

                final ImmutableMultimap<String, JarEntry> entries= this.splitEntries(filter(Collections.list(this.jar.entries()), new Predicate<JarEntry>(){
                    @Override
                    public boolean apply(JarEntry input)
                    {
                        final String name= input.getName();

                        // avoid to process non-class file
                        if(!name.endsWith(".class"))
                        {
                            return false;
                        }
                        if(name.contains("$"))
                        {
                            // filter anonymouse class
                            return !Pattern.compile("\\$\\d+\\.class$").matcher(name).find();
                        }
                        return true;
                    }
                }));
                for(final String pkg : entries.keySet())
                {
                    FileOutputStream out= null;
                    try
                    {
                        final File outfile= new File(this.outputDir, pkg);

                        if(!outfile.exists())
                        {
                            outfile.createNewFile();
                        }

                        out= new FileOutputStream(outfile);

                        this.writeClasses(out, jar, entries.get(pkg));
                    }
                    finally
                    {
                        if(out != null)
                        {
                            out.close();
                        }
                    }
                }
            }
            catch(IOException e)
            {
                throw new RuntimeException(e);
            }
        }

        private ImmutableMultimap<String, JarEntry> splitEntries(Iterable<? extends JarEntry> entries)
        {
            final ImmutableMultimap.Builder<String, JarEntry> builder= ImmutableMultimap.builder();

            for(final JarEntry entry : entries)
            {
                final File filename= new File(entry.getName());
                builder.put(filename.getParent().replace('/', '.'), entry);
            }

            return builder.build();
        }

        private void writeClasses(OutputStream out, JarFile jar, Iterable<? extends JarEntry> entries)
            throws IOException
        {
            JsonGenerator g= null;
            try
            {
                g= new JsonFactory().createGenerator(new FilterOutputStream(out){
                    @Override
                    public void close()
                        throws IOException
                    {
                    }
                });
                /* g.setPrettyPrinter(new DefaultPrettyPrinter()); */

                g.writeStartArray();
                for(final JarEntry entry : entries)
                {
                    logger.debug("Reading `{}'.", entry.getName());

                    InputStream in= null;
                    try
                    {
                        in= this.jar.getInputStream(entry);

                        this.emmitClassInfo(g, in);
                    }
                    finally
                    {
                        if(in != null)
                        {
                            in.close();
                        }
                    }
                }
                g.writeEndArray();
            }
            finally
            {
                if(g != null)
                {
                    g.close();
                }
            }
        }

        private void emmitClassInfo(JsonGenerator g, InputStream in)
            throws IOException
        {
            final ClassReader reader= new ClassReader(in);

            reader.accept(new ClassEmitter(g), ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
        }

        private final File outputDir;

        private final JarFile jar;
    }

    private static class ClassEmitter extends ClassVisitor
    {
        public ClassEmitter(JsonGenerator g)
        {
            super(Opcodes.ASM5);

            this.g= g;
        }

        @Override
        public void visit(int version, int access, String name, String signature, String superName, String[] interfaces)
        {
            try
            {
                final String canonicalName= name.replace('/', '.').replace('$', '.');
                final String simpleName= name.contains(".") ? canonicalName.substring(name.lastIndexOf(".")) : canonicalName;

                this.g.writeStartObject();
                this.g.writeStringField("canonical_name", canonicalName);
                this.g.writeStringField("simple_name", simpleName);
                this.g.writeStringField("name", name.replace('/', '.'));
                this.g.writeStringField("superclass", superName != null ? superName.replace('/', '.').replace('$', '.') : "");
                this.g.writeBooleanField("is_enum", (access & Opcodes.ACC_ENUM) == Opcodes.ACC_ENUM);
                this.g.writeBooleanField("is_interface", (access & Opcodes.ACC_INTERFACE) == Opcodes.ACC_INTERFACE);
                this.g.writeBooleanField("is_annotation", (access & Opcodes.ACC_ANNOTATION) == Opcodes.ACC_ANNOTATION);
                this.g.writeArrayFieldStart("interfaces");
                for(final String cname : interfaces)
                {
                    this.g.writeString(cname.replace('/', '.').replace('$', '.'));
                }
                this.g.writeEndArray();
            }
            catch(IOException e)
            {
                logger.error("An exception occured during emitting class info.", e);
            }
        }

        @Override
        public FieldVisitor visitField(int access, String name, String desc, String signature, Object value)
        {
            return null;
        }

        @Override
        public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions)
        {
            return null;
        }

        @Override
        public void visitInnerClass(String name, String outerName, String innerName, int access)
        {
            // innerName is null when it's an anonymouse class
            /* if(innerName != null) */
            /* { */
            /*     write(out, ","); */
            /*     write(out, name.replace('$', '.')); */
            /* } */
        }

        @Override
        public void visitEnd()
        {
            try
            {
                this.g.writeEndObject();
            }
            catch(IOException e)
            {
                logger.error("An exception occured during emitting class info.", e);
            }
        }

        /* private static void write(OutputStream out, CharSequence mes) */
        /* { */
        /*     try */
        /*     { */
        /*         out.write(mes.toString().getBytes()); */
        /*     } */
        /*     catch(IOException e) */
        /*     { */
        /*         logger.error("An exception occured at writing to stream.", e); */
        /*     } */
        /* } */

        private final JsonGenerator g;
    }

    private static final Logger logger= LoggerFactory.getLogger(App.class);
}

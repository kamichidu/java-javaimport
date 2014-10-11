package jp.michikusa.chitose.javaimport.analysis;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableMultimap;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Pattern;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.google.common.collect.Iterables.*;

public class ClassInfoAnalyzer
    implements Runnable
{
    public ClassInfoAnalyzer(File outputDir, File jarpath)
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

        private final JsonGenerator g;
    }

    private static final Logger logger= LoggerFactory.getLogger(ClassInfoAnalyzer.class);

    private final File outputDir;

    private final JarFile jar;
}

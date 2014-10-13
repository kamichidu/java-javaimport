package jp.michikusa.chitose.javaimport.analysis;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.io.Closer;
import com.google.common.io.Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Pattern;

import jp.michikusa.chitose.javaimport.predicate.IsAnonymouseClass;
import jp.michikusa.chitose.javaimport.predicate.IsClassFile;
import jp.michikusa.chitose.javaimport.predicate.IsPackageInfo;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.google.common.base.Predicates.*;
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
        final ExecutorService service= Executors.newCachedThreadPool();
        try
        {
            if(!this.outputDir.exists())
            {
                this.outputDir.mkdirs();
            }

            @SuppressWarnings("unchecked")
            final Predicate<JarEntry> predicate= and(
                IsClassFile.forJarEntry(),
                not(IsPackageInfo.forJarEntry()),
                not(IsAnonymouseClass.forJarEntry())
            );
            final ImmutableMultimap<String, JarEntry> entries= this.splitEntries(filter(Collections.list(this.jar.entries()), predicate));
            final List<Future<?>> tasks= new ArrayList<Future<?>>(entries.keySet().size());
            for(final String pkg : entries.keySet())
            {
                tasks.add(service.submit(new Task(new File(this.outputDir, pkg), jar, entries.get(pkg))));
            }
            // stop tasking
            service.shutdown();
            // wait for task
            for(final Future<?> task : tasks)
            {
                task.get();
            }
        }
        catch(IOException e)
        {
            throw new RuntimeException(e);
        }
        catch(Exception e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
            service.shutdownNow();
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

    private static class Task
        implements Runnable
    {
        public Task(File outfile, JarFile jar, Iterable<? extends JarEntry> entries)
            throws IOException
        {
            this.outfile= outfile;
            this.jar= jar;
            this.entries= entries;
        }

        @Override
        public void run()
        {
            final Closer closer= Closer.create();
            File bufferfile= null;
            try
            {
                bufferfile= File.createTempFile("javaimport", "tmp");
                final JsonGenerator g= closer.register(new JsonFactory().createGenerator(new FilterOutputStream(new FileOutputStream(bufferfile)){
                    @Override
                    public void close()
                        throws IOException
                    {
                    }
                }));
                /* g.setPrettyPrinter(new DefaultPrettyPrinter()); */

                g.writeStartArray();
                for(final JarEntry entry : this.entries)
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
            catch(IOException e)
            {
                logger.error("An exception occured during analysis task.", e);
            }
            finally
            {
                try
                {
                    closer.close();
                }
                catch(IOException e)
                {
                    throw new RuntimeException(e);
                }
            }
            if(bufferfile != null && bufferfile.canRead() && !this.outfile.exists())
            {
                try
                {
                    Files.move(bufferfile, this.outfile);
                }
                catch(IOException e)
                {
                    logger.error("An exception occured during releasing file.", e);
                }
            }
        }

        private void emmitClassInfo(JsonGenerator g, InputStream in)
            throws IOException
        {
            final ClassReader reader= new ClassReader(in);

            reader.accept(new ClassEmitter(g), ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
        }

        private final File outfile;

        private final JarFile jar;

        private final Iterable<? extends JarEntry> entries;
    }

    private static class ClassEmitter
        extends ClassVisitor
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
                final String simpleName= canonicalName.contains(".") ? canonicalName.substring(canonicalName.lastIndexOf(".") + 1) : canonicalName;

                this.g.writeStartObject();
                this.g.writeStringField("canonical_name", canonicalName);
                this.g.writeStringField("simple_name", simpleName);
                this.g.writeStringField("name", name.replace('/', '.'));
                this.g.writeStringField("superclass", superName != null ? superName.replace('/', '.').replace('$', '.') : "");
                this.g.writeBooleanField("is_enum", (access & Opcodes.ACC_ENUM) == Opcodes.ACC_ENUM);
                this.g.writeBooleanField("is_interface", (access & Opcodes.ACC_INTERFACE) == Opcodes.ACC_INTERFACE);
                this.g.writeBooleanField("is_annotation", (access & Opcodes.ACC_ANNOTATION) == Opcodes.ACC_ANNOTATION);
                this.g.writeArrayFieldStart("modifiers");
                {
                    if((access & Opcodes.ACC_PUBLIC)    == Opcodes.ACC_PUBLIC)   { this.g.writeString("public"); }
                    if((access & Opcodes.ACC_PROTECTED) == Opcodes.ACC_PROTECTED){ this.g.writeString("protected"); }
                    if((access & Opcodes.ACC_PRIVATE)   == Opcodes.ACC_PRIVATE)  { this.g.writeString("private"); }
                    if((access & Opcodes.ACC_FINAL)     == Opcodes.ACC_FINAL)    { this.g.writeString("final"); }
                    if((access & Opcodes.ACC_ABSTRACT)  == Opcodes.ACC_ABSTRACT) { this.g.writeString("abstract"); }
                }
                this.g.writeEndArray();
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

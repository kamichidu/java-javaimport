package jp.michikusa.chitose.javaimport.analysis;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.io.Closer;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import jp.michikusa.chitose.javaimport.predicate.IsAnonymouseClass;
import jp.michikusa.chitose.javaimport.predicate.IsClassFile;
import jp.michikusa.chitose.javaimport.predicate.IsPackageInfo;
import jp.michikusa.chitose.javaimport.util.LangSpec;
import jp.michikusa.chitose.javaimport.util.Stringifier;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
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
            builder.put(LangSpec.packageFromPath(filename.getParent()), entry);
        }

        return builder.build();
    }

    private static class Task
        extends AbstractAnalyzer
    {
        public Task(File outfile, JarFile jar, Iterable<? extends JarEntry> entries)
            throws IOException
        {
            super(outfile);

            this.jar= jar;
            this.entries= entries;
        }

        @Override
        public void runImpl(File outfile)
        {
            final Closer closer= Closer.create();
            try
            {
                final JsonGenerator g= closer.register(new JsonFactory().createGenerator(new FileOutputStream(outfile)));
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
        }

        private void emmitClassInfo(JsonGenerator g, InputStream in)
            throws IOException
        {
            final ClassReader reader= new ClassReader(in);

            reader.accept(new ClassEmitter(g), ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
        }

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
                final String canonicalName= LangSpec.canonicalNameFromBinaryName(name);
                final String simpleName= canonicalName.contains(".") ? canonicalName.substring(canonicalName.lastIndexOf(".") + 1) : canonicalName;

                this.g.writeStartObject();
                this.g.writeStringField("canonical_name", canonicalName);
                this.g.writeStringField("simple_name", simpleName);
                this.g.writeStringField("name", LangSpec.nameFromBinaryName(name));
                this.g.writeStringField("superclass", superName != null ? LangSpec.canonicalNameFromBinaryName(superName) : "");
                this.g.writeBooleanField("is_enum", (access & Opcodes.ACC_ENUM) == Opcodes.ACC_ENUM);
                this.g.writeBooleanField("is_interface", (access & Opcodes.ACC_INTERFACE) == Opcodes.ACC_INTERFACE);
                this.g.writeBooleanField("is_annotation", (access & Opcodes.ACC_ANNOTATION) == Opcodes.ACC_ANNOTATION);
                this.g.writeArrayFieldStart("modifiers");
                for(final CharSequence acc : Stringifier.classAccessFlags(access))
                {
                    this.g.writeString(acc.toString());
                }
                this.g.writeEndArray();
                this.g.writeArrayFieldStart("interfaces");
                for(final String cname : interfaces)
                {
                    this.g.writeString(LangSpec.canonicalNameFromBinaryName(cname));
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
            final Closer closer= Closer.create();
            ByteArrayOutputStream out= null;
            try
            {
                out= closer.register(new ByteArrayOutputStream());
                final JsonGenerator g= closer.register(new JsonFactory().createGenerator(out));

                g.writeStartObject();
                g.writeStringField("name", name);
                g.writeStringField("type", Type.getType(desc).getClassName());
                g.writeStringField("value", "" + value);
                g.writeArrayFieldStart("modifiers");
                for(final CharSequence acc : Stringifier.fieldAccessFlags(access))
                {
                    g.writeString(acc.toString());
                }
                g.writeEndArray();
                g.writeEndObject();
            }
            catch(IOException e)
            {
                logger.error("Got an error.", e);
            }
            finally
            {
                try
                {
                    closer.close();
                }
                catch(IOException e)
                {
                    logger.error("Unable to close.", e);
                }

                if(out != null)
                {
                    this.fields.add(out.toString());
                }
            }
            return null;
        }

        @Override
        public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions)
        {
            final Closer closer= Closer.create();
            ByteArrayOutputStream out= null;
            try
            {
                out= closer.register(new ByteArrayOutputStream());
                final JsonGenerator g= closer.register(new JsonFactory().createGenerator(out));

                final Type type= Type.getMethodType(desc);

                g.writeStartObject();
                g.writeStringField("name", name);
                g.writeStringField("return_type", type.getReturnType().getClassName());
                g.writeArrayFieldStart("parameters");
                for(final Type argType : type.getArgumentTypes())
                {
                    g.writeStartObject();
                    g.writeStringField("type", argType.getClassName());
                    g.writeEndObject();
                }
                g.writeEndArray();
                g.writeArrayFieldStart("throws");
                for(final String exception : (exceptions != null ? exceptions : new String[0]))
                {
                    g.writeStartObject();
                    g.writeStringField("type", Type.getType(exception).getClassName());
                    g.writeEndObject();
                }
                g.writeEndArray();
                g.writeArrayFieldStart("modifiers");
                for(final CharSequence acc : Stringifier.methodAccessFlags(access))
                {
                    g.writeString(acc.toString());
                }
                g.writeEndArray();
                g.writeEndObject();
            }
            catch(IOException e)
            {
                logger.error("Got an error.", e);
            }
            finally
            {
                try
                {
                    closer.close();
                }
                catch(IOException e)
                {
                    logger.error("Unable to close.", e);
                }

                if(out != null)
                {
                    this.methods.add(out.toString());
                }
            }
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
                this.g.writeArrayFieldStart("fields");
                for(final CharSequence field : this.fields)
                {
                    this.g.writeRawValue(field.toString());
                }
                this.g.writeEndArray();

                this.g.writeArrayFieldStart("methods");
                for(final CharSequence method : this.methods)
                {
                    this.g.writeRawValue(method.toString());
                }
                this.g.writeEndArray();

                this.g.writeEndObject();
            }
            catch(IOException e)
            {
                logger.error("An exception occured during emitting class info.", e);
            }
        }

        private final JsonGenerator g;

        private final List<CharSequence> fields= new LinkedList<CharSequence>();

        private final List<CharSequence> methods= new LinkedList<CharSequence>();
    }

    private static final Logger logger= LoggerFactory.getLogger(ClassInfoAnalyzer.class);

    private final File outputDir;

    private final JarFile jar;
}

package jp.michikusa.chitose.javaimport.analysis;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.io.Closer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import jp.michikusa.chitose.javaimport.entity.ClassData;
import jp.michikusa.chitose.javaimport.entity.ExceptionType;
import jp.michikusa.chitose.javaimport.entity.FieldData;
import jp.michikusa.chitose.javaimport.entity.MethodData;
import jp.michikusa.chitose.javaimport.entity.MethodParameterData;
import jp.michikusa.chitose.javaimport.predicate.IsAnonymouseClass;
import jp.michikusa.chitose.javaimport.predicate.IsClassFile;
import jp.michikusa.chitose.javaimport.predicate.IsPackageInfo;
import jp.michikusa.chitose.javaimport.util.FileSystem;
import jp.michikusa.chitose.javaimport.util.FileSystem.Path;
import jp.michikusa.chitose.javaimport.util.JsonCodec;
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

import static com.google.common.base.Predicates.and;
import static com.google.common.base.Predicates.not;
import static com.google.common.collect.Iterables.transform;

import static java.util.Arrays.asList;

import static jp.michikusa.chitose.javaimport.analysis.AbstractAnalyzer.toOutputDirectory;

public class ClassInfoAnalyzer
    implements Runnable
{
    public ClassInfoAnalyzer(File outputDir, File path)
        throws IOException
    {
        this.outputDir= toOutputDirectory(outputDir, path);
        this.fs= FileSystem.create(path);
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
            final Predicate<Path> predicate= and(
                new IsClassFile(),
                not(new IsPackageInfo()),
                not(new IsAnonymouseClass())
            );
            final ImmutableMultimap<String, Path> entries= this.splitEntries(this.fs.listFiles(predicate));
            final List<Future<?>> tasks= new ArrayList<Future<?>>(entries.keySet().size());
            for(final String pkg : entries.keySet())
            {
                tasks.add(service.submit(new Task(new File(this.outputDir, pkg), this.fs, entries.get(pkg))));
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

    private ImmutableMultimap<String, Path> splitEntries(Iterable<? extends Path> entries)
    {
        final ImmutableMultimap.Builder<String, Path> builder= ImmutableMultimap.builder();

        for(final Path entry : entries)
        {
            builder.put(LangSpec.packageFromPath(entry.getParent()), entry);
        }

        return builder.build();
    }

    private static class Task
        extends AbstractAnalyzer
    {
        public Task(File outfile, FileSystem fs, Iterable<? extends Path> entries)
            throws IOException
        {
            super(outfile);

            this.fs= fs;
            this.entries= entries;
        }

        @Override
        public void runImpl(File outfile)
        {
            final Closer closer= Closer.create();
            try
            {
                final JsonGenerator g= closer.register(new JsonFactory(new JsonCodec()).createGenerator(new FileOutputStream(outfile)));
                /* g.setPrettyPrinter(new DefaultPrettyPrinter()); */

                g.writeStartArray();
                for(final Path entry : this.entries)
                {
                    logger.debug("Reading `{}'.", entry.getFilename());

                    InputStream in= null;
                    try
                    {
                        in= this.fs.openInputStream(entry.getFilename());

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
            final ClassEmitter emitter= new ClassEmitter();

            reader.accept(emitter, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);

            g.writeObject(emitter.getBuiltObject());
        }

        private final FileSystem fs;

        private final Iterable<? extends Path> entries;
    }

    private static class ClassEmitter
        extends ClassVisitor
    {
        public ClassEmitter()
        {
            super(Opcodes.ASM5);
        }

        public ClassData getBuiltObject()
        {
            return this.object;
        }

        @Override
        public void visit(int version, int access, String name, String signature, String superName, String[] interfaces)
        {
            final String canonicalName= LangSpec.canonicalNameFromBinaryName(name);
            final String simpleName= canonicalName.contains(".") ? canonicalName.substring(canonicalName.lastIndexOf(".") + 1) : canonicalName;

            this.object.setCanonicalName(canonicalName);
            this.object.setSimpleName(simpleName);
            this.object.setName(LangSpec.nameFromBinaryName(name));
            this.object.setSuperclass(superName != null ? LangSpec.canonicalNameFromBinaryName(superName) : "");
            this.object.setEnumType((access & Opcodes.ACC_ENUM) == Opcodes.ACC_ENUM);
            this.object.setInterfaceType((access & Opcodes.ACC_INTERFACE) == Opcodes.ACC_INTERFACE);
            this.object.setAnnotationType((access & Opcodes.ACC_ANNOTATION) == Opcodes.ACC_ANNOTATION);
            this.object.setModifiers(Stringifier.classAccessFlags(access));
            this.object.setInterfaces(transform(asList(interfaces), new Function<String, String>(){
                @Override
                public String apply(String input) {
                    return LangSpec.canonicalNameFromBinaryName(input);
                }
            }));
        }

        @Override
        public FieldVisitor visitField(int access, String name, String desc, String signature, Object value)
        {
            final FieldData field= new FieldData();

            field.setName(name);
            field.setType(Type.getType(desc).getClassName());
            field.setValue("" + value);
            field.setModifiers(Stringifier.fieldAccessFlags(access));

            this.object.addField(field);

            return null;
        }

        @Override
        public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions)
        {
            final Type type= Type.getMethodType(desc);
            final MethodData method= new MethodData();

            method.setName(name);
            method.setReturnType(type.getReturnType().getClassName());

            for(final Type argType : type.getArgumentTypes())
            {
                final MethodParameterData paramData= new MethodParameterData();

                paramData.setType(argType.getClassName());

                method.addParameter(paramData);
            }

            for(final String exception : (exceptions != null ? exceptions : new String[0]))
            {
                final ExceptionType exceptionType= new ExceptionType();

                exceptionType.setType(Type.getType(exception).getClassName());

                method.addExceptionType(exceptionType);
            }

            method.setModifiers(Stringifier.methodAccessFlags(access));

            this.object.addMethod(method);

            return null;
        }

        private final ClassData object= new ClassData();
    }

    private static final Logger logger= LoggerFactory.getLogger(ClassInfoAnalyzer.class);

    private final File outputDir;

    private final FileSystem fs;
}

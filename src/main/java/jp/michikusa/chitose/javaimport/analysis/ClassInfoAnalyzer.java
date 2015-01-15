package jp.michikusa.chitose.javaimport.analysis;

import static com.google.common.base.Predicates.and;
import static com.google.common.base.Predicates.not;
import static com.google.common.collect.Iterables.transform;
import static java.util.Arrays.asList;
import static jp.michikusa.chitose.javaimport.analysis.AbstractAnalyzer.toOutputDirectory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

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
import jp.michikusa.chitose.javaimport.util.IndexCodec;
import jp.michikusa.chitose.javaimport.util.LangSpec;
import jp.michikusa.chitose.javaimport.util.Stringifier;
import jp.michikusa.chitose.lolivimson.core.VimsonGenerator;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Queues;

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
            final BlockingQueue<ClassData> buffer= Queues.newLinkedBlockingQueue();
            final ImmutableMultimap<String, Path> entries= this.splitEntries(this.fs.listFiles(predicate));
            final List<Future<?>> tasks= new ArrayList<Future<?>>(entries.keySet().size());
            for(final String pkg : entries.keySet())
            {
                tasks.add(service.submit(new Task(buffer, this.fs, entries.get(pkg))));
            }
            // stop tasking
            service.shutdown();

            VimsonGenerator g= null;
            try
            {
//                g= new VimsonGenerator(new FileOutputStream(new File(outputDir, "classes.index")));
                g= new VimsonGenerator(new FilterOutputStream(System.out){
                    @Override
                    public void close() throws IOException
                    {
                    }
                });

                g.setObjectCodec(new IndexCodec());

                int remaining= tasks.size();
//                g.writeStartList();
                while(remaining > 0)
                {
                    final ClassData data= buffer.poll(50, TimeUnit.MILLISECONDS);
                    if(data != null)
                    {
                        if(data != Task.TERMINAL)
                        {
                            g.writeObject(data);
                            g.writeRaw("\n");
                        }
                        else
                        {
                            --remaining;
                        }
                    }
                }
//                g.writeEndList();
            }
            catch(IOException e)
            {
                logger.error("Got an error when writing an index file.", e);
            }
            finally
            {
                if(g != null)
                {
                    g.close();
                }
            }

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
        implements Runnable
    {
        public static final ClassData TERMINAL= new ClassData();

        public Task(Queue<? super ClassData> out, FileSystem fs, Iterable<? extends Path> entries)
            throws IOException
        {
            this.out= out;
            this.fs= fs;
            this.entries= entries;
        }

        @Override
        public void run()
        {
            try
            {
                for(final Path entry : this.entries)
                {
                    logger.debug("Reading `{}'.", entry.getFilename());

                    InputStream in= null;
                    try
                    {
                        in= this.fs.openInputStream(entry.getFilename());

                        this.emmitClassInfo(in);
                    }
                    catch(IOException e)
                    {
                        logger.error("An exception occured during analysis task.", e);
                    }
                    finally
                    {
                        if(in != null)
                        {
                            try
                            {
                                in.close();
                            }
                            catch(IOException e)
                            {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
            finally
            {
                out.offer(TERMINAL);
            }
        }

        private void emmitClassInfo(InputStream in)
            throws IOException
        {
            final ClassReader reader= new ClassReader(in);
            final ClassEmitter emitter= new ClassEmitter();

            reader.accept(emitter, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);

            while(!this.out.offer(emitter.getBuiltObject())){}
        }

        private final Queue<? super ClassData> out;

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

            this.object.setPackageName(LangSpec.packageFromBinaryName(name));
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

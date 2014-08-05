package jp.michikusa.chitose.unitejavaimport;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Queues;
import com.google.common.collect.UnmodifiableIterator;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import jp.michikusa.chitose.unitejavaimport.util.AbstractTaskWorker;
import jp.michikusa.chitose.unitejavaimport.util.AggregateWorkerSupport;
import jp.michikusa.chitose.unitejavaimport.util.TaskWorker;
import jp.michikusa.chitose.unitejavaimport.util.WorkerSupport;

import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.Field;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.google.common.base.Predicates.alwaysTrue;
import static com.google.common.base.Predicates.and;
import static com.google.common.base.Predicates.compose;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.transform;

final class InMemoryRepository extends Repository
{
    @Override
    public Iterable<JavaClass> classes(Path classpath, Predicate<? super JavaClass> predicate)
    {
        try
        {
            final Lister lister= this.newLister(classpath);
            final ConcurrentIterator<JavaClass> itr= new ConcurrentIterator<>(predicate);
            final ExecutorService executor= Executors.newCachedThreadPool();

            lister.addWorker(itr);
            lister.addWorker(new AbstractTaskWorker<Object>(){
                @Override
                public void endTask()
                {
                    executor.shutdown();
                }
            });

            executor.execute(lister);

            return itr;
        }
        catch(Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterable<Field> fields(Path classpath, Predicate<? super JavaClass> classPredicate, Predicate<? super Field> fieldPredicate)
    {
        final ImmutableSet.Builder<Field> fields= ImmutableSet.builder();

        for(final JavaClass clazz : this.classes(classpath, classPredicate))
        {
            fields.addAll(filter(ImmutableList.copyOf(clazz.getFields()), fieldPredicate));
        }

        return fields.build();
    }

    @Override
    public ImmutableSet<Method> methods(Path classpath, Predicate<? super JavaClass> classPredicate, Predicate<? super Method> methodPredicate)
    {
        final ImmutableSet.Builder<Method> methods= ImmutableSet.builder();

        for(final JavaClass clazz : this.classes(classpath, classPredicate))
        {
            methods.addAll(filter(ImmutableList.copyOf(clazz.getMethods()), methodPredicate));
        }

        return methods.build();
    }

    @Override
    public Iterable<String> packages(Path classpath, Predicate<? super String> predicate)
    {
        final Predicate<JavaClass> uniq= new Predicate<JavaClass>(){
            @Override
            public boolean apply(JavaClass input)
            {
                final String pkg= input.getPackageName();

                if(this.s.contains(pkg))
                {
                    return false;
                }

                this.s.add(pkg);

                return this.s.contains(pkg);
            }

            private final Set<String> s= new HashSet<>();
        };
        final Function<JavaClass, String> transformer= new Function<JavaClass, String>(){
            @Override
            public String apply(JavaClass input)
            {
                return input.getPackageName();
            }
        };

        return transform(this.classes(classpath, and(uniq, compose(predicate, transformer))), transformer);
    }

    private Lister newLister(Path classpath)
    {
        final File file= classpath.toFile();

        if(file.isDirectory())
        {
            return new ListJavaClassForDirectory(classpath);
        }
        if(file.getName().endsWith(".jar"))
        {
            return new ListJavaClassForJar(classpath);
        }
        if(file.getName().endsWith(".zip"))
        {
            return new ListJavaClassForJar(classpath);
        }

        throw new IllegalArgumentException("unsupported file: " + classpath);
    }

    private static abstract class Lister implements Runnable, WorkerSupport<JavaClass>
    {
        @Override
        public final void run()
        {
            try
            {
                this.workers.beginTask();

                this.runImpl();
            }
            finally
            {
                this.workers.endTask();
            }
        }

        @Override
        public void addWorker(TaskWorker<? super JavaClass> worker)
        {
            this.workers.addWorker(worker);
        }

        @Override
        public void removeWorker(TaskWorker<? super JavaClass> worker)
        {
            this.workers.removeWorker(worker);
        }

        protected abstract void runImpl();

        protected final AggregateWorkerSupport<JavaClass> workers= new AggregateWorkerSupport<>();
    }

    private static class ListJavaClassForDirectory extends Lister
    {
        public ListJavaClassForDirectory(Path directory)
        {
            this.directory= directory;
        }

        @Override
        public void runImpl()
        {
            try
            {
                final File[] files= this.directory.toFile().listFiles(new FilenameFilter(){
                    @Override
                    public boolean accept(File dir, String name)
                    {
                        return name.endsWith(".class");
                    }
                });

                if(files == null)
                {
                    logger.warn("something wrong, cannot list files for {}", this.directory);
                    return;
                }

                for(final File file : files)
                {
                    this.workers.doTask(new ClassParser(file.getAbsolutePath()).parse());
                }
            }
            catch(IOException e)
            {
                throw new RuntimeException(e);
            }
        }

        private final Path directory;
    }

    private static class ListJavaClassForJar extends Lister
    {
        public ListJavaClassForJar(Path jarfile)
        {
            this.jarfile= jarfile;
        }

        @Override
        public void runImpl()
        {
            try
            {
                final JarFile jar= new JarFile(this.jarfile.toFile());
                final Iterable<JarEntry> entries= filter(Collections.list(jar.entries()), new Predicate<JarEntry>(){
                    @Override
                    public boolean apply(JarEntry input)
                    {
                        return input.getName().endsWith(".class");
                    }
                });

                for(final JarEntry entry : entries)
                {
                    try(final InputStream istream= jar.getInputStream(entry))
                    {
                        this.workers.doTask(new ClassParser(istream, entry.getName()).parse());
                    }
                }
            }
            catch(Exception e)
            {
                throw new RuntimeException(e);
            }
        }

        private final Path jarfile;
    }

    private static class ConcurrentIterator<T> extends UnmodifiableIterator<T> implements TaskWorker<T>, Iterable<T>
    {
        public ConcurrentIterator(Predicate<? super T> predicate)
        {
            this.predicate= predicate;
        }

        @Override
        public Iterator<T> iterator()
        {
            return this;
        }

        @Override
        public boolean hasNext()
        {
            while( !this.finish.get() && this.queue.isEmpty())
            {
                Thread.yield();
            }

            return !this.queue.isEmpty();
        }

        @Override
        public T next()
        {
            return this.queue.poll();
        }

        @Override
        public void beginTask()
        {
        }

        @Override
        public void doTask(T o)
        {
            if(this.predicate.apply(o))
            {
                this.queue.add(o);
            }
        }

        @Override
        public void endTask()
        {
            this.finish.set(true);
        }

        private final Predicate<? super T> predicate;

        private final ConcurrentLinkedQueue<T> queue= Queues.newConcurrentLinkedQueue();

        private final AtomicBoolean finish= new AtomicBoolean(false);
    }

    private static final Logger logger= LoggerFactory.getLogger(InMemoryRepository.class);
}

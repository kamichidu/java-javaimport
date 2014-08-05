package jp.michikusa.chitose.unitejavaimport;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.Field;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;

final class DatabaseRepository extends Repository
{
    public DatabaseRepository()
    {
        try
        {
            final File tmpfile= File.createTempFile("javaimport", ".cache");

            tmpfile.deleteOnExit();

            this.connection= DriverManager.getConnection("jdbc:h2:" + tmpfile.getAbsolutePath());

            try(final Statement stat= this.connection.createStatement())
            {
                stat.execute("create table repository (classpath varchar not null, resource_name varchar not null, class_name varchar not null, data binary)");
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ImmutableSet<JavaClass> classes(Path classpath, Predicate<? super JavaClass> predicate)
    {
        try
        {
            try(final PreparedStatement stat= this.connection.prepareStatement("select count(*) from repository where classpath = ?"))
            {
                stat.setString(1, classpath.toAbsolutePath().toString());

                stat.execute();

                try(final ResultSet rs= stat.getResultSet())
                {
                    while(rs.next())
                    {
                        // has cache
                        if(rs.getLong(1) > 0)
                        {
                            return this.restore(classpath);
                        }
                    }
                }
            }

            final Callable<ImmutableSet<JavaClass>> lister= this.newLister(classpath);
            final ImmutableSet<JavaClass> classes= lister.call();

            this.store(classpath, classes);

            return ImmutableSet.copyOf(Iterables.filter(classes, predicate));
        }
        catch(Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ImmutableSet<Field> fields(Path classpath, Predicate<? super JavaClass> classPredicate, Predicate<? super Field> fieldPredicate)
    {
        final ImmutableSet<JavaClass> classes= this.classes(classpath, classPredicate);

        final ImmutableSet.Builder<Field> fields= ImmutableSet.builder();

        for(final JavaClass clazz : classes)
        {
            fields.addAll(Iterables.filter(ImmutableList.copyOf(clazz.getFields()), fieldPredicate));
        }

        return fields.build();
    }

    @Override
    public ImmutableSet<Method> methods(Path classpath, Predicate<? super JavaClass> classPredicate, Predicate<? super Method> methodPredicate)
    {
        final ImmutableSet<JavaClass> classes= this.classes(classpath, classPredicate);

        final ImmutableSet.Builder<Method> methods= ImmutableSet.builder();

        for(final JavaClass clazz : classes)
        {
            methods.addAll(Iterables.filter(ImmutableList.copyOf(clazz.getMethods()), methodPredicate));
        }

        return methods.build();
    }

    @Override
    public ImmutableSet<String> packages(Path classpath, Predicate<? super String> predicate)
    {
        final ImmutableSet<JavaClass> classes= this.classes(classpath, Predicates.alwaysTrue());

        final ImmutableSet.Builder<String> packages= ImmutableSet.builder();

        for(final JavaClass clazz : classes)
        {
            packages.add(clazz.getPackageName());
        }

        return packages.build();
    }

    private ImmutableSet<JavaClass> restore(Path classpath) throws SQLException
    {
        try(final PreparedStatement stat= this.connection.prepareStatement("select data from repository where classpath = ?"))
        {
            stat.setString(1, classpath.toAbsolutePath().toString());

            stat.execute();

            try(final ResultSet rs= stat.getResultSet())
            {
                final ImmutableSet.Builder<JavaClass> classes= ImmutableSet.builder();

                while(rs.next())
                {
                    try(final ObjectInputStream istream= new ObjectInputStream(rs.getBinaryStream(1)))
                    {
                        classes.add((JavaClass)istream.readObject());
                    }
                    catch(Exception e)
                    {
                        throw new RuntimeException(e);
                    }
                }

                return classes.build();
            }
        }
    }

    private void store(Path classpath, Iterable<? extends JavaClass> classes) throws SQLException
    {
        try(final PreparedStatement stat= this.connection.prepareStatement("insert into repository (classpath, resource_name, class_name, data) values (?, ?, ?, ?)"))
        {
            for(final JavaClass clazz : classes)
            {
                stat.clearParameters();
                stat.setString(1, classpath.toAbsolutePath().toString());
                stat.setString(2, clazz.getFileName());
                stat.setString(3, clazz.getClassName());

                try(final ByteArrayOutputStream ostream= new ByteArrayOutputStream(); final ObjectOutputStream serializer= new ObjectOutputStream(ostream))
                {
                    serializer.writeObject(clazz);

                    stat.setBinaryStream(4, new ByteArrayInputStream(ostream.toByteArray()));
                }
                catch(IOException e)
                {
                    throw new RuntimeException(e);
                }

                stat.execute();
            }
        }
    }

    private Callable<ImmutableSet<JavaClass>> newLister(Path classpath)
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

    private static class ListJavaClassForDirectory implements Callable<ImmutableSet<JavaClass>>
    {
        public ListJavaClassForDirectory(Path directory)
        {
            this.directory= directory;
        }

        @Override
        public ImmutableSet<JavaClass> call() throws Exception
        {
            final File[] files= this.directory.toFile().listFiles(new FilenameFilter()
            {
                @Override
                public boolean accept(File dir, String name)
                {
                    return name.endsWith(".class");
                }
            });

            if(files == null)
            {
                logger.warn("something wrong, cannot list files for {}", this.directory);
                return ImmutableSet.of();
            }

            final ImmutableSet.Builder<JavaClass> classes= ImmutableSet.builder();

            for(final File file : files)
            {
                classes.add(new ClassParser(file.getAbsolutePath()).parse());
            }

            return classes.build();
        }

        private final Path directory;
    }

    private static class ListJavaClassForJar implements Callable<ImmutableSet<JavaClass>>
    {
        public ListJavaClassForJar(Path jarfile)
        {
            this.jarfile= jarfile;
        }

        @Override
        public ImmutableSet<JavaClass> call() throws Exception
        {
            final JarFile jar= new JarFile(this.jarfile.toFile());
            final Iterable<JarEntry> entries= Iterables.filter(Collections.list(jar.entries()), new Predicate<JarEntry>()
            {
                @Override
                public boolean apply(JarEntry input)
                {
                    return input.getName().endsWith(".class");
                }
            });

            final ImmutableSet.Builder<JavaClass> classes= ImmutableSet.builder();

            for(final JarEntry entry : entries)
            {
                try(final InputStream istream= jar.getInputStream(entry))
                {
                    classes.add(new ClassParser(istream, entry.getName()).parse());
                }
            }

            return classes.build();
        }

        private final Path jarfile;
    }

    private static final Logger logger= LoggerFactory.getLogger(DatabaseRepository.class);

    private final Connection connection;
}

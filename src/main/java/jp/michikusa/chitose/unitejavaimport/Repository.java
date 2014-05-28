package jp.michikusa.chitose.unitejavaimport;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheBuilderSpec;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.JavaClass;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

public final class Repository
{
    public static void addPath(File path)
    {
        checkNotNull(path);
        checkArgument(path.exists());

        paths.add(path);
    }

    public static void removePath(File path)
    {
        checkNotNull(path);

        paths.remove(path);
    }

    public static void clearPaths()
    {
        paths.clear();
    }

    public static ImmutableSet<File> paths()
    {
        return ImmutableSet.copyOf(paths);
    }

    /**
     * get {@link JavaClass} object.
     *
     * @param clazzname
     *            a canonical name of wanted class
     * @return {@link JavaClass} object
     * @throws NullPointerException
     *             when clazzname is null
     */
    public static JavaClass getJavaClass(final String clazzname)
    {
        checkNotNull(clazzname);

        try
        {
            return cache.get(clazzname, new Callable<JavaClass>(){
                @Override
                public JavaClass call() throws Exception
                {
                    return tryParse(clazzname);
                }
            });
        }
        catch(ExecutionException e)
        {
            throw new RuntimeException(e);
        }
    }

    private static JavaClass tryParse(String clazzname) throws ClassNotFoundException, IOException
    {
        final String resource_name= clazzname2ResourceName(clazzname);

        for(final File path : paths())
        {
            final JavaClass clazz= new ClassParser(path.getAbsolutePath(), resource_name).parse();

            if(clazz != null)
            {
                return clazz;
            }
        }

        throw new ClassNotFoundException();
    }

    private static String clazzname2ResourceName(String clazzname)
    {
        // TODO: support inner class
        return clazzname.replace('.', '/').concat(".class");
    }

    private Repository()
    {
        throw new AssertionError();
    }

    private static final Cache<String, JavaClass> cache= CacheBuilder
        .from(CacheBuilderSpec.disableCaching())
        .build()
    ;

    private static final Set<File> paths= Sets.newConcurrentHashSet();
}

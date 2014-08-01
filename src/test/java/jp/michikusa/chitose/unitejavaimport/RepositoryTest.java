package jp.michikusa.chitose.unitejavaimport;

import java.io.File;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.concurrent.TimeUnit;

import jp.michikusa.chitose.unitejavaimport.predicate.IsPublic;

import org.apache.bcel.classfile.JavaClass;
import org.junit.Test;

public class RepositoryTest
{
    @Test
    public void test()
    {
        for(final Path path : new Path[]{rt, guava})
        {
            final long startTime= System.nanoTime();

            final Repository repo= Repository.get();

            for(final String pkg : repo.packages(path))
            {
                System.out.println(pkg);
                System.out.flush();
            }

            final long endTime= System.nanoTime();

            System.out.println(path);
            System.out.println(NumberFormat.getNumberInstance().format(TimeUnit.NANOSECONDS.toMillis(endTime - startTime)) + " [ms]");
            System.out.println();
        }
    }

    static final Path rt= new File("C:/Users/USER1/Documents/apps/java7/jdk7u55.x64/jre/lib/rt.jar").toPath();

    static final Path guava= new File("C:/users/user1/.m2/repository/com/google/guava/guava/17.0/guava-17.0.jar").toPath();
}

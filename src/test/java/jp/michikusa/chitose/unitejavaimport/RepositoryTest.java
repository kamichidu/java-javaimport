package jp.michikusa.chitose.unitejavaimport;

import static com.google.common.base.Predicates.alwaysTrue;

import java.io.File;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class RepositoryTest
{
    @Test
    public void test()
    {
        for(final Path path : paths)
        {
            final long startTime= System.nanoTime();

            final Repository repo= Repository.get();

            for(final String pkg : repo.packages(path, alwaysTrue()))
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

    static final Path[] paths;
    static
    {
        final File javaHome= new File(System.getenv("JAVA_HOME"));

        paths= new Path[]{
            new File(javaHome, "jre/lib/rt.jar").toPath(),
            new File(javaHome, "lib/tools.jar").toPath(),
        };
    }
}

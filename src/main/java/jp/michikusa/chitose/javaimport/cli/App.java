package jp.michikusa.chitose.javaimport.cli;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import jp.michikusa.chitose.javaimport.analysis.ClassInfoAnalyzer;
import jp.michikusa.chitose.javaimport.analysis.PackageInfoAnalyzer;

import lombok.Getter;
import lombok.Setter;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.spi.FileOptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.google.common.collect.Iterables.*;

import static java.util.Arrays.asList;

public class App
{
    public static class AppOption
    {
        public Iterable<File> getJarpaths()
        {
            return asList(this.jarpaths);
        }

        public void setJarpaths(Iterable<? extends File> jarpaths)
        {
            this.jarpaths= asList(jarpaths).toArray(new File[0]);
        }

        @Getter @Setter
        @Option(name= "-o", aliases= "--outputdir", required= true, handler= FileOptionHandler.class, usage= "Output directory")
        private File dataDir;

        @Argument(required= true, multiValued= true, handler= FileOptionHandler.class, usage= "Jar paths")
        private File[] jarpaths;

        @Getter @Setter
        @Option(name= "-h", aliases= "--help", help= true, usage= "Print this message.")
        private boolean help;
    }

    public static void main(String[] args)
    {
        final AppOption option= new AppOption();
        final CmdLineParser parser= new CmdLineParser(option);

        try
        {
            parser.parseArgument(args);

            if(option.isHelp())
            {
                parser.printUsage(System.err);
                return;
            }

            logger.info("Start to analyze and emmit class information with {");
            logger.info("--datadir=`{}'", option.getDataDir());
            logger.info("--jarpaths=`{}'", option.getJarpaths());
            logger.info("}");
            final long startTime= System.nanoTime();
            new App(option).start();
            final long endTime= System.nanoTime();
            System.out.format("time required: %s [ms]",
                NumberFormat.getNumberInstance().format(TimeUnit.NANOSECONDS.toMillis(endTime - startTime))
            );
        }
        catch(CmdLineException e)
        {
            System.err.println(e.getMessage());
            parser.printUsage(System.err);
        }
        catch(Exception e)
        {
            logger.error("An exception occured.", e);
        }
    }

    public App(AppOption option)
    {
        this.option= option;
    }

    public void start()
    {
        final ExecutorService service= Executors.newCachedThreadPool();
        try
        {
            final List<Future<?>> tasks= new ArrayList<Future<?>>(size(this.option.getJarpaths()));
            for(final File jarpath : this.option.getJarpaths())
            {
                try
                {
                    logger.info("Push Analysis task for {}", jarpath);
                    tasks.add(service.submit(new PackageInfoAnalyzer(this.option.getDataDir(), jarpath)));
                    tasks.add(service.submit(new ClassInfoAnalyzer(this.option.getDataDir(), jarpath)));
                }
                catch(IOException e)
                {
                    logger.error("An exception occured during analyzing.", e);
                }
            }
            // stop tasking
            service.shutdown();
            // wait for task
            for(final Future<?> task : tasks)
            {
                task.get();
            }
        }
        catch(Exception e)
        {
            logger.error("An exception occured during some task", e);
        }
        finally
        {
            service.shutdownNow();
        }
    }

    private static final Logger logger= LoggerFactory.getLogger(App.class);

    private final AppOption option;
}
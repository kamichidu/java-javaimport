package jp.michikusa.chitose.javaimport.cli;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.concurrent.TimeUnit;

import jp.michikusa.chitose.javaimport.analysis.ClassInfoAnalyzer;

import lombok.Getter;
import lombok.Setter;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.spi.FileOptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
            for(final File jarpath : option.getJarpaths())
            {
                try
                {
                    logger.info("Analyze {}", jarpath);
                    new ClassInfoAnalyzer(option.getDataDir(), jarpath).run();
                }
                catch(IOException e)
                {
                    logger.error("An exception occured during analyzing.", e);
                }
            }
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

    private static final Logger logger= LoggerFactory.getLogger(App.class);
}

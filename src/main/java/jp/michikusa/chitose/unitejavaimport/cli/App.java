package jp.michikusa.chitose.unitejavaimport.cli;

import java.io.File;

import jp.michikusa.chitose.unitejavaimport.Dumper;
import jp.michikusa.chitose.unitejavaimport.ProcessOption;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * an entry point for cli inerface.
 *
 * @author kamichidu
 * @since  2014-05-23
 */
public class App
{
    public static void main(String[] args)
    {
        final CliOption option= new CliOption();
        final CmdLineParser parser= new CmdLineParser(option);
        try
        {
            parser.parseArgument(args);
        }
        catch(CmdLineException e)
        {
            e.printStackTrace();
            return;
        }

        try
        {
            final ProcessOption proc_opts= ProcessOption.builder()
                .packageName(option.packageName())
                .recursive(option.recursive())
                .path(ensureExists(option.path()))
                .debug(option.debug())
                .build()
            ;
            final Dumper dumper= new Dumper(proc_opts);

            for(final CharSequence clazzname : dumper.call())
            {
                System.out.println(clazzname);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static File ensureExists(String path)
    {
        checkNotNull(path);

        final File file= new File(path);

        if(!file.exists())
        {
            throw new IllegalArgumentException();
        }

        return file;
    }
}

package jp.michikusa.chitose.unitejavaimport.cli;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

import jp.michikusa.chitose.unitejavaimport.cli.command.CommandParser;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * an entry point for cli inerface.
 *
 * @author kamichidu
 * @since 2014-05-23
 */
public class App
{
    public App(InputStream istream, OutputStream ostream, OutputStream estream)
    {
        checkNotNull(istream);
        checkNotNull(ostream);
        checkNotNull(estream);

        this.istream= istream;
        this.ostream= ostream;
        this.estream= estream;
    }

    public App(InputStream istream, OutputStream ostream)
    {
        this(istream, ostream, ostream);
    }

    public void start() throws IOException
    {
        final BufferedReader reader= new BufferedReader(new InputStreamReader(this.istream));

        boolean alive= true;
        while(alive)
        {
            this.ostream.write(" > ".getBytes());
            final String line= reader.readLine();

            if(line == null)
            {
                break;
            }

            try
            {
                alive= this.processLine(line);
            }
            catch(Exception e)
            {
                e.printStackTrace(new PrintStream(this.estream));
            }
        }
    }

    /**
     * process line input
     *
     * @param input input string with a whole line
     * @return indicating process status, true is alive, false is dead.
     */
    private boolean processLine(String input) throws IOException
    {
        final String command_name;
        final ImmutableList<String> command_args;
        {
            final ImmutableList<String> parts= this.parseCommand(input);

            command_name= parts.get(0);
            command_args= parts.subList(1, parts.size());
        }

        final Command command= this.command_parser.findByName(command_name);

        if(command == null)
        {
            this.estream.write("no such command".getBytes());
            return true;
        }

        final Object option;
        {
            final Class<?> arg_clazz= command.argumentsClazz();

            if(arg_clazz != null)
            {
                try
                {
                    option= arg_clazz.newInstance();
                }
                catch(Exception e)
                {
                    throw new AssertionError("it cannot instanciate: " + arg_clazz.getCanonicalName());
                }
            }
            else
            {
                option= null;
            }
        }

        final CmdLineParser parser= new CmdLineParser(option);
        try
        {
            parser.parseArgument(command_args);
        }
        catch(CmdLineException e)
        {
            throw new IllegalArgumentException(e);
        }

        try
        {
            return command.exec(this.ostream, option);
        }
        catch(Exception e)
        {
            e.printStackTrace(new PrintStream(this.estream));
            return true;
        }
    }

    private ImmutableList<String> parseCommand(String input)
    {
        return ImmutableList.copyOf(
            Splitter.onPattern("\\s+")
                .omitEmptyStrings()
                .split(input)
        );
    }

    /** input stream */
    private final InputStream istream;

    /** standard output stream */
    private final OutputStream ostream;

    /** error output stream */
    private final OutputStream estream;

    private final CommandParser command_parser= new CommandParser();

    public static void main(String[] args)
    {
        final App app= new App(System.in, System.out, System.err);

        try
        {
            app.start();
        }
        catch(IOException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
    }
}

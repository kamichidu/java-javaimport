package jp.michikusa.chitose.unitejavaimport.cli;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

import jp.michikusa.chitose.unitejavaimport.cli.command.CommandParser;
import jp.michikusa.chitose.unitejavaimport.util.GenericOption;
import jp.michikusa.chitose.unitejavaimport.util.KeepAliveOutputStream;
import jp.michikusa.chitose.unitejavaimport.util.Pair;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

import static com.google.common.base.Objects.firstNonNull;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * An entry point for cli inerface.
 * 
 * @author kamichidu
 * @since 2014-05-23
 */
public class App
{
    public static void main(String[] args)
    {
        final CliOption option= new CliOption();
        try
        {
            final CmdLineParser parser= new CmdLineParser(option);

            parser.parseArgument(args);

            if(option.helpFlag())
            {
                parser.printUsage(System.out);
                return;
            }
        }
        catch(CmdLineException e)
        {
            e.printStackTrace();
            System.exit(1);
        }

        final App app= new App(option, System.in, System.out, System.err);

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

    public App(CliOption option, InputStream istream, OutputStream ostream, OutputStream estream)
    {
        checkNotNull(istream);
        checkNotNull(ostream);
        checkNotNull(estream);

        this.option= firstNonNull(option, new CliOption());
        this.istream= istream;
        this.ostream= ostream;
        this.estream= estream;
    }

    public App(CliOption option, InputStream istream, OutputStream ostream)
    {
        this(option, istream, ostream, ostream);
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
     * @param input
     *            input string with a whole line
     * @return indicating process status, true is alive, false is dead.
     */
    private boolean processLine(String input) throws IOException
    {
        final String commandName;
        final String[][] commandArgs;
        {
            final Pair<String, String[][]> parts= this.parseCommand(input);

            commandName= parts.first();
            commandArgs= parts.second();
        }

        final Command command= this.command_parser.findByName(commandName);

        if(command == null)
        {
            this.estream.write("no such command".getBytes());
            return true;
        }

        try(final OutputStream out= this.openOutputStreamForCommand())
        {
            return command.exec(out, new GenericOption(commandArgs));
        }
        catch(Exception e)
        {
            e.printStackTrace(new PrintStream(this.estream));
            return true;
        }
    }

    private OutputStream openOutputStreamForCommand() throws IOException
    {
        if(this.option.outputFile() == null)
        {
            return new KeepAliveOutputStream(this.ostream);
        }

        // open new file for appending mode
        return new FileOutputStream(this.option.outputFile(), true);
    }

    private Pair<String, String[][]> parseCommand(String input)
    {
        final String[] elements= input.split("(?:(?<!\\\\)\\s)+");

        if(elements.length == 0)
        {
            return Pair.of(null, new String[0][0]);
        }

        final String first= elements[0];
        final List<String[]> second= new LinkedList<>();

        for(int i= 1; i < elements.length; ++i)
        {
            if(elements[i].startsWith("--"))
            {
                // option with value
                if(i + 1 < elements.length && !elements[i + 1].startsWith("--"))
                {
                    second.add(new String[]{elements[i], elements[i + 1]});
                }
                // flag option
                else
                {
                    second.add(new String[]{elements[i]});
                }
            }
        }

        return Pair.of(first, second.toArray(new String[0][0]));
    }

    /** command line option */
    private final CliOption option;

    /** input stream */
    private final InputStream istream;

    /** standard output stream */
    private final OutputStream ostream;

    /** error output stream */
    private final OutputStream estream;

    private final CommandParser command_parser= new CommandParser();
}

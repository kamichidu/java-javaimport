package jp.michikusa.chitose.unitejavaimport.cli;

import org.kohsuke.args4j.Option;

/**
 * this is command line arguments.
 *
 * @author kamichidu
 * @since  2014-05-23
 */
public class CliOption
{
    public boolean helpFlag()
    {
        return this.help_flag;
    }

    public boolean debug()
    {
        return this.debug;
    }

    @Option(name= "-h", aliases= "--help", usage= "show this message")
    private boolean help_flag= false;

    @Option(name= "--debug", usage= "debug mode")
    private boolean debug= false;
}

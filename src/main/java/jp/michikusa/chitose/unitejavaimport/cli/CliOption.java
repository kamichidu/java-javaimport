package jp.michikusa.chitose.unitejavaimport.cli;

import java.io.File;

import org.kohsuke.args4j.Option;

/**
 * this is command line arguments.
 * 
 * @author kamichidu
 * @since 2014-05-23
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

    public File outputFile()
    {
        if(this.ofilename != null)
        {
            return new File(this.ofilename);
        }
        else
        {
            return null;
        }
    }

    @Option(name= "-h", aliases= "--help", usage= "show this message")
    private boolean help_flag= false;

    @Option(name= "--debug", usage= "debug mode")
    private boolean debug= false;

    @Option(name= "--ofile", usage= "output file, write to its file instead of stdout")
    private String ofilename;
}

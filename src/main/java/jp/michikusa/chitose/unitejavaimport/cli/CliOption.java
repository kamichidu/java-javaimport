package jp.michikusa.chitose.unitejavaimport.cli;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet;

import java.io.File;

import javax.tools.JavaFileManager;
import javax.tools.StandardLocation;

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

    public boolean recursive()
    {
        return this.recursive;
    }

    public String packageName()
    {
        return this.package_name;
    }

    public String path()
    {
        return this.path;
    }

    public boolean debug()
    {
        return this.debug;
    }

    @Option(name= "-h", aliases= "--help", usage= "show this message")
    private boolean help_flag= false;

    @Option(name= "-r", aliases= "--recurse", usage= "dump packages recursively (default: not recursive)")
    private boolean recursive= false;

    @Option(name= "-P", aliases= "--package", usage= "dump packages via (default: '')")
    private String package_name= "";

    @Option(name= "-p", aliases= "--path", usage= "process target classpath")
    private String path= "";

    @Option(name= "--debug", usage= "debug mode")
    private boolean debug= false;
}

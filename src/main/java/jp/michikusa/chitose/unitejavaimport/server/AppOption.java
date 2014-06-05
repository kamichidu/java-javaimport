package jp.michikusa.chitose.unitejavaimport.server;

import java.nio.file.Path;

import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.spi.PathOptionHandler;

public class AppOption
{
    public int portNumber()
    {
        return this.port;
    }

    public boolean debugMode()
    {
        return this.debug;
    }

    public Path lockfile()
    {
        return this.lockfile;
    }

    @Option(name= "--port", usage= "port number")
    private int port= 51234;

    @Option(name= "--lockfile", usage= "lockfile path", required= true, handler= PathOptionHandler.class)
    private Path lockfile;

    @Option(name= "--debug")
    private boolean debug;
}

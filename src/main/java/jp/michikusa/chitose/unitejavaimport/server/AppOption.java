package jp.michikusa.chitose.unitejavaimport.server;

import java.nio.file.Path;

import lombok.Getter;

import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.spi.PathOptionHandler;

public class AppOption
{
    @Option(name= "--port", usage= "port number")
    @Getter
    private int portNumber= 51234;

    @Option(name= "--lockfile", usage= "lockfile path", required= true, handler= PathOptionHandler.class)
    @Getter
    private Path lockfile;

    @Option(name= "--debug")
    @Getter
    private boolean debug;
}

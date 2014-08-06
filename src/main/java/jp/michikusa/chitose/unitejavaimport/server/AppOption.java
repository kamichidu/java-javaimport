package jp.michikusa.chitose.unitejavaimport.server;

import java.nio.file.Path;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.spi.PathOptionHandler;

public class AppOption
{
    @Option(name="--port", usage="port number")
    @Getter
    @Setter(value=AccessLevel.MODULE)
    private int portNumber= 51234;

    @Option(name="--lockfile", usage="lockfile path", required=true, handler=PathOptionHandler.class)
    @Getter
    @Setter(value=AccessLevel.MODULE)
    private Path lockfile;

    @Option(name="--debug")
    @Getter
    @Setter(value=AccessLevel.MODULE)
    private boolean debug;
}

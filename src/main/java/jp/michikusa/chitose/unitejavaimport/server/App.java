package jp.michikusa.chitose.unitejavaimport.server;

import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.net.InetSocketAddress;

import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.google.common.base.Preconditions.checkNotNull;

public class App
{
    public static void main(String[] args)
    {
        final AppOption option= new AppOption();
        final CmdLineParser parser= new CmdLineParser(option);

        try
        {
            parser.parseArgument(args);
        }
        catch(CmdLineException e)
        {
            parser.printUsage(System.out);
            return;
        }

        try
        {
            new App(option).launch();
        }
        catch(Throwable e)
        {
            logger.error("unexpectedly caught an error. terminating...", e);
        }
    }

    public App(AppOption option)
    {
        checkNotNull(option);

        this.option= option;
    }

    public void launch()
    {
        // check and touch lock file
        try
        {
            final File lockfile= this.option.getLockfile().toFile();
            if(lockfile.exists())
            {
                logger.info("lock file {} already exist. will not launch a server.", lockfile);
                return;
            }
            logger.info("lock file {} doesn't exist. will launch a server", lockfile);

            // create pid file
            final String pid= ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
            final File pidfile= new File(lockfile.getParent(), pid + ".server");
            if(pidfile.createNewFile())
            {
                pidfile.deleteOnExit();
                logger.info("{} will be deleted on shutdown this jvm", pidfile);
            }
            else
            {
                logger.info("pid file {} already exist. will not launch a server.", pidfile);
                return;
            }

            final IoAcceptor acceptor= new NioSocketAcceptor();

            acceptor.getFilterChain().addLast("logging", new LoggingFilter(App.class));
            acceptor.getFilterChain().addLast("codec", new ProtocolCodecFilter(JsonMessageEncoder.class, JsonMessageDecoder.class));
            acceptor.setHandler(new RequestHandler());

            logger.info("starting to bind a port {}...", this.option.getPortNumber());
            try
            {
                acceptor.bind(new InetSocketAddress(this.option.getPortNumber()));
                logger.info("binded a port {}.", this.option.getPortNumber());
            }
            catch(IOException e)
            {
                logger.error("bind failed.", e);
                acceptor.unbind();
                acceptor.dispose(true);
            }

            // binding port -> lockfile creation
            lockfile.createNewFile();
            lockfile.deleteOnExit();
            logger.info("{} will be deleted on shutdown this jvm.", lockfile);
        }
        catch(IOException e)
        {
            logger.error("unexpected exception occured.", e);
            return;
        }
    }

    private static final Logger logger= LoggerFactory.getLogger(App.class);

    private final AppOption option;
}

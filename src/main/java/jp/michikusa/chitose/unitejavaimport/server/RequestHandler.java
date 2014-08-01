package jp.michikusa.chitose.unitejavaimport.server;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Throwables.getStackTraceAsString;
import static com.google.common.collect.Maps.newHashMap;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Map;

import jp.michikusa.chitose.unitejavaimport.Repository;
import jp.michikusa.chitose.unitejavaimport.cli.command.List;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RequestHandler extends IoHandlerAdapter
{
    @Override
    public void exceptionCaught(IoSession session, Throwable cause) throws Exception
    {
        final Map<String, Object> response= newHashMap();

        response.put("error", getStackTraceAsString(cause));

        session.write(response);
        logger.error("error occured", cause);
    }

    @Override
    public void messageReceived(IoSession session, Object message)
    {
        checkArgument(message instanceof Request);

        final Request request= (Request)message;
        final Map<String, Object> response= newHashMap();

        if("list".equals(request.get(String.class, "command")))
        {
            final File path;
            {
                final String pathstr= request.get(String.class, "args", "path");

                path= new File(pathstr);
            }

            try(final ByteArrayOutputStream ostream= new ByteArrayOutputStream())
            {
//                Repository.clearPaths();
//                Repository.addPath(path);

                final List.Arguments args= new List.Arguments();

                {
                    final Field filter_public= args.getClass().getDeclaredField("filter_public");
                    filter_public.setAccessible(true);
                    filter_public.set(args, true);
                }
                {
                    final Field exclude_package= args.getClass().getDeclaredField("exclude_packages");
                    exclude_package.setAccessible(true);
                    exclude_package.set(args, new String[]{"java.lang", "com.oracle", "com.sun", "sun", "sunw"});
                }

                new List().exec(ostream, args);

                final String output= ostream.toString();

                response.put("result", output.split("\r?\n"));
            }
            catch(Exception e)
            {
                throw new RuntimeException(e);
            }
        }

        session.write(response);
        logger.info("message written", response);

        if(request.isQuitAfterResponse())
        {
            session.close(true);
            return;
        }
    }

    private static final Logger logger= LoggerFactory.getLogger(RequestHandler.class);
}

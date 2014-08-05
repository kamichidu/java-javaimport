package jp.michikusa.chitose.unitejavaimport.server;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import jp.michikusa.chitose.unitejavaimport.Repository;
import jp.michikusa.chitose.unitejavaimport.predicate.RegexMatch;
import jp.michikusa.chitose.unitejavaimport.predicate.IsPublic;
import jp.michikusa.chitose.unitejavaimport.predicate.StartsWithPackage;
import jp.michikusa.chitose.unitejavaimport.server.request.CommonRequest;
import jp.michikusa.chitose.unitejavaimport.server.request.PredicateRequest;

import org.apache.bcel.classfile.JavaClass;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Predicates.alwaysTrue;
import static com.google.common.base.Predicates.and;
import static com.google.common.base.Predicates.compose;
import static com.google.common.base.Predicates.not;
import static com.google.common.base.Throwables.getStackTraceAsString;
import static com.google.common.collect.Maps.newHashMap;

public class RequestHandler extends IoHandlerAdapter
{
    @Override
    public void exceptionCaught(IoSession session, Throwable cause) throws Exception
    {
        logger.error("error occured", cause);
        session.close(false);
    }

    @Override
    public void messageReceived(IoSession session, Object message)
    {
        checkArgument(message instanceof CommonRequest);

        final CommonRequest request= (CommonRequest)message;

        switch(request.getCommand())
        {
            case "packages":{
                final PredicateRequest predicateRequest= new PredicateRequest(request);
                final Set<String> pkgs= new LinkedHashSet<>();

                for(final String path : request.getPaths())
                {
                    for(final String pkg : Repository.get().packages(new File(path).toPath(), predicateRequest.getPackagePredicate()))
                    {
                        pkgs.add(pkg);

                        if(pkgs.size() >= MAX_RESULT_SIZE)
                        {
                            session.write(makeResponse("processing", request.getIdentifier(), pkgs));
                            logger.info("message written");
                            pkgs.clear();
                        }
                    }
                }

                session.write(makeResponse("finish", request.getIdentifier(), pkgs));
                logger.info("message written");
                break;
            }
            case "classes":{
                final PredicateRequest predicateRequest= new PredicateRequest(request);
                @SuppressWarnings("unchecked")
                final Predicate<? super JavaClass> predicate= and(
                    compose(predicateRequest.getPackagePredicate(), new Function<JavaClass, String>(){
                        @Override
                        public String apply(JavaClass input)
                        {
                            return input.getPackageName();
                        }
                    }),
                    predicateRequest.getModifierPredicate(),
                    predicateRequest.getClassnamePredicate()
                );

                final Set<Map<String, Object>> classes= new LinkedHashSet<>();

                for(final String path : request.getPaths())
                {
                    for(final JavaClass clazz : Repository.get().classes(new File(path).toPath(), predicate))
                    {
                        final Map<String, Object> info= newHashMap();

                        info.put("classname", clazz.getClassName().replace('$', '.'));
                        info.put("jar", path);

                        classes.add(info);

                        if(classes.size() >= MAX_RESULT_SIZE)
                        {
                            session.write(makeResponse("processing", request.getIdentifier(), classes));
                            logger.info("message written");
                            classes.clear();
                        }
                    }
                }

                session.write(makeResponse("finish", request.getIdentifier(), classes));
                logger.info("message written");
                break;
            }
            case "methods":
                break;
            case "fields":
                break;
            case "quit":{
                new Thread(){
                    @Override
                    public void run()
                    {
                        logger.info("terminating server...");
                        try
                        {
                            Thread.sleep(1000);
                        }
                        catch(InterruptedException e){}

                        System.exit(0);
                    }
                }.start();
                break;
            }
        }
    }

    private static Map<String, Object> makeResponse(String status, String identifier, Iterable<?> result)
    {
        return makeResponse(status, identifier, (Object)ImmutableList.copyOf(result));
    }

    private static Map<String, Object> makeResponse(String status, String identifier, Object result)
    {
        final Map<String, Object> response= newHashMap();

        response.put("identifier", identifier);
        response.put("status", status);
        response.put("result", result);

        return response;
    }

    private static final int MAX_RESULT_SIZE= 1000;

    private static final Logger logger= LoggerFactory.getLogger(RequestHandler.class);
}

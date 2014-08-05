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

import org.apache.bcel.classfile.JavaClass;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Predicates.alwaysTrue;
import static com.google.common.base.Predicates.and;
import static com.google.common.base.Predicates.not;
import static com.google.common.base.Throwables.getStackTraceAsString;
import static com.google.common.collect.Maps.newHashMap;

public class RequestHandler extends IoHandlerAdapter
{
    @Override
    public void exceptionCaught(IoSession session, Throwable cause) throws Exception
    {
        /* final Map<String, Object> response= newHashMap(); */
        /*  */
        /* response.put("error", getStackTraceAsString(cause)); */
        /*  */
        /* session.write(response); */
        logger.error("error occured", cause);
        session.close(false);
    }

    @Override
    public void messageReceived(IoSession session, Object message)
    {
        /* checkArgument(message instanceof Request); */
        checkArgument(message instanceof Map);

        /* final Request request= (Request)message; */
        @SuppressWarnings("unchecked")
        final Map<String, Object> request= (Map<String, Object>)message;
        final String command= (String)request.get("command");
        @SuppressWarnings("unchecked")
        final Iterable<String> paths= (Iterable<String>)request.get("classpath");
        final String identifier= (String)request.get("identifier");

        switch(command)
        {
            case "packages":{
                final Set<String> pkgs= new LinkedHashSet<>();

                for(final String path : paths)
                {
                    for(final String pkg : Repository.get().packages(new File(path).toPath(), alwaysTrue()))
                    {
                        pkgs.add(pkg);

                        if(pkgs.size() >= MAX_RESULT_SIZE)
                        {
                            session.write(makeResponse("processing", identifier, pkgs));
                            logger.info("message written");
                            pkgs.clear();
                        }
                    }
                }

                session.write(makeResponse("finish", identifier, pkgs));
                logger.info("message written");
                break;
            }
            case "classes":{
                final List<Predicate<? super JavaClass>> predicates= new LinkedList<>();
                if(request.containsKey("predicate"))
                {
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> predicate= (Map<String, Object>)request.get("predicate");

                    if(predicate.containsKey("classname"))
                    {
                        @SuppressWarnings("unchecked")
                        final Map<String, String> regex= (Map<String, String>)predicate.get("classname");

                        predicates.add(makeRegex(regex, new Function<JavaClass, String>(){
                            @Override
                            public String apply(JavaClass input)
                            {
                                return input.getClassName().replace('$', '.');
                            }
                        }));
                    }
                    if(predicate.containsKey("modifiers"))
                    {
                        @SuppressWarnings("unchecked")
                        final Iterable<String> modifiers= (Iterable<String>)predicate.get("modifiers");

                        for(final String modifier : modifiers)
                        {
                            switch(modifier)
                            {
                                case "public":
                                    predicates.add(new IsPublic());
                                    break;
                            }
                        }
                    }
                    if(predicate.containsKey("exclude_packages"))
                    {
                        @SuppressWarnings("unchecked")
                        final Iterable<String> excludes= (Iterable<String>)predicate.get("exclude_packages");

                        for(final String exclude : excludes)
                        {
                            logger.info("will exclude package {}", exclude);
                            predicates.add(not(new StartsWithPackage(exclude)));
                        }
                    }
                }
                final Predicate<JavaClass> predicate= predicates.isEmpty() ? Predicates.<JavaClass>alwaysTrue() : and(predicates);

                final Set<Map<String, Object>> classes= new LinkedHashSet<>();

                for(final String path : paths)
                {
                    for(final JavaClass clazz : Repository.get().classes(new File(path).toPath(), predicate))
                    {
                        final Map<String, Object> info= newHashMap();

                        info.put("classname", clazz.getClassName().replace('$', '.'));
                        info.put("jar", path);

                        classes.add(info);

                        if(classes.size() >= MAX_RESULT_SIZE)
                        {
                            session.write(makeResponse("processing", identifier, classes));
                            logger.info("message written");
                            classes.clear();
                        }
                    }
                }

                session.write(makeResponse("finish" ,identifier, classes));
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

    private static <E> Predicate<E> makeRegex(Map<? super String, ? extends String> regex, Function<E, ? extends String> stringify)
    {
        final String pattern= regex.get("regex");
        final String type= regex.get("type");

        switch(type)
        {
            case "inclusive":
                return new RegexMatch(Pattern.compile(pattern), stringify);
            case "exclusive":
                return not(new RegexMatch(Pattern.compile(pattern), stringify));
            default:
                throw new IllegalArgumentException("Malformed Regex Object");
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

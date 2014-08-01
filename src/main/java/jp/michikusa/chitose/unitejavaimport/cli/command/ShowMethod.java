package jp.michikusa.chitose.unitejavaimport.cli.command;

import com.google.common.base.Predicate;

import java.io.OutputStream;

import jp.michikusa.chitose.unitejavaimport.Repository;
import jp.michikusa.chitose.unitejavaimport.cli.Command;
import jp.michikusa.chitose.unitejavaimport.predicate.IsInitializer;
import jp.michikusa.chitose.unitejavaimport.predicate.IsPublic;
import jp.michikusa.chitose.unitejavaimport.predicate.IsStatic;

import org.apache.bcel.classfile.Method;
import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;

import static com.google.common.base.Predicates.and;
import static com.google.common.base.Predicates.not;

public class ShowMethod implements Command
{
    public static class Arguments
    {
        @Argument(index= 0, required= true)
        String clazzname;

        @Option(name= "--static")
        boolean filter_static;

        @Option(name= "--public")
        boolean filter_public;
    }

    @Override
    public Class<?> argumentsClazz()
    {
        return Arguments.class;
    }

    @Override
    public boolean exec(OutputStream ostream, Object option) throws Exception
    {
        final Arguments args= (Arguments)option;

        Predicate<? super Method> predicate= and(not(new IsInitializer()), not(new IsInitializer()));

        if(args.filter_static)
        {
            predicate= and(predicate, new IsStatic());
        }
        if(args.filter_public)
        {
            predicate= and(predicate, new IsPublic());
        }

//        final Iterable<Method> methods= Repository.getMethods(args.clazzname, predicate);
//
//        for(final Method method : methods)
//        {
//            ostream.write(method.getName().getBytes());
//            ostream.write("\n".getBytes());
//        }

        return true;
    }
}

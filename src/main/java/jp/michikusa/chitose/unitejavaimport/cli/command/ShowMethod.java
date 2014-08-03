package jp.michikusa.chitose.unitejavaimport.cli.command;

import com.google.common.base.Predicate;

import java.io.OutputStream;

import jp.michikusa.chitose.unitejavaimport.Repository;
import jp.michikusa.chitose.unitejavaimport.cli.Command;
import jp.michikusa.chitose.unitejavaimport.predicate.IsInitializer;
import jp.michikusa.chitose.unitejavaimport.predicate.IsPublic;
import jp.michikusa.chitose.unitejavaimport.predicate.IsStatic;
import jp.michikusa.chitose.unitejavaimport.util.GenericOption;

import org.apache.bcel.classfile.Method;
import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;

import static com.google.common.base.Predicates.and;
import static com.google.common.base.Predicates.not;

public class ShowMethod implements Command
{
    @Override
    public boolean exec(OutputStream ostream, GenericOption option) throws Exception
    {
        Predicate<? super Method> predicate= and(not(new IsInitializer()), not(new IsInitializer()));

        if(option.isFlagged("--static"))
        {
            predicate= and(predicate, new IsStatic());
        }
        if(option.isFlagged("--public"))
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

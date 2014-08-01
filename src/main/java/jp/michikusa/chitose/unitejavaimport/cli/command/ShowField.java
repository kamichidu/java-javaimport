package jp.michikusa.chitose.unitejavaimport.cli.command;

import com.google.common.base.Predicate;

import java.io.OutputStream;

import jp.michikusa.chitose.unitejavaimport.Repository;
import jp.michikusa.chitose.unitejavaimport.cli.Command;
import jp.michikusa.chitose.unitejavaimport.predicate.IsPublic;
import jp.michikusa.chitose.unitejavaimport.predicate.IsStatic;

import org.apache.bcel.classfile.Field;
import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;

import static com.google.common.base.Predicates.alwaysTrue;
import static com.google.common.base.Predicates.and;

public class ShowField implements Command
{
    public static class Arguments
    {
        @Argument(index= 0, required= true)
        String clazzname;

        @Option(name= "--static")
        boolean static_field;

        @Option(name= "--public")
        boolean public_field;
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

        Predicate<? super Field> predicate= alwaysTrue();

        if(args.static_field)
        {
            predicate= and(predicate, new IsPublic());
        }
        if(args.public_field)
        {
            predicate= and(predicate, new IsStatic());
        }

//        final Iterable<Field> fields= Repository.getFields(args.clazzname, predicate);

//        for(final Field field : fields)
//        {
//            ostream.write(field.getName().getBytes());
//            ostream.write("\n".getBytes());
//        }

        return true;
    }
}

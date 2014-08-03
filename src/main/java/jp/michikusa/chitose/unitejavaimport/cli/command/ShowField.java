package jp.michikusa.chitose.unitejavaimport.cli.command;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

import java.io.File;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.Arrays;

import jp.michikusa.chitose.unitejavaimport.Repository;
import jp.michikusa.chitose.unitejavaimport.cli.Command;
import jp.michikusa.chitose.unitejavaimport.predicate.IsPublic;
import jp.michikusa.chitose.unitejavaimport.predicate.IsStatic;
import jp.michikusa.chitose.unitejavaimport.util.GenericOption;

import org.apache.bcel.classfile.Field;
import org.apache.bcel.classfile.JavaClass;

import static com.google.common.base.Predicates.alwaysTrue;
import static com.google.common.base.Predicates.and;
import static com.google.common.collect.Iterables.transform;

public class ShowField implements Command
{
    @Override
    public boolean exec(OutputStream ostream, GenericOption option) throws Exception
    {
        Predicate<? super Field> predicate= alwaysTrue();

        if(option.isFlagged("--public"))
        {
            predicate= and(predicate, new IsPublic());
        }
        if(option.isFlagged("--static"))
        {
            predicate= and(predicate, new IsStatic());
        }

        final Repository repo= Repository.get();
        final Iterable<Path> paths= transform(Arrays.asList(option.arrayValue("--jar")), new Function<String, Path>(){
            @Override
            public Path apply(String input)
            {
                return new File(input).toPath();
            }
        });

        final String classname= option.value("--class");
        final Predicate<JavaClass> matchClass= new Predicate<JavaClass>(){
            @Override
            public boolean apply(JavaClass input)
            {
                return input.getClassName().endsWith(classname);
            }
        };

        for(final Path path : paths)
        {
            for(final Field field : repo.fields(path, matchClass, predicate))
            {
                ostream.write(field.getName().getBytes());
                ostream.write("\n".getBytes());
            }
        }

        return true;
    }
}

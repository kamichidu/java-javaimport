package jp.michikusa.chitose.unitejavaimport.cli.command;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;

import java.io.File;
import java.io.OutputStream;
import java.util.Arrays;

import jp.michikusa.chitose.unitejavaimport.Repository;
import jp.michikusa.chitose.unitejavaimport.cli.Command;

import org.kohsuke.args4j.Argument;

public class Path implements Command
{
    public static final class Arguments
    {
        @Argument(index= 0, required= true, metaVar= "action")
        String action;

        @Argument(index= 1, multiValued= true, metaVar= "path...")
        String[] paths= new String[0];
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

        final Iterable<File> paths= Iterables.transform(Arrays.asList(args.paths), new Function<String, File>(){
            @Override
            public File apply(String input)
            {
                return new File(input);
            }
        });

        if(args.action.equals("add"))
        {
            for(final File path : paths)
            {
                Repository.addPath(path);
            }
        }
        else if(args.action.equals("rm"))
        {
            for(final File path : paths)
            {
                Repository.removePath(path);
            }
        }
        else if(args.action.equals("show"))
        {
            for(final File path : Repository.paths())
            {
                ostream.write(path.getAbsolutePath().getBytes());
                ostream.write("\n".getBytes());
            }
        }
        else if(args.action.equals("clear"))
        {
            Repository.clearPaths();
        }
        else
        {
            throw new IllegalArgumentException();
        }

        return true;
    }
}

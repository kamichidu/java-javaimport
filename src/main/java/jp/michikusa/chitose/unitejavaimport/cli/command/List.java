package jp.michikusa.chitose.unitejavaimport.cli.command;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import jp.michikusa.chitose.unitejavaimport.Repository;
import jp.michikusa.chitose.unitejavaimport.cli.Command;
import jp.michikusa.chitose.unitejavaimport.predicate.IsPublic;

import org.apache.bcel.classfile.ClassFormatException;
import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.JavaClass;
import org.kohsuke.args4j.Option;

import static com.google.common.base.Predicates.alwaysTrue;
import static com.google.common.base.Predicates.and;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.transform;

public class List implements Command
{
    public static final class Arguments
    {
        @Option(name= "--public")
        boolean filter_public;
    }

    @Override
    public Class<?> argumentsClazz()
    {
        return Arguments.class;
    }

    @Override
    public boolean exec(OutputStream ostream, Object option) throws ZipException, IOException
    {
        final Arguments args= (Arguments)option;

        Predicate<? super JavaClass> predicate= alwaysTrue();

        if(args.filter_public)
        {
            predicate= and(predicate, new IsPublic());
        }

        final BufferedWriter writer= new BufferedWriter(new OutputStreamWriter(ostream));
        for(final File path : Repository.paths())
        {
            for(final JavaClass clazz : filter(this.list(path), predicate))
            {
                writer.write(clazz.getClassName());
                writer.write(System.getProperty("line.separator"));
            }
        }
        writer.flush();

        return true;
    }

    private Iterable<JavaClass> list(File path) throws IOException
    {
        final ZipFile zip_file= new ZipFile(path);
        final Iterable<? extends ZipEntry> entries= filter(Collections.list(zip_file.entries()), new Predicate<ZipEntry>(){
            @Override
            public boolean apply(ZipEntry input)
            {
                return input.getName().endsWith(".class");
            }
        });

        return transform(entries, new Function<ZipEntry, JavaClass>(){
            @Override
            public JavaClass apply(ZipEntry input)
            {
                try
                {
                    return new ClassParser(zip_file.getInputStream(input), input.getName()).parse();
                }
                catch(ClassFormatException e)
                {
                    throw new RuntimeException(e);
                }
                catch(IOException e)
                {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}

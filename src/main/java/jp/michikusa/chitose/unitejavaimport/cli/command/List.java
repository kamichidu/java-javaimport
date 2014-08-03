package jp.michikusa.chitose.unitejavaimport.cli.command;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import jp.michikusa.chitose.unitejavaimport.Repository;
import jp.michikusa.chitose.unitejavaimport.cli.Command;
import jp.michikusa.chitose.unitejavaimport.predicate.IsPublic;
import jp.michikusa.chitose.unitejavaimport.predicate.StartsWithPackage;
import jp.michikusa.chitose.unitejavaimport.util.GenericOption;
import jp.michikusa.chitose.unitejavaimport.util.KeepAliveOutputStream;

import lombok.Getter;

import org.apache.bcel.classfile.ClassFormatException;
import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.JavaClass;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.OptionDef;
import org.kohsuke.args4j.spi.DelimitedOptionHandler;
import org.kohsuke.args4j.spi.OneArgumentOptionHandler;
import org.kohsuke.args4j.spi.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.google.common.base.Predicates.alwaysTrue;
import static com.google.common.base.Predicates.and;
import static com.google.common.base.Predicates.not;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.transform;

public class List implements Command
{
    @Override
    public boolean exec(OutputStream ostream, GenericOption option) throws ZipException, IOException
    {
        Predicate<? super JavaClass> predicate= alwaysTrue();

        if(option.isFlagged("--public"))
        {
            predicate= and(predicate, new IsPublic());
        }

        final String[] excludes= option.arrayValue("--exclude_packages");
        for(final String exclude : excludes)
        {
            logger.info("exclude package `{}'", exclude);

            predicate= and(predicate, not(new StartsWithPackage(exclude)));
        }

        final Repository repo= Repository.get();
        final Iterable<Path> paths= transform(Arrays.asList(option.arrayValue("--jar")), new Function<String, Path>(){
            @Override
            public Path apply(String input)
            {
                return new File(input).toPath();
            }
        });

        final java.util.List<Iterable<JavaClass>> classes= new LinkedList<>();

        for(final Path path : paths)
        {
            classes.add(repo.classes(path, predicate));
        }

        try(final BufferedWriter writer= new BufferedWriter(new OutputStreamWriter(new KeepAliveOutputStream(ostream))))
        {
            for(final Iterable<JavaClass> result : classes)
            {
                for(final JavaClass clazz : result)
                {
                    writer.write(clazz.getClassName());
                    writer.write(System.getProperty("line.separator"));
                    writer.flush();
                }
            }
        }

        return true;
    }

    private static final Logger logger= LoggerFactory.getLogger(List.class);
}

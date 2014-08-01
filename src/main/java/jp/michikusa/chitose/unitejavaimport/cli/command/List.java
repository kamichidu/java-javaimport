package jp.michikusa.chitose.unitejavaimport.cli.command;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;

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

import static com.google.common.base.Predicates.alwaysTrue;
import static com.google.common.base.Predicates.and;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.transform;

public class List implements Command
{
    public static final class Arguments
    {
        @Option(name= "--public")
        @Getter
        @lombok.Setter
        boolean filterPublic;

        @Option(name= "--exclude_package", handler= StringSetOptionHandler.class, metaVar= "packagename+", usage= "specify exclude package names")
        @Getter
        @lombok.Setter
        String[] excludePackages= new String[0];
    }

    public static final class StringSetOptionHandler extends DelimitedOptionHandler<String>
    {
        public StringSetOptionHandler(CmdLineParser parser, OptionDef option, Setter<? super String> setter)
        {
            super(parser, option, setter, ",", new StringOneArgumentOptionHandler(parser, option, setter));
        }
    }

    public static final class StringOneArgumentOptionHandler extends OneArgumentOptionHandler<String>
    {
        public StringOneArgumentOptionHandler(CmdLineParser parser, OptionDef option, Setter<? super String> setter)
        {
            super(parser, option, setter);
        }

        @Override
        protected String parse(String argument) throws NumberFormatException, CmdLineException
        {
            return argument;
        }
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

        if(args.filterPublic)
        {
            predicate= and(predicate, new IsPublic());
        }

        final BufferedWriter writer= new BufferedWriter(new OutputStreamWriter(ostream));
        // for(final File path : Repository.paths())
        // {
        // for(final JavaClass clazz : filter(this.list(path, args), predicate))
        // {
        // writer.write(clazz.getClassName());
        // writer.write(System.getProperty("line.separator"));
        // }
        // }
        writer.flush();

        return true;
    }

    private Iterable<JavaClass> list(File path, Arguments args) throws IOException
    {
        Predicate<ZipEntry> predicate= new Predicate<ZipEntry>()
        {
            @Override
            public boolean apply(ZipEntry input)
            {
                return input.getName().endsWith(".class");
            }
        };

        if(args.excludePackages.length > 0)
        {
            final ImmutableSet<String> exclude_prefixes;
            {
                final ImmutableSet.Builder<String> builder= ImmutableSet.builder();

                for(final String exclude_package : args.excludePackages)
                {
                    // com.sun => com/sun/
                    // com.sun. => error
                    if(exclude_package.endsWith("."))
                    {
                        throw new IllegalArgumentException("package name cannot ends with '.'");
                    }
                    builder.add(exclude_package.replace('.', '/').concat("/"));
                }

                exclude_prefixes= builder.build();
            }
            predicate= and(predicate, new Predicate<ZipEntry>()
            {
                @Override
                public boolean apply(ZipEntry input)
                {
                    for(final String prefix : exclude_prefixes)
                    {
                        if(input.getName().startsWith(prefix))
                        {
                            return false;
                        }
                    }
                    return true;
                }
            });
        }

        final ZipFile zip_file= new ZipFile(path);
        final Iterable<? extends ZipEntry> entries= filter(Collections.list(zip_file.entries()), predicate);

        return transform(entries, new Function<ZipEntry, JavaClass>()
        {
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

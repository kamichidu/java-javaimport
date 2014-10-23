package jp.michikusa.chitose.javaimport.analysis;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Sets;
import com.google.common.io.Closer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import jp.michikusa.chitose.javaimport.predicate.IsAnonymouseClass;
import jp.michikusa.chitose.javaimport.predicate.IsClassFile;
import jp.michikusa.chitose.javaimport.predicate.IsPackageInfo;
import jp.michikusa.chitose.javaimport.util.FileSystem;
import jp.michikusa.chitose.javaimport.util.FileSystem.Path;
import jp.michikusa.chitose.javaimport.util.LangSpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.google.common.base.Predicates.and;
import static com.google.common.base.Predicates.containsPattern;
import static com.google.common.base.Predicates.not;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.transform;

public class PackageInfoAnalyzer
    extends AbstractAnalyzer
{
    public PackageInfoAnalyzer(File outputDir, File path)
        throws IOException
    {
        super(new File(toOutputDirectory(outputDir, path), "packages"));

        this.fs= FileSystem.create(path);
    }

    @Override
    public void runImpl(File outfile)
    {
        final Closer closer= Closer.create();
        try
        {
            @SuppressWarnings("unchecked")
            final Predicate<Path> predicate= and(
                new IsClassFile(),
                not(new IsPackageInfo()),
                not(new IsAnonymouseClass())
            );
            final Iterable<CharSequence> pkgs= filter(
                transform(this.fs.listFiles(predicate), new PathToPackage()),
                not(containsPattern("^META-INF"))
            );
            final FileOutputStream out= closer.register(new FileOutputStream(outfile));
            final JsonGenerator g= closer.register(new JsonFactory().createGenerator(out));

            g.writeStartArray();
            for(final CharSequence pkg : Sets.newHashSet(pkgs))
            {
                if(!"".equals(pkg))
                {
                    g.writeString(pkg.toString());
                }
            }
            g.writeEndArray();
        }
        catch(IOException e)
        {
            logger.error("An exception occured during making package info.", e);
        }
        finally
        {
            try
            {
                closer.close();
            }
            catch(IOException e)
            {
                throw new RuntimeException(e);
            }
        }
    }

    private static class PathToPackage
        implements Function<Path, CharSequence>
    {
        @Override
        public CharSequence apply(Path input)
        {
            final CharSequence parent= input.getParent();

            if(parent != null)
            {
                return LangSpec.packageFromPath(parent);
            }
            else
            {
                return "";
            }
        }
    }

    private static final Logger logger= LoggerFactory.getLogger(PackageInfoAnalyzer.class);

    private final FileSystem fs;
}

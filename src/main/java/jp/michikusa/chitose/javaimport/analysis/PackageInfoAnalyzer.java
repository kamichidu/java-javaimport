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
import java.util.Collections;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import jp.michikusa.chitose.javaimport.predicate.IsAnonymouseClass;
import jp.michikusa.chitose.javaimport.predicate.IsClassFile;
import jp.michikusa.chitose.javaimport.predicate.IsPackageInfo;
import jp.michikusa.chitose.javaimport.util.LangSpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.google.common.base.Predicates.*;
import static com.google.common.collect.Iterables.*;

public class PackageInfoAnalyzer
    extends AbstractAnalyzer
{
    public PackageInfoAnalyzer(File outputDir, File jarpath)
        throws IOException
    {
        super(new File(new File(outputDir, jarpath.getName()), "packages"));

        this.jar= new JarFile(jarpath);
    }

    @Override
    public void runImpl(File outfile)
    {
        final Closer closer= Closer.create();
        try
        {
            @SuppressWarnings("unchecked")
            final Predicate<JarEntry> predicate= and(
                IsClassFile.forJarEntry(),
                not(IsPackageInfo.forJarEntry()),
                not(IsAnonymouseClass.forJarEntry())
            );
            final Iterable<CharSequence> pkgs= filter(
                transform(filter(Collections.list(this.jar.entries()), predicate), new JarEntryToPackageName()),
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

    private static class JarEntryToPackageName
        implements Function<JarEntry, CharSequence>
    {
        @Override
        public CharSequence apply(JarEntry input)
        {
            final File file= new File(input.getName());
            if(file.getParent() != null)
            {
                return LangSpec.packageFromPath(file.getParent());
            }
            else
            {
                return "";
            }
        }
    }

    private static final Logger logger= LoggerFactory.getLogger(PackageInfoAnalyzer.class);

    private final JarFile jar;
}

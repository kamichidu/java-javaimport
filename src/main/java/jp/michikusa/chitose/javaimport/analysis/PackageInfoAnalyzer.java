package jp.michikusa.chitose.javaimport.analysis;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.google.common.base.Function;
import com.google.common.collect.Sets;
import com.google.common.io.Closer;
import com.google.common.io.Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.google.common.base.Predicates.*;
import static com.google.common.collect.Iterables.*;

public class PackageInfoAnalyzer
    implements Runnable
{
    public PackageInfoAnalyzer(File outputDir, File jarpath)
        throws IOException
    {
        this.outputDir= new File(outputDir, jarpath.getName());
        this.jar= new JarFile(jarpath);
    }

    @Override
    public void run()
    {
        final Closer closer= Closer.create();
        File outfile= null;
        final File releasefile= new File(this.outputDir, "packages");
        try
        {
            final Iterable<CharSequence> pkgs= filter(
                transform(Collections.list(this.jar.entries()), new JarEntryToPackageName()),
                not(containsPattern("^META-INF"))
            );
            outfile= File.createTempFile("javaimport", "tmp");
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
        logger.debug("outfile={}", outfile);
        logger.debug("outfile.canRead()={}", outfile != null ? outfile.canRead() : "false");
        logger.debug("releasefile={}", releasefile);
        logger.debug("releasefile.exists()={}", releasefile != null ? releasefile.exists() : "false");
        logger.debug("releasefile.canWrite()={}", releasefile != null ? releasefile.canWrite() : "false");
        if(outfile != null && outfile.canRead() && !releasefile.exists())
        {
            try
            {
                Files.move(outfile, releasefile);
            }
            catch(IOException e)
            {
                logger.error("An exception occured during releasing packages file.", e);
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
                return file.getParent().replace('/', '.');
            }
            else
            {
                return "";
            }
        }
    }

    private static final Logger logger= LoggerFactory.getLogger(PackageInfoAnalyzer.class);

    private final File outputDir;

    private final JarFile jar;
}

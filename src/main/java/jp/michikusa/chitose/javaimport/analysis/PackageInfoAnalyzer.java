package jp.michikusa.chitose.javaimport.analysis;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.google.common.base.Function;
import com.google.common.collect.Sets;
import com.google.common.io.Closer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
        try
        {
            final Iterable<CharSequence> pkgs= transform(Collections.list(this.jar.entries()), new Function<JarEntry, CharSequence>(){
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
            });
            final File outfile= new File(this.outputDir, "packages");
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

    private static final Logger logger= LoggerFactory.getLogger(PackageInfoAnalyzer.class);

    private final File outputDir;

    private final JarFile jar;
}
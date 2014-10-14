package jp.michikusa.chitose.javaimport.analysis;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract class AbstractAnalyzer
    implements Runnable
{
    public AbstractAnalyzer(File releasefile)
    {
        this.releasefile= releasefile;
    }

    @Override
    public final void run()
    {
        File outfile= null;
        try
        {
            outfile= File.createTempFile("javaimport", "tmp");

            this.runImpl(outfile);
        }
        catch(IOException e)
        {
            logger.error("Got an error.", e);
        }
        finally
        {
            logger.debug("outfile={}", outfile);
            logger.debug("outfile.canRead()={}", outfile != null ? outfile.canRead() : "false");
            logger.debug("releasefile={}", releasefile);
            logger.debug("releasefile.exists()={}", releasefile != null ? releasefile.exists() : "false");
            logger.debug("releasefile.canWrite()={}", releasefile != null ? releasefile.canWrite() : "false");
            if(outfile != null && outfile.canRead() && !this.releasefile.exists())
            {
                try
                {
                    logger.debug("releasefile.getParentFile()={}", this.releasefile.getParentFile());
                    logger.debug("releasefile.getParentFile().exists()={}", this.releasefile.getParentFile().exists());
                    if(!this.releasefile.getParentFile().exists())
                    {
                        logger.debug("releasefile.getParentFile().mkdirs()");
                        this.releasefile.getParentFile().mkdirs();
                    }

                    Files.move(outfile, this.releasefile);
                }
                catch(IOException e)
                {
                    logger.error("Cannot move `{}' to `{}'.", outfile, this.releasefile);
                    logger.error("by given error.", e);
                }
            }
            if(outfile != null && outfile.exists())
            {
                if(!outfile.delete())
                {
                    logger.warn("Cannot delete `{}'.", outfile);
                }
            }
        }
    }

    protected abstract void runImpl(File outfile) throws IOException;

    private static final Logger logger= LoggerFactory.getLogger(AbstractAnalyzer.class);

    private final File releasefile;
}

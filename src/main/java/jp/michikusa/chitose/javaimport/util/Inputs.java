package jp.michikusa.chitose.javaimport.util;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Inputs
{
    public static Future<CharSequence> readAll(InputStream in)
    {
        final InputStreamReader reader= new InputStreamReader(in, Charset.defaultCharset());
        final ExecutorService service= Executors.newCachedThreadPool();
        return service.submit(new Callable<CharSequence>(){
            public CharSequence call()
                throws Exception
            {
                try
                {
                    final StringBuilder buffer= new StringBuilder();
                    while(true)
                    {
                        final int ch= reader.read();

                        if(ch == -1)
                        {
                            break;
                        }

                        buffer.append((char)ch);
                    }
                    return buffer;
                }
                finally
                {
                    try
                    {
                        service.shutdown();
                        if(!service.awaitTermination(100, TimeUnit.MILLISECONDS))
                        {
                            service.shutdownNow();
                        }
                    }
                    catch(InterruptedException e2)
                    {
                        service.shutdownNow();
                    }
                }
            }
        });
    }

    private Inputs()
    {
        throw new AssertionError();
    }
}

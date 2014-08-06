package jp.michikusa.chitose.unitejavaimport.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class KeepAliveInputStream extends FilterInputStream
{
    public KeepAliveInputStream(InputStream in)
    {
        super(in);
    }

    @Override
    public void close() throws IOException
    {
    }
}

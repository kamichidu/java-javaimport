package jp.michikusa.chitose.unitejavaimport.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class KeepAliveOutputStream extends FilterOutputStream
{
    public KeepAliveOutputStream(OutputStream out)
    {
        super(out);
    }

    @Override
    public void close() throws IOException
    {
    }
}

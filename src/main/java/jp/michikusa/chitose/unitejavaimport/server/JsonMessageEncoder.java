package jp.michikusa.chitose.unitejavaimport.server;

import static com.google.common.base.Preconditions.checkArgument;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;

import net.arnx.jsonic.JSON;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoder;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;

public class JsonMessageEncoder implements ProtocolEncoder
{
    @Override
    public void encode(IoSession session, Object message, ProtocolEncoderOutput out) throws Exception
    {
        checkArgument(!session.isClosing());
        checkArgument(message instanceof Map);

        final String json= JSON.encode(message);
        final IoBuffer buffer= IoBuffer.allocate(4 * 1024).setAutoExpand(true);

        buffer.putString(String.format("%08x%s", json.length(), json), this.encoder);
        buffer.flip();

        out.write(buffer);
        out.flush();
    }

    @Override
    public void dispose(IoSession session) throws Exception
    {
    }

    private final CharsetEncoder encoder= Charset.defaultCharset().newEncoder();
}

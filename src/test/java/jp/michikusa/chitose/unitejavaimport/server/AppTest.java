package jp.michikusa.chitose.unitejavaimport.server;

import static com.google.common.collect.Iterables.isEmpty;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import net.arnx.jsonic.JSON;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest
{
    @BeforeClass
    public static void setup()
    {
        final AppOption opt= new AppOption();

        opt.setPortNumber(TestSocket.PORT_NUMBER);
        opt.setLockfile(lockfile.toPath());

        new App(opt).launch();
    }

    @AfterClass
    public static void cleanup()
    {
    }

    @Test(expected= EOFException.class)
    public void missingIdentifier() throws Exception
    {
        try(final TestSocket socket= new TestSocket())
        {
            final Map<String, Object> request= new HashMap<>();

            request.put("command", "packages");
            request.put("classpath", emptyList());

            socket.write(request);

            @SuppressWarnings("unused")
            final Map<String, Object> response= socket.read();
        }
    }

    @Test
    public void missingClasspath() throws Exception
    {
        try(final TestSocket socket= new TestSocket())
        {
            final Map<String, Object> request= new HashMap<>();

            request.put("identifier", "hoge");
            request.put("command", "packages");

            socket.write(request);

            final Map<String, Object> response= socket.read();

            assertEquals(response.get("identifier"), "hoge");
            assertTrue(response.get("result") instanceof Iterable);

            final Iterable<?> result= (Iterable<?>)response.get("result");

            assertTrue(isEmpty(result));

            assertEquals(response.get("status"), "error");
            assertTrue(response.containsKey("error"));
        }
    }

    @Test
    public void missingCommand() throws Exception
    {
        try(final TestSocket socket= new TestSocket())
        {
            final Map<String, Object> request= new HashMap<>();

            request.put("identifier", "hoge");
            request.put("classpath", emptyList());

            socket.write(request);

            final Map<String, Object> response= socket.read();

            assertEquals(response.get("identifier"), "hoge");
            assertTrue(response.get("result") instanceof Iterable);

            final Iterable<?> result= (Iterable<?>)response.get("result");

            assertTrue(isEmpty(result));

            assertEquals(response.get("status"), "error");
            assertTrue(response.containsKey("error"));
        }
    }

    @Test
    public void receiveResult() throws Exception
    {
        final URL jarurl= ClassLoader.getSystemResource("unite-javaimport-0.10.jar");

        try(final TestSocket socket= new TestSocket())
        {
            final Map<String, Object> request= new HashMap<>();

            request.put("identifier", "hoge");
            request.put("command", "packages");
            request.put("classpath", Arrays.asList(jarurl.getPath()));

            socket.write(request);

            final Map<String, Object> response= socket.read();

            System.out.println(response);
        }
    }

    static final class TestSocket extends Socket
    {
        public static final String HOST_NAME= "localhost";
        public static final int PORT_NUMBER= 51235;

        public TestSocket() throws IOException
        {
            super(HOST_NAME, PORT_NUMBER);
        }

        public void write(Map<? extends String, ? extends Object> data) throws IOException
        {
            final String content= JSON.encode(data);

            this.getOutputStream().write(String.format("%08x%s", content.length(), content).getBytes());
        }

        public Map<String, Object> read() throws IOException
        {
            final InputStream in= this.getInputStream();
            final StringBuilder header= new StringBuilder(8);

            while(header.length() < 8)
            {
                final int read= in.read();

                if(read == -1)
                {
                    throw new EOFException();
                }

                header.append((char)read);
            }

            final int bodyLength= Integer.parseInt(header.toString(), 16);
            final StringBuilder body= new StringBuilder(bodyLength);
            while(body.length() < bodyLength)
            {
                final int read= in.read();

                if(read == -1)
                {
                    throw new EOFException();
                }

                body.append((char)read);
            }

            return JSON.decode(body.toString());
        }
    }

    private static final File lockfile;
    static
    {
        try
        {
            lockfile= File.createTempFile("test-javaimport-", ".lock");

            lockfile.delete();
        }
        catch(IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}

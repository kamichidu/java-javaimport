package jp.michikusa.chitose.unitejavaimport.server.request;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.JavaClass;
import org.junit.Test;

public class CommonRequestTest
{
    @Test
    public void simple()
    {
        final Map<String, Object> raw= new HashMap<>();

        raw.put("identifier", "hoge");
        raw.put("command", "packages");
        raw.put("classpath", Arrays.asList("path1", "path2", "path3"));

        final CommonRequest request= new CommonRequest(raw);

        assertEquals(raw.get("identifier"), request.getIdentifier());
        assertEquals(raw.get("command"), request.getCommand());
        assertEquals(raw.get("classpath"), request.getPaths());
    }

    @Test
    public void nullHandling()
    {
        final Map<String, Object> raw= new HashMap<>();

        raw.put("identifier", null);
        raw.put("command", null);
        raw.put("classpath", null);

        final CommonRequest request= new CommonRequest(raw);

        assertEquals("", request.getIdentifier());
        assertEquals("", request.getCommand());

        assertTrue(request.getPaths() instanceof Iterable);
    }

    @Test
    public void noPassed()
    {
        final CommonRequest request= new CommonRequest(Collections.<String, Object>emptyMap());
        
        assertEquals("", request.getIdentifier());
        assertEquals("", request.getCommand());

        assertTrue(request.getPaths() instanceof Iterable);
    }

    @Test
    public void withPredicate() throws Exception
    {
        final Map<String, Object> raw= new HashMap<>();

        raw.put("identifier", "hoge");
        raw.put("command", "packages");
        raw.put("classpath", Arrays.asList("path1", "path2", "path3"));
        {
            final Map<String, Object> predicate= new HashMap<>();

            {
                final Map<String, Object> m= new HashMap<>();

                m.put("regex", "^\\Qjava.util.List\\E$");
                m.put("type", "inclusive");

                predicate.put("classname", m);
            }
            predicate.put("modifiers", Arrays.asList("public"));
            predicate.put("include_packages", Arrays.asList("java.util"));
            predicate.put("exclude_packages", Arrays.asList("java"));

            raw.put("predicate", predicate);
        }

        final PredicateRequest request= new PredicateRequest(new CommonRequest(raw));

        try(final InputStream in= ClassLoader.getSystemResourceAsStream("java/util/List.class"))
        {
            final JavaClass clazz= new ClassParser(in, "java/util/List.class").parse();

            assertTrue(request.getClassnamePredicate().apply(clazz));
            assertTrue(request.getModifierPredicate().apply(clazz));
            assertTrue(request.getPackagePredicate().apply(clazz.getPackageName()));
        }
    }
}

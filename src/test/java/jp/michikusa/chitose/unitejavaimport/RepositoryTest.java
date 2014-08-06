package jp.michikusa.chitose.unitejavaimport;

import static com.google.common.base.Predicates.alwaysTrue;
import static com.google.common.base.Predicates.in;
import static com.google.common.base.Predicates.not;
import static com.google.common.collect.Iterables.contains;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.isEmpty;
import static com.google.common.collect.Iterables.transform;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.net.URL;
import java.util.Arrays;

import org.apache.bcel.classfile.JavaClass;
import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;

public class RepositoryTest
{
    @Test
    public void packages()
    {
        final Iterable<String> expects= Arrays.asList(
            "jp.michikusa.chitose.unitejavaimport",
            "jp.michikusa.chitose.unitejavaimport.predicate",
            "jp.michikusa.chitose.unitejavaimport.server",
            "jp.michikusa.chitose.unitejavaimport.server.request",
            "jp.michikusa.chitose.unitejavaimport.util"
        );
        final URL jarurl= ClassLoader.getSystemResource("unite-javaimport-0.10.jar");

        final Iterable<String> pkgs= Repository.get().packages(new File(jarurl.getPath()).toPath(), alwaysTrue());

        for(final String expect : expects)
        {
            assertTrue("it doesn't contain a `" + expect + "'", contains(pkgs, expect));
        }

        final Iterable<String> others= filter(pkgs, not(in(ImmutableSet.copyOf(expects))));

        assertTrue("it has other packages " + Iterables.toString(others), isEmpty(others));
    }
    
    @Test
    public void classes()
    {
        final Iterable<String> expects= Arrays.asList(
            "jp.michikusa.chitose.unitejavaimport.DatabaseRepository.ListJavaClassForDirectory.1",
            "jp.michikusa.chitose.unitejavaimport.DatabaseRepository.ListJavaClassForDirectory",
            "jp.michikusa.chitose.unitejavaimport.DatabaseRepository.ListJavaClassForJar.1",
            "jp.michikusa.chitose.unitejavaimport.DatabaseRepository.ListJavaClassForJar",
            "jp.michikusa.chitose.unitejavaimport.DatabaseRepository",
            "jp.michikusa.chitose.unitejavaimport.InMemoryRepository.1",
            "jp.michikusa.chitose.unitejavaimport.InMemoryRepository.2",
            "jp.michikusa.chitose.unitejavaimport.InMemoryRepository.3",
            "jp.michikusa.chitose.unitejavaimport.InMemoryRepository.ConcurrentIterator",
            "jp.michikusa.chitose.unitejavaimport.InMemoryRepository.Lister",
            "jp.michikusa.chitose.unitejavaimport.InMemoryRepository.ListJavaClassForDirectory.1",
            "jp.michikusa.chitose.unitejavaimport.InMemoryRepository.ListJavaClassForDirectory",
            "jp.michikusa.chitose.unitejavaimport.InMemoryRepository.ListJavaClassForJar.1",
            "jp.michikusa.chitose.unitejavaimport.InMemoryRepository.ListJavaClassForJar",
            "jp.michikusa.chitose.unitejavaimport.InMemoryRepository",
            "jp.michikusa.chitose.unitejavaimport.predicate.IsConstructor",
            "jp.michikusa.chitose.unitejavaimport.predicate.IsFinal",
            "jp.michikusa.chitose.unitejavaimport.predicate.IsInitializer",
            "jp.michikusa.chitose.unitejavaimport.predicate.IsPackagePrivate",
            "jp.michikusa.chitose.unitejavaimport.predicate.IsPrivate",
            "jp.michikusa.chitose.unitejavaimport.predicate.IsProtected",
            "jp.michikusa.chitose.unitejavaimport.predicate.IsPublic",
            "jp.michikusa.chitose.unitejavaimport.predicate.IsStatic",
            "jp.michikusa.chitose.unitejavaimport.predicate.IsStaticInitializer",
            "jp.michikusa.chitose.unitejavaimport.predicate.RegexMatch",
            "jp.michikusa.chitose.unitejavaimport.predicate.StartsWithPackage",
            "jp.michikusa.chitose.unitejavaimport.Repository",
            "jp.michikusa.chitose.unitejavaimport.server.App",
            "jp.michikusa.chitose.unitejavaimport.server.AppOption",
            "jp.michikusa.chitose.unitejavaimport.server.JsonMessageDecoder",
            "jp.michikusa.chitose.unitejavaimport.server.JsonMessageEncoder",
            "jp.michikusa.chitose.unitejavaimport.server.request.CommonRequest",
            "jp.michikusa.chitose.unitejavaimport.server.request.PredicateRequest.1",
            "jp.michikusa.chitose.unitejavaimport.server.request.PredicateRequest.2",
            "jp.michikusa.chitose.unitejavaimport.server.request.PredicateRequest.3",
            "jp.michikusa.chitose.unitejavaimport.server.request.PredicateRequest",
            "jp.michikusa.chitose.unitejavaimport.server.RequestHandler.1",
            "jp.michikusa.chitose.unitejavaimport.server.RequestHandler.2",
            "jp.michikusa.chitose.unitejavaimport.server.RequestHandler",
            "jp.michikusa.chitose.unitejavaimport.util.AbstractTaskWorker",
            "jp.michikusa.chitose.unitejavaimport.util.AggregateWorkerSupport",
            "jp.michikusa.chitose.unitejavaimport.util.GenericOption",
            "jp.michikusa.chitose.unitejavaimport.util.KeepAliveInputStream",
            "jp.michikusa.chitose.unitejavaimport.util.KeepAliveOutputStream",
            "jp.michikusa.chitose.unitejavaimport.util.Pair",
            "jp.michikusa.chitose.unitejavaimport.util.TaskWorker",
            "jp.michikusa.chitose.unitejavaimport.util.WorkerSupport"
        );
        final URL jarurl= ClassLoader.getSystemResource("unite-javaimport-0.10.jar");

        final Iterable<JavaClass> classes= Repository.get().classes(new File(jarurl.getPath()).toPath(), alwaysTrue());
        final Iterable<String> classNames= transform(classes, new Function<JavaClass, String>(){
            @Override
            public String apply(JavaClass input)
            {
                return input.getClassName().replace('$', '.');
            }
        });

        for(final String expect : expects)
        {
            assertTrue("it doesn't contain a `" + expect + "'", contains(classNames, expect));
        }

        final Iterable<String> others= filter(classNames, not(in(ImmutableSet.copyOf(expects))));

        assertTrue("it has other classes " + Iterables.toString(others), isEmpty(others));
    }
}

package jp.michikusa.chitose.javaimport.util;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

import java.io.File;
import java.util.Collections;
import java.util.List;

import jp.michikusa.chitose.javaimport.util.FileSystem.Path;

import org.junit.Test;

import static com.google.common.base.Predicates.alwaysTrue;
import static com.google.common.collect.Iterables.*;

import static org.junit.Assert.*;

public class FileSystemTest
{
    @Test
    public void listFilesForDirectory()
    {
        this.test(directory);
    }

    @Test
    public void listFilesForJar()
    {
        this.test(jar);
    }

    private void test(File path)
    {
        final FileSystem fs= FileSystem.create(path);
        final Iterable<Path> paths= fs.listFiles(alwaysTrue());

        assertEquals(entries.length, size(paths));

        final List<String> filenames= Lists.newArrayList(transform(paths, new Function<Path, String>(){
            @Override
            public String apply(Path input) {
                return input.getFilename().toString();
            }
        }));

        Collections.sort(filenames);

        for(int i= 0; i < filenames.size(); ++i)
        {
            assertEquals(entries[i], filenames.get(i));
        }
    }

    private static final File directory= new File("./src/test/resources/directory/");

    private static final File jar= new File("./src/test/resources/unite-javaimport-0.10.jar");

    private static final String[] entries= new String[]{
        "META-INF/",
        "META-INF/MANIFEST.MF",
        "META-INF/maven/",
        "META-INF/maven/jp.michikusa.chitose.unitejavaimport/",
        "META-INF/maven/jp.michikusa.chitose.unitejavaimport/unite-javaimport/",
        "META-INF/maven/jp.michikusa.chitose.unitejavaimport/unite-javaimport/pom.properties",
        "META-INF/maven/jp.michikusa.chitose.unitejavaimport/unite-javaimport/pom.xml",
        "jp/",
        "jp/michikusa/",
        "jp/michikusa/chitose/",
        "jp/michikusa/chitose/unitejavaimport/",
        "jp/michikusa/chitose/unitejavaimport/DatabaseRepository$ListJavaClassForDirectory$1.class",
        "jp/michikusa/chitose/unitejavaimport/DatabaseRepository$ListJavaClassForDirectory.class",
        "jp/michikusa/chitose/unitejavaimport/DatabaseRepository$ListJavaClassForJar$1.class",
        "jp/michikusa/chitose/unitejavaimport/DatabaseRepository$ListJavaClassForJar.class",
        "jp/michikusa/chitose/unitejavaimport/DatabaseRepository.class",
        "jp/michikusa/chitose/unitejavaimport/InMemoryRepository$1.class",
        "jp/michikusa/chitose/unitejavaimport/InMemoryRepository$2.class",
        "jp/michikusa/chitose/unitejavaimport/InMemoryRepository$3.class",
        "jp/michikusa/chitose/unitejavaimport/InMemoryRepository$ConcurrentIterator.class",
        "jp/michikusa/chitose/unitejavaimport/InMemoryRepository$ListJavaClassForDirectory$1.class",
        "jp/michikusa/chitose/unitejavaimport/InMemoryRepository$ListJavaClassForDirectory.class",
        "jp/michikusa/chitose/unitejavaimport/InMemoryRepository$ListJavaClassForJar$1.class",
        "jp/michikusa/chitose/unitejavaimport/InMemoryRepository$ListJavaClassForJar.class",
        "jp/michikusa/chitose/unitejavaimport/InMemoryRepository$Lister.class",
        "jp/michikusa/chitose/unitejavaimport/InMemoryRepository.class",
        "jp/michikusa/chitose/unitejavaimport/Repository.class",
        "jp/michikusa/chitose/unitejavaimport/predicate/",
        "jp/michikusa/chitose/unitejavaimport/predicate/IsConstructor.class",
        "jp/michikusa/chitose/unitejavaimport/predicate/IsFinal.class",
        "jp/michikusa/chitose/unitejavaimport/predicate/IsInitializer.class",
        "jp/michikusa/chitose/unitejavaimport/predicate/IsPackagePrivate.class",
        "jp/michikusa/chitose/unitejavaimport/predicate/IsPrivate.class",
        "jp/michikusa/chitose/unitejavaimport/predicate/IsProtected.class",
        "jp/michikusa/chitose/unitejavaimport/predicate/IsPublic.class",
        "jp/michikusa/chitose/unitejavaimport/predicate/IsStatic.class",
        "jp/michikusa/chitose/unitejavaimport/predicate/IsStaticInitializer.class",
        "jp/michikusa/chitose/unitejavaimport/predicate/RegexMatch.class",
        "jp/michikusa/chitose/unitejavaimport/predicate/StartsWithPackage.class",
        "jp/michikusa/chitose/unitejavaimport/server/",
        "jp/michikusa/chitose/unitejavaimport/server/App.class",
        "jp/michikusa/chitose/unitejavaimport/server/AppOption.class",
        "jp/michikusa/chitose/unitejavaimport/server/JsonMessageDecoder.class",
        "jp/michikusa/chitose/unitejavaimport/server/JsonMessageEncoder.class",
        "jp/michikusa/chitose/unitejavaimport/server/RequestHandler$1.class",
        "jp/michikusa/chitose/unitejavaimport/server/RequestHandler$2.class",
        "jp/michikusa/chitose/unitejavaimport/server/RequestHandler.class",
        "jp/michikusa/chitose/unitejavaimport/server/request/",
        "jp/michikusa/chitose/unitejavaimport/server/request/CommonRequest.class",
        "jp/michikusa/chitose/unitejavaimport/server/request/PredicateRequest$1.class",
        "jp/michikusa/chitose/unitejavaimport/server/request/PredicateRequest$2.class",
        "jp/michikusa/chitose/unitejavaimport/server/request/PredicateRequest$3.class",
        "jp/michikusa/chitose/unitejavaimport/server/request/PredicateRequest.class",
        "jp/michikusa/chitose/unitejavaimport/util/",
        "jp/michikusa/chitose/unitejavaimport/util/AbstractTaskWorker.class",
        "jp/michikusa/chitose/unitejavaimport/util/AggregateWorkerSupport.class",
        "jp/michikusa/chitose/unitejavaimport/util/GenericOption.class",
        "jp/michikusa/chitose/unitejavaimport/util/KeepAliveInputStream.class",
        "jp/michikusa/chitose/unitejavaimport/util/KeepAliveOutputStream.class",
        "jp/michikusa/chitose/unitejavaimport/util/Pair.class",
        "jp/michikusa/chitose/unitejavaimport/util/TaskWorker.class",
        "jp/michikusa/chitose/unitejavaimport/util/WorkerSupport.class",
    };
}

package jp.michikusa.chitose.unitejavaimport;

import com.google.common.collect.ImmutableSet;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.JavaClass;

public class Dumper implements Callable<Iterable<CharSequence>>
{
    public Dumper(ProcessOption option)
    {
        this.option= option;
    }

    @Override
    public Iterable<CharSequence> call() throws Exception
    {
        final ZipFile zip_file= new ZipFile(this.option.path());
        final ImmutableSet.Builder<CharSequence> clazzes= ImmutableSet.builder();

        for(final ZipEntry entry : Collections.list(zip_file.entries()))
        {
            if(entry.getName().endsWith(".class"))
            {
                final JavaClass clazz= new ClassParser(zip_file.getInputStream(entry), entry.getName()).parse();

                if(clazz.isPublic())
                {
                    clazzes.add(clazz.getClassName());
                }
            }
        }

        return clazzes.build();
    }

    private final ProcessOption option;
}

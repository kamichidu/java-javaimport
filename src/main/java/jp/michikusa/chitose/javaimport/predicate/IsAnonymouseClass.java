package jp.michikusa.chitose.javaimport.predicate;

import com.google.common.base.Predicate;

import java.io.File;
import java.util.jar.JarEntry;
import java.util.regex.Pattern;

public final class IsAnonymouseClass
{
    public static final Predicate<JarEntry> forJarEntry()
    {
        return new Predicate<JarEntry>(){
            @Override
            public boolean apply(JarEntry input)
            {
                return pattern.matcher(input.getName()).find();
            }
        };
    }

    public static final Predicate<File> forFile()
    {
        return new Predicate<File>(){
            @Override
            public boolean apply(File input)
            {
                return pattern.matcher(input.getName()).find();
            }
        };
    }

    private static final Pattern pattern= Pattern.compile("\\$\\d+\\.class$");
}
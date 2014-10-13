package jp.michikusa.chitose.javaimport.predicate;

import com.google.common.base.Predicate;

import java.io.File;
import java.util.jar.JarEntry;

public final class IsClassFile
{
    public static Predicate<JarEntry> forJarEntry()
    {
        return new Predicate<JarEntry>(){
            @Override
            public boolean apply(JarEntry input)
            {
                return input.getName().endsWith(".class");
            }
        };
    }

    public static Predicate<File> forFile()
    {
        return new Predicate<File>(){
            @Override
            public boolean apply(File input)
            {
                return input.getName().endsWith(".class");
            }
        };
    }
}

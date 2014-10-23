package jp.michikusa.chitose.javaimport.predicate;

import com.google.common.base.Predicate;

import jp.michikusa.chitose.javaimport.util.FileSystem.Path;

public class IsClassFile
    implements Predicate<Path>
{
    @Override
    public boolean apply(Path input)
    {
        return input.getFilename().toString().endsWith(".class");
    }
}

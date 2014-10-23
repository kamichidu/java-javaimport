package jp.michikusa.chitose.javaimport.predicate;

import com.google.common.base.Predicate;

import java.util.regex.Pattern;

import jp.michikusa.chitose.javaimport.util.FileSystem.Path;

public final class IsPackageInfo
    implements Predicate<Path>
{
    @Override
    public boolean apply(Path input)
    {
        return pattern.matcher(input.getFilename()).find();
    }

    private static final Pattern pattern= Pattern.compile("\\b(?:package-info)\\b");
}

package jp.michikusa.chitose.unitejavaimport.predicate;

import org.apache.bcel.classfile.AccessFlags;

import com.google.common.base.Predicate;

public class IsPrivate implements Predicate<AccessFlags>
{
    @Override
    public boolean apply(AccessFlags input)
    {
        return input.isPrivate();
    }
}

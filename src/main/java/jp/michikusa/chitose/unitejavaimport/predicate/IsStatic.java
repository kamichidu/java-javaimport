package jp.michikusa.chitose.unitejavaimport.predicate;

import com.google.common.base.Predicate;

import org.apache.bcel.classfile.AccessFlags;

public class IsStatic implements Predicate<AccessFlags>
{
    @Override
    public boolean apply(AccessFlags input)
    {
        return input.isStatic();
    }
}

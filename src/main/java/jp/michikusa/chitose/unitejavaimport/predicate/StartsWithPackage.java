package jp.michikusa.chitose.unitejavaimport.predicate;

import com.google.common.base.Predicate;

import org.apache.bcel.classfile.JavaClass;

public class StartsWithPackage implements Predicate<JavaClass>
{
    public StartsWithPackage(String prefix)
    {
        this.prefix= prefix;
    }

    @Override
    public boolean apply(JavaClass input)
    {
        return input.getPackageName().startsWith(this.prefix);
    }

    private final String prefix;
}

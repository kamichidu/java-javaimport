package jp.michikusa.chitose.unitejavaimport.predicate;

import com.google.common.base.Predicate;

import org.apache.bcel.classfile.Method;

public class IsStaticInitializer implements Predicate<Method>
{
    @Override
    public boolean apply(Method input)
    {
        return input.getName().equals("<clinit>");
    }
}

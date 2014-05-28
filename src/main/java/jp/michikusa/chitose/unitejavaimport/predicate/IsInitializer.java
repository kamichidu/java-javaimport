package jp.michikusa.chitose.unitejavaimport.predicate;

import com.google.common.base.Predicate;

import org.apache.bcel.classfile.Method;

public class IsInitializer implements Predicate<Method>
{
    @Override
    public boolean apply(Method input)
    {
        return input.getName().equals("<cinit>");
    }
}

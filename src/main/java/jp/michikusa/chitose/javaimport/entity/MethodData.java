package jp.michikusa.chitose.javaimport.entity;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

public class MethodData
{
    public Iterable<CharSequence> getModifiers()
    {
        return ImmutableSet.copyOf(this.modifiers);
    }

    public void setModifiers(Iterable<? extends CharSequence> modifiers)
    {
        this.modifiers.clear();
        this.modifiers.addAll(ImmutableSet.copyOf(modifiers));
    }

    public Iterable<MethodParameterData> getParameters()
    {
        return ImmutableSet.copyOf(this.parameters);
    }

    public void addParameter(MethodParameterData parameter)
    {
        this.parameters.add(parameter);
    }

    public void setParameters(Iterable<? extends MethodParameterData> parameters)
    {
        this.parameters.clear();
        this.parameters.addAll(ImmutableSet.copyOf(parameters));
    }

    public Iterable<ExceptionType> getExceptionTypes()
    {
        return ImmutableSet.copyOf(this.exceptionTypes);
    }

    public void addExceptionType(ExceptionType exceptionType)
    {
        this.exceptionTypes.add(exceptionType);
    }

    public void setExceptionTypes(Iterable<? extends ExceptionType> exceptionTypes)
    {
        this.exceptionTypes.clear();
        this.exceptionTypes.addAll(ImmutableSet.copyOf(exceptionTypes));
    }

    @Getter @Setter
    private CharSequence name;

    @Getter @Setter
    private CharSequence returnType;

    private final Set<CharSequence> modifiers= Sets.newConcurrentHashSet();

    private final Set<MethodParameterData> parameters= Sets.newConcurrentHashSet();

    private final Set<ExceptionType> exceptionTypes= Sets.newConcurrentHashSet();
}

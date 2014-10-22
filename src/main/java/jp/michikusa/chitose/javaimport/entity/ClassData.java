package jp.michikusa.chitose.javaimport.entity;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

public class ClassData
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

    public Iterable<CharSequence> getInterfaces()
    {
        return ImmutableSet.copyOf(this.interfaces);
    }

    public void setInterfaces(Iterable<? extends CharSequence> interfaces)
    {
        this.interfaces.clear();
        this.interfaces.addAll(ImmutableSet.copyOf(interfaces));
    }

    public Iterable<FieldData> getFields()
    {
        return ImmutableSet.copyOf(this.fields);
    }

    public void addField(FieldData field)
    {
        this.fields.add(field);
    }

    public void setFields(Iterable<? extends FieldData> fields)
    {
        this.fields.clear();
        this.fields.addAll(ImmutableSet.copyOf(fields));
    }

    public Iterable<MethodData> getMethods()
    {
        return ImmutableSet.copyOf(this.methods);
    }

    public void addMethod(MethodData method)
    {
        this.methods.add(method);
    }

    public void setMethods(Iterable<? extends MethodData> methods)
    {
        this.methods.clear();
        this.methods.addAll(ImmutableSet.copyOf(methods));
    }

    @Getter @Setter
    private CharSequence packageName;

    @Getter @Setter
    private CharSequence simpleName;

    @Getter @Setter
    private CharSequence canonicalName;

    @Getter @Setter
    private CharSequence name;

    @Getter @Setter
    private CharSequence superclass;

    @Getter @Setter
    private boolean enumType;

    @Getter @Setter
    private boolean interfaceType;

    @Getter @Setter
    private boolean annotationType;

    private final Set<CharSequence> modifiers= Sets.newConcurrentHashSet();

    private final Set<CharSequence> interfaces= Sets.newConcurrentHashSet();

    private final Set<FieldData> fields= Sets.newConcurrentHashSet();

    private final Set<MethodData> methods= Sets.newConcurrentHashSet();
}

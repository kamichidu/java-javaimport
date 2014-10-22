package jp.michikusa.chitose.javaimport.entity;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

public class FieldData
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

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String type;

    @Getter @Setter
    private String value;

    private final Set<CharSequence> modifiers= Sets.newConcurrentHashSet();
}

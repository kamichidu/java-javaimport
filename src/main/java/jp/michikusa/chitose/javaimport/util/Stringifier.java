package jp.michikusa.chitose.javaimport.util;

import java.util.LinkedHashSet;
import java.util.Set;

import org.objectweb.asm.Opcodes;

public final class Stringifier
{
    public static Iterable<CharSequence> classAccessFlags(int access)
    {
        final Set<CharSequence> s= new LinkedHashSet<CharSequence>();

        if((access & Opcodes.ACC_PUBLIC)     == Opcodes.ACC_PUBLIC)     { s.add("public"); }
        if((access & Opcodes.ACC_PRIVATE)    == Opcodes.ACC_PRIVATE)    { s.add("private"); }
        if((access & Opcodes.ACC_PROTECTED)  == Opcodes.ACC_PROTECTED)  { s.add("protected"); }
        if((access & Opcodes.ACC_FINAL)      == Opcodes.ACC_FINAL)      { s.add("final"); }
        if((access & Opcodes.ACC_SUPER)      == Opcodes.ACC_SUPER)      { s.add("super"); }
        if((access & Opcodes.ACC_INTERFACE)  == Opcodes.ACC_INTERFACE)  { s.add("interface"); }
        if((access & Opcodes.ACC_ABSTRACT)   == Opcodes.ACC_ABSTRACT)   { s.add("abstract"); }
        if((access & Opcodes.ACC_SYNTHETIC)  == Opcodes.ACC_SYNTHETIC)  { s.add("synthetic"); }
        if((access & Opcodes.ACC_ANNOTATION) == Opcodes.ACC_ANNOTATION) { s.add("annotation"); }
        if((access & Opcodes.ACC_ENUM)       == Opcodes.ACC_ENUM)       { s.add("enum"); }
        // pseudo access flag by asm
        if((access & Opcodes.ACC_DEPRECATED) == Opcodes.ACC_DEPRECATED) { s.add("deprecated"); }

        return s;
    }
    
    public static Iterable<CharSequence> fieldAccessFlags(int access)
    {
        final Set<CharSequence> s= new LinkedHashSet<CharSequence>();

        if((access & Opcodes.ACC_PUBLIC)     == Opcodes.ACC_PUBLIC)     { s.add("public"); }
        if((access & Opcodes.ACC_PRIVATE)    == Opcodes.ACC_PRIVATE)    { s.add("private"); }
        if((access & Opcodes.ACC_PROTECTED)  == Opcodes.ACC_PROTECTED)  { s.add("protected"); }
        if((access & Opcodes.ACC_STATIC)     == Opcodes.ACC_STATIC)     { s.add("static"); }
        if((access & Opcodes.ACC_FINAL)      == Opcodes.ACC_FINAL)      { s.add("final"); }
        if((access & Opcodes.ACC_VOLATILE)   == Opcodes.ACC_VOLATILE)   { s.add("volatile"); }
        if((access & Opcodes.ACC_TRANSIENT)  == Opcodes.ACC_TRANSIENT)  { s.add("transient"); }
        if((access & Opcodes.ACC_SYNTHETIC)  == Opcodes.ACC_SYNTHETIC)  { s.add("synthetic"); }
        if((access & Opcodes.ACC_ENUM)       == Opcodes.ACC_ENUM)       { s.add("enum"); }
        // pseudo access flag by asm
        if((access & Opcodes.ACC_DEPRECATED) == Opcodes.ACC_DEPRECATED) { s.add("deprecated"); }

        return s;
    }

    public static Iterable<CharSequence> methodAccessFlags(int access)
    {
        final Set<CharSequence> s= new LinkedHashSet<CharSequence>();

        if((access & Opcodes.ACC_PUBLIC)       == Opcodes.ACC_PUBLIC)       { s.add("public"); }
        if((access & Opcodes.ACC_PRIVATE)      == Opcodes.ACC_PRIVATE)      { s.add("private"); }
        if((access & Opcodes.ACC_PROTECTED)    == Opcodes.ACC_PROTECTED)    { s.add("protected"); }
        if((access & Opcodes.ACC_STATIC)       == Opcodes.ACC_STATIC)       { s.add("static"); }
        if((access & Opcodes.ACC_FINAL)        == Opcodes.ACC_FINAL)        { s.add("final"); }
        if((access & Opcodes.ACC_SYNCHRONIZED) == Opcodes.ACC_SYNCHRONIZED) { s.add("synchronized"); }
        if((access & Opcodes.ACC_BRIDGE)       == Opcodes.ACC_BRIDGE)       { s.add("bridge"); }
        if((access & Opcodes.ACC_VARARGS)      == Opcodes.ACC_VARARGS)      { s.add("varargs"); }
        if((access & Opcodes.ACC_NATIVE)       == Opcodes.ACC_NATIVE)       { s.add("native"); }
        if((access & Opcodes.ACC_ABSTRACT)     == Opcodes.ACC_ABSTRACT)     { s.add("abstract"); }
        if((access & Opcodes.ACC_STRICT)       == Opcodes.ACC_STRICT)       { s.add("strict"); }
        if((access & Opcodes.ACC_SYNTHETIC)    == Opcodes.ACC_SYNTHETIC)    { s.add("synthetic"); }
        // pseudo access flag by asm
        if((access & Opcodes.ACC_DEPRECATED)   == Opcodes.ACC_DEPRECATED)   { s.add("deprecated"); }

        return s;
    }

    public static Iterable<CharSequence> parameterAccessFlags(int access)
    {
        final Set<CharSequence> s= new LinkedHashSet<CharSequence>();

        if((access & Opcodes.ACC_FINAL)     == Opcodes.ACC_FINAL)     { s.add("final"); }
        if((access & Opcodes.ACC_SYNTHETIC) == Opcodes.ACC_SYNTHETIC) { s.add("synthetic"); }
        if((access & Opcodes.ACC_MANDATED)  == Opcodes.ACC_MANDATED)  { s.add("mandated"); }

        return s;
    }

    private Stringifier()
    {
        throw new AssertionError();
    }
}

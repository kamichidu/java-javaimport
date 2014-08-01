package jp.michikusa.chitose.unitejavaimport;

import java.nio.file.Path;

import org.apache.bcel.classfile.Field;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;

import com.google.common.base.Predicate;

public abstract class Repository
{
    public static Repository get()
    {
        return instance;
    }

    public abstract Iterable<JavaClass> classes(Path classpath, Predicate<? super JavaClass> predicate);

    public abstract Iterable<Field> fields(Path classpath, Predicate<? super JavaClass> classPredicate, Predicate<? super Field> fieldPredicate);

    public abstract Iterable<Method> methods(Path classpath, Predicate<? super JavaClass> classPredicate, Predicate<? super Method> methodPredicate);

    public abstract Iterable<String> packages(Path classpath);

    private static final Repository instance= new InMemoryRepository();
}

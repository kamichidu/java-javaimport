package jp.michikusa.chitose.javaimport.util;

public class LangSpec
{
    public static String packageFromPath(CharSequence path)
    {
        return path.toString().replaceAll("(?:/|\\$|\\\\)", ".");
    }

    public static String canonicalNameFromBinaryName(CharSequence name)
    {
        return packageFromPath(name);
    }

    public static String nameFromBinaryName(CharSequence name)
    {
        return name.toString().replaceAll("(?:/|\\\\)", ".");
    }

    private LangSpec()
    {
        throw new AssertionError();
    }
}

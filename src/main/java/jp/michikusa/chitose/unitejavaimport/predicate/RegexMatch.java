package jp.michikusa.chitose.unitejavaimport.predicate;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

import java.util.regex.Pattern;

public class RegexMatch<E> implements Predicate<E>
{
    public RegexMatch(Pattern pattern, Function<? super E, ? extends String> stringify)
    {
        this.pattern= pattern;
        this.stringify= stringify;
    }

    @Override
    public boolean apply(E input)
    {
        return this.pattern.matcher(this.stringify.apply(input)).find();
    }

    private final Function<? super E, ? extends String> stringify;

    private final Pattern pattern;
}

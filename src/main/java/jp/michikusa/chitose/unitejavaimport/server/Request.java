package jp.michikusa.chitose.unitejavaimport.server;

import static com.google.common.base.Preconditions.checkArgument;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import jp.michikusa.chitose.unitejavaimport.util.Pair;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

public class Request
{
    public Request(Map<? extends String, ? extends Object> raw)
    {
        this.request= ImmutableMap.copyOf(raw);
    }

    public <T>T get(Class<T> type, String key, String... nested_keys) throws ClassCastException, NoSuchElementException
    {
        final String[] keys= new String[nested_keys.length + 1];

        keys[0]= key;
        for(int i= 0; i < nested_keys.length; ++i)
        {
            keys[i + 1]= nested_keys[i];
        }

        final Object got= this.get(ImmutableMap.copyOf(this.request), keys);

        return type.cast(got);
    }

    public boolean isQuitAfterResponse()
    {
        return Boolean.valueOf(this.get(String.class, "quit"));
    }

    private Object get(ImmutableMap<? super String, ? extends Object> target, String[] keys)
    {
        final Pair<String, String[]> parts= this.shift(keys);

        if(parts.second().length == 0)
        {
            return target.get(parts.first());
        }

        final Object value= target.get(parts.first());
        if(value instanceof Map)
        {
            @SuppressWarnings("unchecked")
            final Map<String, Object> casted_value= (Map<String, Object>)value;
            return this.get(ImmutableMap.copyOf(casted_value), parts.second());
        }
        else
        {
            throw new NoSuchElementException();
        }
    }

    private Pair<String, String[]> shift(String... args)
    {
        checkArgument(args.length > 0);

        final String head= args[0];

        final List<String> rest= Lists.newArrayListWithExpectedSize(args.length - 1);
        for(int i= 1; i < args.length; ++i)
        {
            rest.add(args[i]);
        }

        return Pair.of(head, rest.toArray(new String[0]));
    }

    private final ImmutableMap<String, Object> request;
}

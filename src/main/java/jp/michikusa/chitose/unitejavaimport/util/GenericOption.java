package jp.michikusa.chitose.unitejavaimport.util;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

public class GenericOption
{
    public GenericOption(String[][] options)
    {
        checkNotNull(options);

        this.options= options;
    }

    public boolean has(String name)
    {
        return this.value(name) != null;
    }

    public String value(String name)
    {
        return this.value(name, null);
    }

    public String value(String name, String defaultValue)
    {
        checkNotNull(name);

        for(final String[] option : this.options)
        {
            if(option[0].equals(name))
            {
                checkState(option.length >= 2);

                return option[1];
            }
        }

        return defaultValue;
    }

    public String[] arrayValue(String name)
    {
        final String value= this.value(name);

        if(value == null)
        {
            return new String[0];
        }

        return value.split(",");
    }

    public boolean isFlagged(String name)
    {
        checkNotNull(name);

        for(final String[] option : this.options)
        {
            if(option[0].equals(name))
            {
                return true;
            }
        }

        return false;
    }

    private final String[][] options;
}

package jp.michikusa.chitose.unitejavaimport.cli.command;

import com.google.common.base.CaseFormat;
import com.google.common.reflect.Reflection;

import jp.michikusa.chitose.unitejavaimport.cli.Command;

public class CommandParser
{
    public Command findByName(String name)
    {
        final Class<?> clazz;
        try
        {
            clazz= Class.forName(this.makeClassName(name));
        }
        catch(ClassNotFoundException e)
        {
            return null;
        }

        try
        {
            final Class<? extends Command> command_clazz= clazz.asSubclass(Command.class);

            return command_clazz.newInstance();
        }
        catch(IllegalAccessException e)
        {
            throw new IllegalStateException(e);
        }
        catch(InstantiationException e)
        {
            throw new IllegalStateException(e);
        }
    }

    private String makeClassName(String command_name)
    {
        final String capitalized= CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, command_name);

        return Reflection.getPackageName(this.getClass()) + "." + capitalized;
    }
}

package jp.michikusa.chitose.unitejavaimport.cli.command;

import java.io.OutputStream;

import jp.michikusa.chitose.unitejavaimport.cli.Command;

public class Quit implements Command
{
    @Override
    public Class<?> argumentsClazz()
    {
        return null;
    }

    @Override
    public boolean exec(OutputStream ostream, Object option) throws Exception
    {
        return false;
    }
}

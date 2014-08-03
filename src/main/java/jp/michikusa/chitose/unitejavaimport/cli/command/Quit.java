package jp.michikusa.chitose.unitejavaimport.cli.command;

import java.io.OutputStream;

import jp.michikusa.chitose.unitejavaimport.cli.Command;
import jp.michikusa.chitose.unitejavaimport.util.GenericOption;

public class Quit implements Command
{
    @Override
    public boolean exec(OutputStream ostream, GenericOption option) throws Exception
    {
        return false;
    }
}

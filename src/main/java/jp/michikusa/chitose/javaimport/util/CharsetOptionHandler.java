package jp.michikusa.chitose.javaimport.util;

import java.nio.charset.Charset;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.OptionDef;
import org.kohsuke.args4j.spi.OneArgumentOptionHandler;
import org.kohsuke.args4j.spi.Setter;

public class CharsetOptionHandler
    extends OneArgumentOptionHandler<Charset>
{
    public CharsetOptionHandler(CmdLineParser parser, OptionDef option, Setter<? super Charset> setter)
    {
        super(parser, option, setter);
    }

    @Override
    protected Charset parse(String argument)
        throws NumberFormatException, CmdLineException
    {
        return Charset.forName(argument);
    }
}

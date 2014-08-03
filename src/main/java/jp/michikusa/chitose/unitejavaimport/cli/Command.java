package jp.michikusa.chitose.unitejavaimport.cli;

import java.io.OutputStream;

import jp.michikusa.chitose.unitejavaimport.util.GenericOption;

public interface Command
{
    boolean exec(OutputStream ostream, GenericOption option) throws Exception;
}

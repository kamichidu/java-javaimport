package jp.michikusa.chitose.unitejavaimport.cli;

import java.io.OutputStream;

public interface Command
{
    Class<?> argumentsClazz();

    boolean exec(OutputStream ostream, Object option) throws Exception;
}

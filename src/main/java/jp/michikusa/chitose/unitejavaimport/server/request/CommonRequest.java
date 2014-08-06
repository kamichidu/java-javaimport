package jp.michikusa.chitose.unitejavaimport.server.request;

import static com.google.common.base.Objects.firstNonNull;
import static com.google.common.base.Strings.nullToEmpty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

public class CommonRequest
{
    public CommonRequest(Map<String, ? extends Object> m)
    {
        this.original= new HashMap<>(m);

        this.identifier= nullToEmpty((String)m.get("identifier"));
        this.command= nullToEmpty((String)m.get("command"));
        {
            @SuppressWarnings("unchecked")
            final Iterable<String> paths= (Iterable<String>)m.get("classpath");

            this.paths= firstNonNull(paths, Collections.<String>emptyList());
        }
    }

    final Map<String, Object> original;

    @Getter
    private final String identifier;

    @Getter
    private final String command;

    @Getter
    private final Iterable<String> paths;
}

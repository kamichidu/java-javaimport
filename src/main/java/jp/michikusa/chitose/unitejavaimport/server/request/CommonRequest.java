package jp.michikusa.chitose.unitejavaimport.server.request;

import java.util.Map;

import lombok.Getter;

import com.google.common.collect.ImmutableMap;

public class CommonRequest
{
    public CommonRequest(Map<String, ? extends Object> m)
    {
        this.original= ImmutableMap.copyOf(m);

        this.identifier= (String)m.get("identifier");
        this.command= (String)m.get("command");
        {
            @SuppressWarnings("unchecked")
            final Iterable<String> paths= (Iterable<String>)m.get("classpath");

            this.paths= paths;
        }
    }

    final ImmutableMap<String, Object> original;

    @Getter
    private final String identifier;

    @Getter
    private final String command;

    @Getter
    private final Iterable<String> paths;
}

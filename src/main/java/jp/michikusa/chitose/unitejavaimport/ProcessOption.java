package jp.michikusa.chitose.unitejavaimport;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.File;

/**
 * this has some options for dumping.
 *
 * @author kamichidu
 * @since  2013-12-22
 */
public class ProcessOption
{
    public static class Builder
    {
        public Builder recursive(boolean value)
        {
            this.recursive= value;
            return this;
        }

        public Builder packageName(String value)
        {
            this.package_name= value;
            return this;
        }

        public Builder path(File value)
        {
            this.path= value;
            return this;
        }

        public Builder debug(boolean value)
        {
            this.debug= value;
            return this;
        }

        public ProcessOption build()
        {
            return new ProcessOption(this);
        }

        private boolean recursive;

        private String package_name;

        private File path;

        private boolean debug;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public boolean recursive()
    {
        return this.recursive;
    }

    public String packageName()
    {
        return this.package_name;
    }

    public File path()
    {
        return this.path;
    }

    public boolean debug()
    {
        return this.debug;
    }

    private ProcessOption(Builder builder)
    {
        checkNotNull(builder.path);

        this.recursive=    builder.recursive;
        this.package_name= builder.package_name;
        this.path=         builder.path;
        this.debug=        builder.debug;
    }

    private final boolean recursive;

    private final String package_name;

    private final File path;

    private final boolean debug;
}


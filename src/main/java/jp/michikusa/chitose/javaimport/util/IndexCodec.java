package jp.michikusa.chitose.javaimport.util;

import java.io.IOException;

import jp.michikusa.chitose.javaimport.entity.ClassData;
import jp.michikusa.chitose.javaimport.entity.ExceptionType;
import jp.michikusa.chitose.javaimport.entity.FieldData;
import jp.michikusa.chitose.javaimport.entity.MethodData;
import jp.michikusa.chitose.javaimport.entity.MethodParameterData;
import jp.michikusa.chitose.lolivimson.core.ObjectCodec;
import jp.michikusa.chitose.lolivimson.core.VimsonGenerator;

/**
 * <p>
 * The {@linkplain ObjectCodec} implementation for javaimport's index file.<br>
 * </p>
 * @author kamichidu
 */
public class IndexCodec
    extends ObjectCodec
{
    @Override
    public void writeValue(VimsonGenerator vgen, Object value)
        throws IOException
    {
        if(value instanceof ClassData)
        {
            this.write(vgen, (ClassData)value);
        }
        else if(value instanceof FieldData)
        {
            this.write(vgen, (FieldData)value);
        }
        else if(value instanceof MethodData)
        {
            this.write(vgen, (MethodData)value);
        }
        else
        {
            throw new UnsupportedOperationException();
        }
    }

    private void write(VimsonGenerator g, ClassData data)
        throws IOException
    {
        g.writeStartDictionary();
        {
            g.writeStringField("package", toString(data.getPackageName()));
            g.writeStringField("simple_name", toString(data.getSimpleName()));
            g.writeStringField("canonical_name", toString(data.getCanonicalName()));
            g.writeStringField("name", toString(data.getName()));

            g.writeListFieldStart("modifiers");
            for(final CharSequence modifier : data.getModifiers())
            {
                g.writeString(modifier.toString());
            }
            g.writeEndList();

            g.writeListFieldStart("fields");
            for(final FieldData fieldData : data.getFields())
            {
                this.write(g, fieldData);
            }
            g.writeEndList();

            g.writeListFieldStart("methods");
            for(final MethodData methodData : data.getMethods())
            {
                this.write(g, methodData);
            }
            g.writeEndList();
        }
        g.writeEndDictionary();

        for(final ClassData classData : data.getClasses())
        {
            this.write(g, classData);
        }
    }

    private void write(VimsonGenerator g, FieldData data)
        throws IOException
    {
        g.writeStartDictionary();
        {
            g.writeStringField("name", data.getName());
            g.writeStringField("type", data.getType());

            g.writeListFieldStart("modifiers");
            for(final CharSequence modifier : data.getModifiers())
            {
                g.writeString(toString(modifier));
            }
            g.writeEndList();
        }
        g.writeEndDictionary();
    }

    private void write(VimsonGenerator g, MethodData data)
        throws IOException
    {
        g.writeStartDictionary();
        {
            g.writeStringField("name", toString(data.getName()));
            g.writeStringField("return_type", toString(data.getReturnType()));

            g.writeListFieldStart("parameters");
            for(final MethodParameterData paramData : data.getParameters())
            {
                this.write(g, paramData);
            }
            g.writeEndList();

            g.writeListFieldStart("throws");
            for(final ExceptionType exceptionData : data.getExceptionTypes())
            {
                this.write(g, exceptionData);
            }
            g.writeEndList();

            g.writeListFieldStart("modifiers");
            for(final CharSequence modifier : data.getModifiers())
            {
                g.writeString(toString(modifier));
            }
            g.writeEndList();
        }
        g.writeEndDictionary();
    }

    private void write(VimsonGenerator g, MethodParameterData data)
        throws IOException
    {
        g.writeStartDictionary();
        {
            g.writeStringField("type", toString(data.getType()));
        }
        g.writeEndDictionary();
    }

    private void write(VimsonGenerator g, ExceptionType data)
        throws IOException
    {
        g.writeStartDictionary();
        {
            g.writeStringField("type", toString(data.getType()));
        }
        g.writeEndDictionary();
    }

    private static String toString(Object o)
    {
        return (o != null) ? o.toString() : null;
    }
}

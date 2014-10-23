package jp.michikusa.chitose.javaimport.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.Iterator;

import jp.michikusa.chitose.javaimport.entity.ClassData;
import jp.michikusa.chitose.javaimport.entity.ExceptionType;
import jp.michikusa.chitose.javaimport.entity.FieldData;
import jp.michikusa.chitose.javaimport.entity.MethodData;
import jp.michikusa.chitose.javaimport.entity.MethodParameterData;

public class JsonCodec
    extends ObjectCodec
{
    @Override
    public void writeValue(JsonGenerator jgen, Object value)
        throws IOException, JsonProcessingException
    {
        if(value instanceof ClassData)
        {
            this.write(jgen, (ClassData)value);
        }
        else if(value instanceof FieldData)
        {
            this.write(jgen, (FieldData)value);
        }
        else if(value instanceof MethodData)
        {
            this.write(jgen, (MethodData)value);
        }
        else
        {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public void writeTree(JsonGenerator jg, TreeNode tree)
        throws IOException, JsonProcessingException
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T readValue(JsonParser jp, Class<T> valueType)
        throws IOException, JsonProcessingException
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T readValue(JsonParser jp, TypeReference<?> valueTypeRef)
        throws IOException, JsonProcessingException
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T readValue(JsonParser jp, ResolvedType valueType)
        throws IOException, JsonProcessingException
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> Iterator<T> readValues(JsonParser jp, Class<T> valueType)
        throws IOException, JsonProcessingException
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> Iterator<T> readValues(JsonParser jp, TypeReference<?> valueTypeRef)
        throws IOException, JsonProcessingException
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> Iterator<T> readValues(JsonParser jp, ResolvedType valueType)
        throws IOException, JsonProcessingException
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T extends TreeNode> T readTree(JsonParser jp)
        throws IOException, JsonProcessingException
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public TreeNode createObjectNode()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public TreeNode createArrayNode()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public JsonParser treeAsTokens(TreeNode n)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T treeToValue(TreeNode n, Class<T> valueType)
        throws JsonProcessingException
    {
        throw new UnsupportedOperationException();
    }

    private void write(JsonGenerator g, ClassData data)
        throws IOException
    {
        g.writeStartObject();
        {
            g.writeStringField("package", toString(data.getPackageName()));
            g.writeStringField("simple_name", toString(data.getSimpleName()));
            g.writeStringField("canonical_name", toString(data.getCanonicalName()));
            g.writeStringField("name", toString(data.getName()));
            g.writeStringField("superclass", toString(data.getSuperclass()));
            g.writeBooleanField("is_enum", data.isEnumType());
            g.writeBooleanField("is_interface", data.isInterfaceType());
            g.writeBooleanField("is_annotation", data.isAnnotationType());

            g.writeArrayFieldStart("modifiers");
            for(final CharSequence modifier : data.getModifiers())
            {
                g.writeString(modifier.toString());
            }
            g.writeEndArray();

            g.writeArrayFieldStart("interfaces");
            for(final CharSequence interfaceType : data.getInterfaces())
            {
                g.writeString(interfaceType.toString());
            }
            g.writeEndArray();

            g.writeArrayFieldStart("fields");
            for(final FieldData fieldData : data.getFields())
            {
                this.write(g, fieldData);
            }
            g.writeEndArray();

            g.writeArrayFieldStart("methods");
            for(final MethodData methodData : data.getMethods())
            {
                this.write(g, methodData);
            }
            g.writeEndArray();
        }
        g.writeEndObject();

        for(final ClassData classData : data.getClasses())
        {
            this.write(g, classData);
        }
    }

    private void write(JsonGenerator g, FieldData data)
        throws IOException
    {
        g.writeStartObject();
        {
            g.writeStringField("name", data.getName());
            g.writeStringField("type", data.getType());
            g.writeStringField("value", data.getValue());

            g.writeArrayFieldStart("modifiers");
            for(final CharSequence modifier : data.getModifiers())
            {
                g.writeString(toString(modifier));
            }
            g.writeEndArray();
        }
        g.writeEndObject();
    }

    private void write(JsonGenerator g, MethodData data)
        throws IOException
    {
        g.writeStartObject();
        {
            g.writeStringField("name", toString(data.getName()));
            g.writeStringField("return_type", toString(data.getReturnType()));

            g.writeArrayFieldStart("parameters");
            for(final MethodParameterData paramData : data.getParameters())
            {
                this.write(g, paramData);
            }
            g.writeEndArray();

            g.writeArrayFieldStart("throws");
            for(final ExceptionType exceptionData : data.getExceptionTypes())
            {
                this.write(g, exceptionData);
            }
            g.writeEndArray();

            g.writeArrayFieldStart("modifiers");
            for(final CharSequence modifier : data.getModifiers())
            {
                g.writeString(toString(modifier));
            }
            g.writeEndArray();
        }
        g.writeEndObject();
    }

    private void write(JsonGenerator g, MethodParameterData data)
        throws IOException
    {
        g.writeStartObject();
        {
            g.writeStringField("type", toString(data.getType()));
        }
        g.writeEndObject();
    }

    private void write(JsonGenerator g, ExceptionType data)
        throws IOException
    {
        g.writeStartObject();
        {
            g.writeStringField("type", toString(data.getType()));
        }
        g.writeEndObject();
    }

    private static String toString(Object o)
    {
        return (o != null) ? o.toString() : null;
    }
}

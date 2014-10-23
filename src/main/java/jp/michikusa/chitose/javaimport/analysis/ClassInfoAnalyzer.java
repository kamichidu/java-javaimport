package jp.michikusa.chitose.javaimport.analysis;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Lists;
import com.google.common.io.Closer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import jp.michikusa.chitose.javaimport.entity.ClassData;
import jp.michikusa.chitose.javaimport.entity.ExceptionType;
import jp.michikusa.chitose.javaimport.entity.FieldData;
import jp.michikusa.chitose.javaimport.entity.MethodData;
import jp.michikusa.chitose.javaimport.entity.MethodParameterData;
import jp.michikusa.chitose.javaimport.generate.parser.JavaLexer;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.AnnotationTypeDeclarationContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.AnnotationTypeElementDeclarationContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.ClassBodyDeclarationContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.ClassDeclarationContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.ClassOrInterfaceModifierContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.CompilationUnitContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.EnumDeclarationContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.FormalParameterContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.InterfaceBodyDeclarationContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.InterfaceDeclarationContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.LastFormalParameterContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.LocalVariableDeclarationContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.MemberDeclarationContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.ModifierContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.TypeContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.TypeDeclarationContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.VariableDeclaratorContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.VariableModifierContext;
import jp.michikusa.chitose.javaimport.predicate.IsAnonymouseClass;
import jp.michikusa.chitose.javaimport.predicate.IsClassFile;
import jp.michikusa.chitose.javaimport.predicate.IsJavaFile;
import jp.michikusa.chitose.javaimport.predicate.IsPackageInfo;
import jp.michikusa.chitose.javaimport.util.FileSystem;
import jp.michikusa.chitose.javaimport.util.FileSystem.Path;
import jp.michikusa.chitose.javaimport.util.JsonCodec;
import jp.michikusa.chitose.javaimport.util.LangSpec;
import jp.michikusa.chitose.javaimport.util.Stringifier;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.google.common.base.Predicates.and;
import static com.google.common.base.Predicates.not;
import static com.google.common.base.Predicates.or;
import static com.google.common.collect.Iterables.transform;

import static java.util.Arrays.asList;

import static jp.michikusa.chitose.javaimport.analysis.AbstractAnalyzer.toOutputDirectory;

public class ClassInfoAnalyzer
    implements Runnable
{
    public ClassInfoAnalyzer(File outputDir, File path, Charset sourceCharset)
        throws IOException
    {
        this.outputDir= toOutputDirectory(outputDir, path);
        this.fs= FileSystem.create(path);
        this.sourceCharset= sourceCharset;
    }

    @Override
    public void run()
    {
        final ExecutorService service= Executors.newCachedThreadPool();
        try
        {
            if(!this.outputDir.exists())
            {
                this.outputDir.mkdirs();
            }

            @SuppressWarnings("unchecked")
            final Predicate<Path> predicate= and(
                or(new IsClassFile(), new IsJavaFile()),
                not(new IsPackageInfo()),
                not(new IsAnonymouseClass())
            );
            final ImmutableMultimap<String, Path> entries= this.splitEntries(this.fs.listFiles(predicate));
            final List<Future<?>> tasks= new ArrayList<Future<?>>(entries.keySet().size());
            for(final String pkg : entries.keySet())
            {
                tasks.add(service.submit(new Task(new File(this.outputDir, pkg), this.fs, entries.get(pkg), this.sourceCharset)));
            }
            // stop tasking
            service.shutdown();
            // wait for task
            for(final Future<?> task : tasks)
            {
                task.get();
            }
        }
        catch(IOException e)
        {
            throw new RuntimeException(e);
        }
        catch(Exception e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
            service.shutdownNow();
        }
    }

    private ImmutableMultimap<String, Path> splitEntries(Iterable<? extends Path> entries)
    {
        final ImmutableMultimap.Builder<String, Path> builder= ImmutableMultimap.builder();

        for(final Path entry : entries)
        {
            builder.put(LangSpec.packageFromPath(entry.getParent()), entry);
        }

        return builder.build();
    }

    private static class Task
        extends AbstractAnalyzer
    {
        public Task(File outfile, FileSystem fs, Iterable<? extends Path> entries, Charset sourceCharset)
            throws IOException
        {
            super(outfile);

            this.fs= fs;
            this.entries= entries;
            this.sourceCharset= sourceCharset;
        }

        @Override
        public void runImpl(File outfile)
        {
            final Closer closer= Closer.create();
            try
            {
                final JsonGenerator g= closer.register(new JsonFactory(new JsonCodec()).createGenerator(new FileOutputStream(outfile)));
                /* final JsonGenerator g= closer.register(new JsonFactory(new JsonCodec()).createGenerator(new FilterOutputStream(System.out){ */
                /*     @Override */
                /*     public void close() throws IOException { */
                /*     } */
                /* })); */
                g.setPrettyPrinter(new DefaultPrettyPrinter());

                g.writeStartArray();
                for(final Path entry : this.entries)
                {
                    logger.debug("Reading `{}'.", entry.getFilename());

                    InputStream in= null;
                    try
                    {
                        final String filename= entry.getFilename().toString();

                        in= this.fs.openInputStream(filename);

                        if(filename.endsWith(".class"))
                        {
                            this.emmitClassInfoFromClassFile(g, in);
                        }
                        else if(filename.endsWith(".java"))
                        {
                            this.emmitClassInfoFromJavaFile(g, in);
                        }
                        else
                        {
                            logger.warn("Couldn't handle unknown file type `{}', ignoring...", filename);
                        }
                    }
                    finally
                    {
                        if(in != null)
                        {
                            in.close();
                        }
                    }
                }
                g.writeEndArray();
            }
            catch(IOException e)
            {
                logger.error("An exception occured during analysis task.", e);
            }
            finally
            {
                try
                {
                    closer.close();
                }
                catch(IOException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }

        private void emmitClassInfoFromClassFile(JsonGenerator g, InputStream in)
            throws IOException
        {
            final ClassReader reader= new ClassReader(in);
            final ClassEmitter emitter= new ClassEmitter();

            reader.accept(emitter, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);

            g.writeObject(emitter.getBuiltObject());
        }

        private void emmitClassInfoFromJavaFile(JsonGenerator g, InputStream in)
            throws IOException
        {
            final JavaParser parser= new JavaParser(new CommonTokenStream(new JavaLexer(new ANTLRInputStream(new InputStreamReader(in, this.sourceCharset)))));

            for(final ClassData data : this.buildClassData(parser.compilationUnit()))
            {
                g.writeObject(data);
            }
        }

        private Iterable<ClassData> buildClassData(CompilationUnitContext ctx)
        {
            final List<ClassData> classes= Lists.newArrayList();

            for(final TypeDeclarationContext typeDecl : ctx.typeDeclaration())
            {
                final ClassData data= new ClassData();

                data.setPackageName(ctx.packageDeclaration().qualifiedName().getText());
                this.collectClassData(data, typeDecl);

                classes.add(data);
            }

            return classes;
        }

        private void collectClassData(ClassData data, TypeDeclarationContext ctx)
        {
            data.setModifiers(this.getModifiers(ctx));

            if(ctx.classDeclaration() != null)
            {
                this.collectClassData(data, ctx.classDeclaration());
            }
            else if(ctx.enumDeclaration() != null)
            {
                this.collectClassData(data, ctx.enumDeclaration());
            }
            else if(ctx.interfaceDeclaration() != null)
            {
                this.collectClassData(data, ctx.interfaceDeclaration());
            }
            else if(ctx.annotationTypeDeclaration() != null)
            {
                this.collectClassData(data, ctx.annotationTypeDeclaration());
            }
        }

        private void collectClassData(ClassData data, ClassDeclarationContext ctx)
        {
            data.setSimpleName(ctx.Identifier().getText());
            data.setCanonicalName(data.getPackageName() + "." + data.getSimpleName());
            data.setName(data.getCanonicalName());
            if(ctx.type() != null)
            {
                data.setSuperclass(ctx.type().getText());
            }
            if(ctx.typeList() != null)
            {
                for(final TypeContext typeCtx : ctx.typeList().type())
                {
                    data.addInterface(typeCtx.getText());
                }
            }
            if(ctx.classBody() != null)
            {
                for(final ClassBodyDeclarationContext bodyCtx : ctx.classBody().classBodyDeclaration())
                {
                    if(bodyCtx.memberDeclaration() != null)
                    {
                        this.collectClassData(data, bodyCtx.memberDeclaration());
                    }
                }
            }
        }

        private void collectClassData(ClassData data, EnumDeclarationContext ctx)
        {
            data.setSimpleName(ctx.Identifier().getText());
            data.setCanonicalName(data.getPackageName() + "." + data.getSimpleName());
            data.setName(data.getCanonicalName());
            data.setEnumType(true);
        }

        private void collectClassData(ClassData data, InterfaceDeclarationContext ctx)
        {
            data.setSimpleName(ctx.Identifier().getText());
            data.setCanonicalName(data.getPackageName() + "." + data.getSimpleName());
            data.setName(data.getCanonicalName());
            data.setInterfaceType(true);
        }

        private void collectClassData(ClassData data, AnnotationTypeDeclarationContext ctx)
        {
            data.setSimpleName(ctx.Identifier().getText());
            data.setCanonicalName(data.getPackageName() + "." + data.getSimpleName());
            data.setName(data.getCanonicalName());
            data.setAnnotationType(true);
        }

        private void collectClassData(ClassData data, ClassOrInterfaceModifierContext ctx)
        {
            final Set<String> modifiers= new HashSet<String>();
            for(int i= 0; i < ctx.getChildCount(); ++i)
            {
                modifiers.add(ctx.getChild(i).getText());
            }
            data.setModifiers(modifiers);
        }

        private void collectClassData(ClassData data, MemberDeclarationContext ctx)
        {
            if(ctx.methodDeclaration() != null)
            {
                // TODO
            }
            else if(ctx.genericMethodDeclaration() != null)
            {
                // TODO
            }
            else if(ctx.fieldDeclaration() != null)
            {
                final Iterable<CharSequence> modifiers= this.getModifiers(ctx);
                for(final VariableDeclaratorContext child : ctx.fieldDeclaration().variableDeclarators().variableDeclarator())
                {
                    final FieldData field= new FieldData();

                    field.setModifiers(modifiers);
                    field.setType(ctx.fieldDeclaration().type().getText());
                    field.setName(child.variableDeclaratorId().getText());
                    if(child.variableInitializer() != null)
                    {
                        field.setValue(child.variableInitializer().getText());
                    }

                    data.addField(field);
                }
            }
            else if(ctx.constructorDeclaration() != null)
            {
                // TODO
            }
            else if(ctx.genericConstructorDeclaration() != null)
            {
                // TODO
            }
            else if(ctx.interfaceDeclaration() != null || ctx.annotationTypeDeclaration() != null || ctx.classDeclaration() != null || ctx.enumDeclaration() != null)
            {
                final ClassData clazz= new ClassData();

                clazz.setPackageName(data.getPackageName());
                clazz.setModifiers(this.getModifiers(ctx));

                if(ctx.interfaceDeclaration() != null)
                {
                    this.collectClassData(clazz, ctx.interfaceDeclaration());
                }
                else if(ctx.annotationTypeDeclaration() != null)
                {
                    this.collectClassData(clazz, ctx.annotationTypeDeclaration());
                }
                else if(ctx.classDeclaration() != null)
                {
                    this.collectClassData(clazz, ctx.classDeclaration());
                }
                else
                {
                    this.collectClassData(clazz, ctx.enumDeclaration());
                }

                clazz.setSimpleName(data.getSimpleName() + "." + clazz.getSimpleName());
                clazz.setName(clazz.getPackageName() + "." + data.getSimpleName() + "." + clazz.getSimpleName());
                clazz.setCanonicalName(clazz.getPackageName() + "." + data.getSimpleName() + "." + clazz.getSimpleName());

                data.addClass(clazz);
            }
        }

        private Iterable<CharSequence> getModifiers(MemberDeclarationContext ctx)
        {
            if(!(ctx.getParent() instanceof ClassBodyDeclarationContext))
            {
                return Collections.emptyList();
            }

            return this.getModifiers((ClassBodyDeclarationContext)ctx.getParent());
        }

        private Iterable<CharSequence> getModifiers(TypeDeclarationContext ctx)
        {
            final ImmutableList.Builder<CharSequence> builder= ImmutableList.builder();
            for(final ClassOrInterfaceModifierContext mctx : ctx.classOrInterfaceModifier())
            {
                final CharSequence modifier= this.getModifier(mctx);
                if(modifier != null)
                {
                    builder.add(modifier);
                }
            }
            return builder.build();
        }

        private Iterable<CharSequence> getModifiers(ClassBodyDeclarationContext ctx)
        {
            final ImmutableList.Builder<CharSequence> builder= ImmutableList.builder();
            for(final ModifierContext mctx : ctx.modifier())
            {
                final CharSequence modifier= this.getModifier(mctx);
                if(modifier != null)
                {
                    builder.add(modifier);
                }
            }
            return builder.build();
        }

        private Iterable<CharSequence> getModifiers(FormalParameterContext ctx)
        {
            final ImmutableList.Builder<CharSequence> builder= ImmutableList.builder();
            for(final VariableModifierContext mctx : ctx.variableModifier())
            {
                final CharSequence modifier= this.getModifier(mctx);
                if(modifier != null)
                {
                    builder.add(modifier);
                }
            }
            return builder.build();
        }

        private Iterable<CharSequence> getModifiers(LastFormalParameterContext ctx)
        {
            final ImmutableList.Builder<CharSequence> builder= ImmutableList.builder();
            for(final VariableModifierContext mctx : ctx.variableModifier())
            {
                final CharSequence modifier= this.getModifier(mctx);
                if(modifier != null)
                {
                    builder.add(modifier);
                }
            }
            return builder.build();
        }

        private Iterable<CharSequence> getModifiers(InterfaceBodyDeclarationContext ctx)
        {
            final ImmutableList.Builder<CharSequence> builder= ImmutableList.builder();
            for(final ModifierContext mctx : ctx.modifier())
            {
                final CharSequence modifier= this.getModifier(mctx);
                if(modifier != null)
                {
                    builder.add(modifier);
                }
            }
            return builder.build();
        }

        private Iterable<CharSequence> getModifiers(AnnotationTypeElementDeclarationContext ctx)
        {
            final ImmutableList.Builder<CharSequence> builder= ImmutableList.builder();
            for(final ModifierContext mctx : ctx.modifier())
            {
                final CharSequence modifier= this.getModifier(mctx);
                if(modifier != null)
                {
                    builder.add(modifier);
                }
            }
            return builder.build();
        }

        private CharSequence getModifier(ModifierContext ctx)
        {
            if(ctx.classOrInterfaceModifier() != null)
            {
                return this.getModifier(ctx.classOrInterfaceModifier());
            }
            else
            {
                final TerminalNode terminal= ctx.getChild(TerminalNode.class, 0);
                if(terminal != null)
                {
                    return terminal.getText();
                }
            }
            return null;
        }

        private CharSequence getModifier(ClassOrInterfaceModifierContext ctx)
        {
            if(ctx.annotation() == null)
            {
                final TerminalNode terminal= ctx.getChild(TerminalNode.class, 0);
                if(terminal != null)
                {
                    return terminal.getText();
                }
            }
            return null;
        }

        private CharSequence getModifier(VariableModifierContext ctx)
        {
            if(ctx.annotation() == null)
            {
                final TerminalNode terminal= ctx.getChild(TerminalNode.class, 0);
                if(terminal != null)
                {
                    return terminal.getText();
                }
            }
            return null;
        }

        private final FileSystem fs;

        private final Iterable<? extends Path> entries;

        private final Charset sourceCharset;
    }

    private static class ClassEmitter
        extends ClassVisitor
    {
        public ClassEmitter()
        {
            super(Opcodes.ASM5);
        }

        public ClassData getBuiltObject()
        {
            return this.object;
        }

        @Override
        public void visit(int version, int access, String name, String signature, String superName, String[] interfaces)
        {
            final String canonicalName= LangSpec.canonicalNameFromBinaryName(name);
            final String simpleName= canonicalName.contains(".") ? canonicalName.substring(canonicalName.lastIndexOf(".") + 1) : canonicalName;

            this.object.setCanonicalName(canonicalName);
            this.object.setSimpleName(simpleName);
            this.object.setName(LangSpec.nameFromBinaryName(name));
            this.object.setSuperclass(superName != null ? LangSpec.canonicalNameFromBinaryName(superName) : "");
            this.object.setEnumType((access & Opcodes.ACC_ENUM) == Opcodes.ACC_ENUM);
            this.object.setInterfaceType((access & Opcodes.ACC_INTERFACE) == Opcodes.ACC_INTERFACE);
            this.object.setAnnotationType((access & Opcodes.ACC_ANNOTATION) == Opcodes.ACC_ANNOTATION);
            this.object.setModifiers(Stringifier.classAccessFlags(access));
            this.object.setInterfaces(transform(asList(interfaces), new Function<String, String>(){
                @Override
                public String apply(String input) {
                    return LangSpec.canonicalNameFromBinaryName(input);
                }
            }));
        }

        @Override
        public FieldVisitor visitField(int access, String name, String desc, String signature, Object value)
        {
            final FieldData field= new FieldData();

            field.setName(name);
            field.setType(Type.getType(desc).getClassName());
            field.setValue("" + value);
            field.setModifiers(Stringifier.fieldAccessFlags(access));

            this.object.addField(field);

            return null;
        }

        @Override
        public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions)
        {
            final Type type= Type.getMethodType(desc);
            final MethodData method= new MethodData();

            method.setName(name);
            method.setReturnType(type.getReturnType().getClassName());

            for(final Type argType : type.getArgumentTypes())
            {
                final MethodParameterData paramData= new MethodParameterData();

                paramData.setType(argType.getClassName());

                method.addParameter(paramData);
            }

            for(final String exception : (exceptions != null ? exceptions : new String[0]))
            {
                final ExceptionType exceptionType= new ExceptionType();

                exceptionType.setType(Type.getType(exception).getClassName());

                method.addExceptionType(exceptionType);
            }

            method.setModifiers(Stringifier.methodAccessFlags(access));

            this.object.addMethod(method);

            return null;
        }

        private final ClassData object= new ClassData();
    }

    private static final Logger logger= LoggerFactory.getLogger(ClassInfoAnalyzer.class);

    private final File outputDir;

    private final FileSystem fs;

    private final Charset sourceCharset;
}

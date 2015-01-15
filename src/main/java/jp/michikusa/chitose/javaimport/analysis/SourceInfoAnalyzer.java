package jp.michikusa.chitose.javaimport.analysis;

import static com.google.common.base.Predicates.and;
import static com.google.common.base.Predicates.not;
import static jp.michikusa.chitose.javaimport.analysis.AbstractAnalyzer.toOutputDirectory;

import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import jp.michikusa.chitose.javaimport.entity.ClassData;
import jp.michikusa.chitose.javaimport.generate.parser.Java8Lexer;
import jp.michikusa.chitose.javaimport.generate.parser.Java8Parser;
import jp.michikusa.chitose.javaimport.generate.parser.Java8Parser.CompilationUnitContext;
import jp.michikusa.chitose.javaimport.generate.parser.Java8Parser.InterfaceTypeContext;
import jp.michikusa.chitose.javaimport.generate.parser.Java8Parser.TypeDeclarationContext;
import jp.michikusa.chitose.javaimport.predicate.IsAnonymouseClass;
import jp.michikusa.chitose.javaimport.predicate.IsJavaFile;
import jp.michikusa.chitose.javaimport.predicate.IsPackageInfo;
import jp.michikusa.chitose.javaimport.util.FileSystem;
import jp.michikusa.chitose.javaimport.util.FileSystem.Path;
import jp.michikusa.chitose.javaimport.util.JsonCodec;
import jp.michikusa.chitose.javaimport.util.LangSpec;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Lists;
import com.google.common.io.Closer;

public class SourceInfoAnalyzer
    implements Runnable
{
    public SourceInfoAnalyzer(File outputDir, File path, Charset sourceCharset)
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
                new IsJavaFile(),
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
                /* final JsonGenerator g= closer.register(new JsonFactory(new JsonCodec()).createGenerator(new FileOutputStream(outfile))); */
                final JsonGenerator g= closer.register(new JsonFactory(new JsonCodec()).createGenerator(new FilterOutputStream(System.out){
                    @Override
                    public void close() throws IOException {
                    }
                }));
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

                        if(filename.endsWith(".java"))
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

        private void emmitClassInfoFromJavaFile(JsonGenerator g, InputStream in)
            throws IOException
        {
            final Java8Parser parser= new Java8Parser(new CommonTokenStream(new Java8Lexer(new ANTLRInputStream(new InputStreamReader(in, this.sourceCharset)))));

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

                data.setPackageName(ctx.packageDeclaration().Identifier().toString());

                this.collectClassData(data, typeDecl);

                classes.add(data);
            }

            return classes;
        }

        private void collectClassData(ClassData data, TypeDeclarationContext ctx)
        {
            data.setSimpleName(ctx.Identifier().getText());
            data.setCanonicalName(data.getPackageName() + "." + data.getSimpleName());
            data.setName(data.getCanonicalName());

            if(ctx.typeParameters() != null)
            {
                // TODO
            }
            if(ctx.superclass() != null)
            {
                data.setSuperclass(ctx.superclass().classType().Identifier().getText());
            }
            if(ctx.superinterfaces() != null)
            {
                for(final InterfaceTypeContext ifCtx : ctx.superinterfaces().interfaceTypeList().interfaceType())
                {
                    data.addInterface(ifCtx.classType().Identifier().getText());
                }
            }
            if(ctx.extendsInterfaces() != null)
            {
                for(final InterfaceTypeContext ifCtx : ctx.extendsInterfaces().interfaceTypeList().interfaceType())
                {
                    data.addInterface(ifCtx.classType().Identifier().getText());
                }
            }

            // class decl
            if(ctx.classBody() != null)
            {

            }
            // enum decl
            else if(ctx.enumBody() != null)
            {
                data.setEnumType(true);
            }
            // interface decl
            else if(ctx.interfaceBody() != null)
            {
                data.setInterfaceType(true);
            }
            // annotation decl
            else if(ctx.annotationTypeBody() != null)
            {
                data.setAnnotationType(true);
            }
        }

        private final FileSystem fs;

        private final Iterable<? extends Path> entries;

        private final Charset sourceCharset;
    }

    private static final Logger logger= LoggerFactory.getLogger(SourceInfoAnalyzer.class);

    private final File outputDir;

    private final FileSystem fs;

    private final Charset sourceCharset;
}

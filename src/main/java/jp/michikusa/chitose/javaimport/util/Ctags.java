package jp.michikusa.chitose.javaimport.util;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import jp.michikusa.chitose.javaimport.entity.ClassData;
import jp.michikusa.chitose.javaimport.entity.FieldData;
import jp.michikusa.chitose.javaimport.generate.parser.JavaBaseListener;
import jp.michikusa.chitose.javaimport.generate.parser.JavaLexer;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.AnnotationTypeDeclarationContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.ClassDeclarationContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.ClassOrInterfaceModifierContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.EnumDeclarationContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.FieldDeclarationContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.InterfaceDeclarationContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.MemberDeclarationContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.PackageDeclarationContext;
import jp.michikusa.chitose.javaimport.generate.parser.JavaParser.VariableDeclaratorContext;
import lombok.ToString;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.collect.Sets;

public abstract class Ctags {
	@ToString
	public static class ClassInfoCollector extends JavaBaseListener {
		public ClassData getBuiltObject() {
			return this.object;
		}

		@Override
		public void exitPackageDeclaration(PackageDeclarationContext ctx) {
			this.object.setPackageName(ctx.qualifiedName().getText());
		}

		@Override
		public void exitClassDeclaration(ClassDeclarationContext ctx) {
			this.object.setSimpleName(ctx.Identifier().getText());
			this.object.setCanonicalName(this.object.getPackageName() + "." + this.object.getSimpleName());
			this.object.setName(this.object.getCanonicalName());
		}

		@Override
		public void exitEnumDeclaration(EnumDeclarationContext ctx) {
			this.object.setSimpleName(ctx.Identifier().getText());
			this.object.setCanonicalName(this.object.getPackageName() + "." + this.object.getSimpleName());
			this.object.setName(this.object.getCanonicalName());
			this.object.setEnumType(true);
		}

		@Override
		public void exitInterfaceDeclaration(InterfaceDeclarationContext ctx) {
			this.object.setSimpleName(ctx.Identifier().getText());
			this.object.setCanonicalName(this.object.getPackageName() + "." + this.object.getSimpleName());
			this.object.setName(this.object.getCanonicalName());
			this.object.setInterfaceType(true);
		}

		@Override
		public void exitAnnotationTypeDeclaration(AnnotationTypeDeclarationContext ctx) {
			this.object.setSimpleName(ctx.Identifier().getText());
			this.object.setCanonicalName(this.object.getPackageName() + "." + this.object.getSimpleName());
			this.object.setName(this.object.getCanonicalName());
			this.object.setAnnotationType(true);
		}
		
		@Override
		public void exitClassOrInterfaceModifier(ClassOrInterfaceModifierContext ctx) {
			final Set<String> modifiers= new HashSet<String>();
			for(int i= 0; i < ctx.getChildCount(); ++i)
			{
				modifiers.add(ctx.getChild(i).getText());
			}
			this.object.setModifiers(modifiers);
		}

		@Override
		public void exitMemberDeclaration(MemberDeclarationContext ctx) {
		    if(ctx.methodDeclaration() != null)
		    {
		    }
		    if(ctx.genericMethodDeclaration() != null)
		    {
		    }
		    if(ctx.fieldDeclaration() != null)
		    {
		    }
		    if(ctx.constructorDeclaration() != null)
		    {
		    }
		    if(ctx.genericConstructorDeclaration() != null)
		    {
		    }
		    if(ctx.interfaceDeclaration() != null)
		    {
		    }
		    if(ctx.annotationTypeDeclaration() != null)
		    {
		    	System.out.println(ctx.getText());
		    }
		    if(ctx.classDeclaration() != null)
		    {
		    	System.out.println(ctx.getText());
		    }
		    if(ctx.enumDeclaration() != null)
		    {
		    	System.out.println(ctx.getText());
		    }
		}

		@Override
		public void exitFieldDeclaration(FieldDeclarationContext ctx) {
			final Set<FieldData> fields= Sets.newLinkedHashSet(this.object.getFields());

			for(final VariableDeclaratorContext child : ctx.variableDeclarators().variableDeclarator())
			{
				final FieldData field= new FieldData();

				field.setType(ctx.type().getText());
				field.setName(child.variableDeclaratorId().getText());
				if(child.variableInitializer() != null)
				{
					field.setValue(child.variableInitializer().getText());
				}

				fields.add(field);
			}

			this.object.setFields(fields);
		}

		private final ClassData object= new ClassData();
	}

	public static void main(String[] args) throws Exception {
		final File root = new File("/workspace/ns/nkrm/src/main/java/");

		walk(root);
	}

	private static void walk(File dir) throws Exception {
		final FileFilter javaFileFilter = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isFile()
						&& pathname.getName().endsWith(".java");
			}
		};
		final FileFilter directoryFilter = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isDirectory();
			}
		};

		if (dir.listFiles(javaFileFilter).length > 0) {
			for (final File file : dir.listFiles(javaFileFilter)) {
				final JavaParser parser = new JavaParser(new CommonTokenStream(new JavaLexer(new ANTLRFileStream(file.getAbsolutePath(), "Windows-31j"))));

				final ClassInfoCollector info = new ClassInfoCollector();
				parser.addParseListener(info);

				parser.compilationUnit();

//				g.writeObject(info.getBuiltObject());
//				System.out.println(info);
			}
			// for(final TagData tag : Ctags.analyze(dir))
			// {
			// System.out.println(tag);
			// }
		}

		for (final File child : dir.listFiles(directoryFilter)) {
			walk(child);
		}
	}

	private Ctags() {
		throw new AssertionError();
	}
}

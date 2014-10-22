package jp.michikusa.chitose.javaimport.util;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import static com.google.common.collect.Iterables.transform;

public abstract class FileSystem {
	@RequiredArgsConstructor
	@EqualsAndHashCode
	@ToString
	public static final class Path {
		@Getter
		private final boolean directory;

		@Getter
		@NonNull
		private final CharSequence filename;
	}

	public static FileSystem create(File path) {
		if (path.isDirectory()) {
			return new DirectoryWalker(path);
		}
		if (path.getName().endsWith(".jar") || path.getName().endsWith(".zip")) {
			return new JarWalker(path);
		}
		throw new RuntimeException();
	}

	public abstract Iterable<Path> listFiles(Predicate<? super Path> predicate);

	public abstract InputStream openInputStream(CharSequence filename)
			throws IOException;

	FileSystem() {
	}

	static class DirectoryWalker extends FileSystem {
		public DirectoryWalker(File path) {
			this.path = path;
		}

		@Override
		public Iterable<Path> listFiles(final Predicate<? super Path> predicate) {
			final Iterable<File> files= this.listFiles(this.path, new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					return predicate.apply(new Path(pathname.isDirectory(), pathname.getName()));
				}
			});
			return transform(files, new Function<File, Path>(){
				@Override
				public Path apply(File input) {
					return new Path(input.isDirectory(), input.getName());
				}
			});
		}

		@Override
		public InputStream openInputStream(CharSequence filename)
				throws IOException {
			final File file = new File(filename.toString());

			if (file.isAbsolute()) {
				return new FileInputStream(file);
			} else {
				return new FileInputStream(new File(this.path, file.getName()));
			}
		}

		private Iterable<File> listFiles(File file, FileFilter filter)
		{
			final ImmutableList.Builder<File> files= ImmutableList.builder();
			for(final File child : file.listFiles(filter))
			{
				if(child.isDirectory())
				{
					files.add(child);
					files.addAll(this.listFiles(child, filter));
				}
				else
				{
					files.add(child);
				}
			}
			return files.build();
		}

		private final File path;
	}

	static class JarWalker extends FileSystem {
		public JarWalker(File path) {
			this.path = path;
		}

		@Override
		public Iterable<Path> listFiles(Predicate<? super Path> predicate) {
			final JarFile jar= this.getJarFile();
			
			final ImmutableList.Builder<Path> paths= ImmutableList.builder();
			for(final JarEntry entry : Collections.list(jar.entries()))
			{
				final Path path= new Path(entry.isDirectory(), entry.getName());
				if(predicate.apply(path))
				{
					paths.add(path);
				}
			}
			return paths.build();
		}

		@Override
		public InputStream openInputStream(CharSequence filename)
				throws IOException {
			return this.getJarFile().getInputStream(this.getJarFile().getEntry(filename.toString()));
		}
		
		private JarFile getJarFile()
		{
			try{
				if(this.jar == null)
				{
					this.jar= new JarFile(this.path);
				}
				return this.jar;
			}catch(IOException e)
			{
				throw new RuntimeException(e);
			}
		}

		private final File path;

		private JarFile jar;
	}

	public static void main(String[] args) {
		final Predicate<Path> predicate= Predicates.and(
			new Predicate<Path>(){
				public boolean apply(Path input) { return !input.isDirectory(); }
			}
		);

		watch(new File(System.getenv("TEMP"), "abcdefg/"), predicate);
		watch(new File(System.getenv("TEMP"), "abcdefg/src.zip"), predicate);
	}
	
	private static void watch(File file, Predicate<? super Path> predicate)
	{
		final long startTime= System.nanoTime();
		final List<Path> paths= Lists.newArrayList(FileSystem.create(file).listFiles(predicate));
		final long endTime= System.nanoTime();

		for (final Path path : paths) {
			System.out.println(path);
		}
		System.out.println("size = " + paths.size());
		System.out.format("time required: %s [ns]%n", NumberFormat.getNumberInstance().format(endTime - startTime));
	}
}

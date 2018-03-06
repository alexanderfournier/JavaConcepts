package properties;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchEvent.Modifier;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class DecoratedPath implements Path {
	
	private  final Path path;
	
	
	
	public DecoratedPath(Path path) {
		this.path = path;
	}
	
	public DecoratedPath(String path) {
		this(Paths.get(path));
	}
	
	@Override
	public int compareTo(Path other) {
		return path.compareTo(other);
	}
	
	@Override
	public boolean endsWith(Path other) {
		return path.endsWith(other);
	}

	@Override
	public Path getFileName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileSystem getFileSystem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Path getName(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNameCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Path getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Path getRoot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAbsolute() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Path normalize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WatchKey register(WatchService arg0, Kind<?>[] arg1, Modifier... arg2) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Path relativize(Path arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Path resolve(Path arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean startsWith(Path arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Path subpath(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Path toAbsolutePath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Path toRealPath(LinkOption... arg0) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URI toUri() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return String.format("%s", path);
	}
	


}

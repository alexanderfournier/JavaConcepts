package properties;
import java.util.Properties;
import java.io.BufferedWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main1 {

	public static void main(String[] args) {
		Path p1 = Paths.get("test1.properties");
		Properties props = new Properties();
		DecoratedPath decpath = new DecoratedPath("test1.properties");
	


		
		props.setProperty("job", "engineer");
		
		props.setProperty("salary","100k");
		
		try(Reader reader = Files.newBufferedReader(decpath)){
			props.load(reader);
		}
		catch(Exception e) {
			System.out.println("oops");
		}
		
		try(Writer writer = Files.newBufferedWriter(decpath)){
			props.store(writer, "my comment");
		}
		catch(Exception e)	{
			System.out.println("oops2");
		}
		
	}
	}
package storexml;

import java.io.OutputStream;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		Properties props = new Properties();
		props.setProperty("alex","engineer");
		props.setProperty("dan", "accountant");
		
		try(OutputStream out = Files.newOutputStream(
				Paths.get("props.xml"))){
			props.storeToXML(out, "yup");}
			
		}
	}
}
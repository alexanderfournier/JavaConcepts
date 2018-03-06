package cmdline;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		if(args.length == 0) {
			showUsage();
			return;
		}
			
		String filename = args[0];
		if(!Files.exists(Paths.get(filename))) {
			System.out.println("\n filename not found" + filename);
		}
		showLines(filename);
	}
	
	
		private static void showLines(String filename) {
			System.out.println();
		
			try(BufferedReader buff = Files.newBufferedReader(Paths.get(filename))) {
				String line= null;
				while((line = buff.readLine()) != null) 
					System.out.println(line);
			
			}catch(Exception ex) {
				System.out.println(ex.getClass().getSimpleName() + " - " + ex.getMessage());
				
			}
			
		}
		
		
		
		private static void showUsage() {
			System.out.println();
			System.out.println("please provide the filename");
		}
}
			
			
		
		
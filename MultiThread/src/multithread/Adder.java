package multithread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Adder {
	

	private String infile;
	private String outfile;
	
	public Adder(String infile,String outfile) {
		this.infile = infile;
		this.outfile = outfile;
	}
	
	
	public String getInfile() {
		return infile;
	}
	public void setInfile(String infile) {
		this.infile = infile;
	}
	public String getOutfile() {
		return outfile;
	}
	public void setOutfile(String outfile) {
		this.outfile = outfile;
		
	}
	
	
	public void doAdd() throws IOException {
		int total = 0;
		String line = null;
		try(BufferedReader reader =  Files.newBufferedReader(Paths.get(infile))){
			while((line = reader.readLine()) != null)
				total += Integer.parseInt(line);
		}
		
		try(BufferedWriter writer = Files.newBufferedWriter(Paths.get(outfile){
			writer.write("total : " + total);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
	
			}
			
			
		};
	}

}

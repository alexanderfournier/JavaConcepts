package defaultprops;

import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		
		Properties defaults = new Properties();
		defaults.setProperty("position1", "1");
		
		Properties props = new Properties(defaults);
		String NextPost = props.getProperty("position1");

	}

}

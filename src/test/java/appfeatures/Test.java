package appfeatures;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {
	
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();

		String path = System.getProperty("user.dir") + "//src//test//resources//config.properties";

		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		
		String value = prop.getProperty("browser");
		
		System.out.println(value);
	}

}

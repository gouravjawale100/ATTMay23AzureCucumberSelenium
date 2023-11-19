package utils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Properties;



public class ConfigReader {
	
	public String readConfigFile(String value) throws IOException
	{
		Properties properties = new Properties();
		String file = "Config/config.properties"; 
		InputStream inputstream = getClass().getClassLoader().getResourceAsStream(file); 
		properties.load(inputstream); 
		
		String v= properties.getProperty(value);
		
		System.out.println(v);
	
		
return v;
		
		
	}
	
	
	
	
	
	
	private static final String DEFAULT_PROPERTIES = "Configs/config.properties";
    private static Properties properties;
    
    public static String initialize(String browser){

        // load default properties
        properties = loadProperties();
       String value = properties.getProperty(browser);
       
       System.out.println(value);
       
return value;
    }



 public static InputStream getResource(String path) throws Exception {
      
        InputStream stream = ConfigReader.class.getClassLoader().getResourceAsStream(path);
        if(Objects.nonNull(stream)){
            return stream;
        }
        return Files.newInputStream(Path.of(path));
    }

   private static Properties loadProperties(){
        Properties properties = new Properties();
        try(InputStream stream = ConfigReader.getResource(DEFAULT_PROPERTIES)){
            properties.load(stream);
        }catch (Exception e){
            System.out.println("unable to read the property file {}"+" "+ DEFAULT_PROPERTIES + e);
        }
        return properties;
    }
   
   public static void main(String[] args) throws IOException {
		

		
	   ConfigReader cr = new ConfigReader();
	   
	   System.out.println(cr.readConfigFile("browser"));
		
		
		
	}

}

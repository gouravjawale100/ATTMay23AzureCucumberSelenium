package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	static WebDriver driver;
	public WebDriver initBrowser(String browsername)
	{
	
		if(browsername.equals("Chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			
		 driver = new ChromeDriver(options);
		}
		else if(browsername.equals("firefox"))
		{
			 driver = new FirefoxDriver();
			 
			 
			 
		}
		
		return driver;
	}
	
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	
	
	

}

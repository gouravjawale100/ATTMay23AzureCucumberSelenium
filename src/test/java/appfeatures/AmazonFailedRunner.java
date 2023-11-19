package appfeatures;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
//		features = {"src\\test\\resources\\appfeatures"},
		
		features = {"@target/failedrun.txt"},
		
		glue = {"appfeatures"},
		
		plugin = {"pretty", 
				"rerun:target/failedrun.txt"
		}
		
		)


public class AmazonFailedRunner extends AbstractTestNGCucumberTests{

}

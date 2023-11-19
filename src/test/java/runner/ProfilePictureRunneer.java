package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\ProfilePicture.feature"},
		
		glue = {"steps", "hooks"},
		
		plugin = {"pretty"}
		
		
		
		)

public class ProfilePictureRunneer extends AbstractTestNGCucumberTests
{

}

package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\BackgroungWithScenarioOutline.feature"},
		
		glue = {"steps"},
		
		plugin = {"pretty"}
		
		)

public class BackgroundScenarioOutlineRunner extends AbstractTestNGCucumberTests
{

}

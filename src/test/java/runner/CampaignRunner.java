package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features = {"src\\test\\resources\\applicationtest\\CampaignStatus.feature"},
		
		glue = {"steps", "hooks"},
		
		plugin = {"pretty"},
		
//		tags = ("(@sanity or @functional) and (not @regression)")
		
		dryRun = false
		
		
		
		)

public class CampaignRunner extends AbstractTestNGCucumberTests{

}

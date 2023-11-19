package appfeatures;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.DriverFactory;
import qa.GridTest;
import utils.ConfigReader;

public class AppsHooks {
	WebDriver driver;
	DriverFactory df;

	GridTest gridtest;

	@Before
	public void launchBrowser() throws IOException {
		System.out.println("Reading data from config");
		ConfigReader cr = new ConfigReader();
		String browsername = cr.readConfigFile("browser");

		String mBrowser = System.getProperty("mavenbrowser");
		
		boolean isGridEnabled = Boolean.getBoolean("gridenabled");
		
		System.out.println("Value of isGridEnabled is "+isGridEnabled);
		
		
		if (mBrowser != null) {
			browsername = mBrowser;
			System.out.println("Value set to browsername is :" + browsername);
		}
		System.out.println(browsername);
		String grid = cr.readConfigFile("execution");
		if (grid.equalsIgnoreCase("gridbase")) {
			gridtest = new GridTest();

			driver = gridtest.getRemoteDriver(browsername);
		} else {
			df = new DriverFactory();

			driver = df.initBrowser(browsername);
		}
		driver.manage().window().maximize();

	}

	@After(order = 2)
	public void tearDown(Scenario scenario) {
		boolean isScenarioFailed = scenario.isFailed();

		if (isScenarioFailed) {
			String scenarioName = scenario.getName();

			String name = scenarioName.replace(" ", "_");

			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);

			scenario.attach(source, "image/png", name);
		}
	}

	@After(order = 1)
	public void quitBrowser() {
		driver.quit();
	}

}

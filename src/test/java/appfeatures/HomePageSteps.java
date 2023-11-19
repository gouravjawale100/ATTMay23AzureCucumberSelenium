package appfeatures;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;
import qa.GridTest;

public class HomePageSteps {

HomePage homepage = new HomePage(DriverFactory.getDriver());
//HomePage homepage = new HomePage(GridTest.getDriver());
@Given("User is at the landing page")
public void user_is_at_the_landing_page() {

	WebDriver driver = DriverFactory.getDriver();
	driver.get("https://amazon.in");
}

@Then("Page title should contains {string}")
public void page_title_should_contains(String titleString) {
  
  String title = homepage.getTitleOfPage();
  
  boolean ispresent = title.contains(titleString);  
  Assert.assertTrue(ispresent);
 
}

@Then("Cart icon should get display")
public void cart_icon_should_get_display() {
  boolean isdisplay = homepage.verifyCart();
  
  Assert.assertTrue(isdisplay);
}

@When("User click on summer section deal")
public void user_click_on_summer_section_deal() {
  homepage.enterToSummerDeals();
}

@When("User click on signin button")
public void user_click_on_signin_button() {
   homepage.goToSignPage();
}

@When("User enter username as {string}")
public void user_enter_username_as(String uname) {
    homepage.enterUserName(uname);
}

@When("User enters password as {string} with Signin")
public void user_enters_password_as_with_signin(String pwd) {
   homepage.finalSignIn(pwd);
}


	
}

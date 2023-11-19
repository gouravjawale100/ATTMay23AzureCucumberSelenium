package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {
	
	@Given("User is at the login screen")
	public void user_is_at_the_login_screen() {
	    System.out.println("Given statement for login screen");
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String usrname) {
	System.out.println("Entering username as "+usrname);	
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String pwd) {
	    System.out.println("Entering password as "+pwd);
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
	   System.out.println("Click on submit button");
	}

	@Then("User should redirect to Home page")
	public void user_should_redirect_to_home_page() {
	  System.out.println("Redirection to home page");
	}

}

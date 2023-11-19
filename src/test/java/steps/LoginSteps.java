package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
	@Given("user is at the login screen")
	public void preconditions()
	{
		System.out.println("Preconditions for Given statement");
	}

	
	@When("user enters username")
	public void enteringUsername()
	{
		System.out.println("Entering username");
	}
	
	@When("user enters password")
	public void enteringPassword()
	{
		System.out.println("Entering password");
	}
	
	@When("user clicks on login button")
	public void clickOnLogin()
	{
		System.out.println("Cliking on login");
	}
	
	
	@Then("User should get logged in")
	public void validateLogin()
	{
		System.out.println("User has been logged in");
	}
	
	@Given("user is at the landing page")
	public void user_is_at_the_landing_page() {
	    System.out.println("Given statement for title verification");
	}

	@Then("Title of page should be pagetitle")
	public void title_of_page_should_be_pagetitle() {
	   System.out.println("Then statement for Title verification"); 
	}
	
}

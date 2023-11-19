package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@Given("User is at the signup page")
	public void user_is_at_the_signup_page() {
	  System.out.println("Given statement");
	}

	@When("User enters the {string} on form")
	public void user_enters_the_on_form(String uname) {
	  System.out.println("Name entered is "+uname);
	}

	@When("User enters the {string} inside the form")
	public void user_enters_the_inside_the_form(String age) {
		System.out.println("Entered Age is "+age);
	   
	}

	@When("User select the {string}")
	public void user_select_the(String gender) {
	   System.out.println("User selects the gender as : "+gender);
	}

	@Then("User should get created")
	public void user_should_get_created() {
	   System.out.println("Then statement for user creation");
	}


}

package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundAndScenarioOutlineSteps {
	

@Given("user should be at profile page")
public void user_should_be_at_profile_page() {
    System.out.println("Given statement");
}

@When("User enter firstname as {string}")
public void user_enter_firstname_as(String fname) {
    System.out.println("When statement for firstname :"+fname);
}

@When("User enters lastname as {string}")
public void user_enters_lastname_as(String lname) {
 System.out.println("When statement for lastname : "+lname);
}

@When("User enters city name as {string}")
public void user_enters_city_name_as(String string) {
	System.out.println("When statement for city : "+string);
}

@Then("Profile should get created")
public void profile_should_get_created() {
    System.out.println("Then statement");
}


}

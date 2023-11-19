package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersSteps {
	@Given("User should be logged into the application")
	public void user_should_be_logged_into_the_application() {
	    System.out.println("Given statement for login");
	}

	@When("User should be at the orders page")
	public void user_should_be_at_the_orders_page() {
		System.out.println("When statement for orders page");
	}

	@When("User clicks on past order button")
	public void user_clicks_on_past_order_button() {
		System.out.println("When statement for past order button");
	}

	@Then("User should be able to see the past order information")
	public void user_should_be_able_to_see_the_past_order_information() {
		System.out.println("Then statement for past order button");
	}

	@When("User clicks on the current order button")
	public void user_clicks_on_the_current_order_button() {
		System.out.println("When statement for current order button");
	}

	@Then("User should be able to see the current order information")
	public void user_should_be_able_to_see_the_current_order_information() {
		System.out.println("Then statement for current order button");
	}

	@When("User clicks on cancelled order button")
	public void user_clicks_on_cancelled_order_button() {
		System.out.println("When statement for cancelled order button");
	}

	@Then("User should be able to see the cancelled order information")
	public void user_should_be_able_to_see_the_cancelled_order_information() {
		System.out.println("Then statement for cancelled order button");
	}

}

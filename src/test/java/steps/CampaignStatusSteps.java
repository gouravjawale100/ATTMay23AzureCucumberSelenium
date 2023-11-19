package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignStatusSteps {
	

@Given("User is at the campaign page")
public void user_is_at_the_campaign_page() {
  
	System.out.println("Given statement for campaign page");
}

@When("User click on create campaign button")
public void user_click_on_create_campaign_button() {
    System.out.println("When statement for click on  campaign button");
}

@When("User enters the information")
public void user_enters_the_information() {
    System.out.println("When statement to enter the information");
}

@When("User clicks on save button")
public void user_clicks_on_save_button() {
    System.out.println("When statement to click on save");
}

@Then("Campaign should get created")
public void campaign_should_get_created() {
    System.out.println("Then to create the campaign");
}

@When("User click on edit campaign")
public void user_click_on_edit_campaign() {
   System.out.println("When statement to edit the campaign");
}

@When("User enters the sending information")
public void user_enters_the_sending_information() {
   System.out.println("When statement for sending information");
}

@When("User clicks on schedule button")
public void user_clicks_on_schedule_button() {
    System.out.println("When for sheduling");
}

@Then("Campaign should get scheduled")
public void campaign_should_get_scheduled() {
	 System.out.println("Then for sheduling");
}

@When("User click on Sent campaign")
public void user_click_on_sent_campaign() {
   System.out.println("When for sent");
}

@Then("User should see the sent count")
public void user_should_see_the_sent_count() {
    System.out.println("Then for sent");
}

}

package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import io.cucumber.datatable.DataTable;

public class RegistrationSteps {
	

@Given("user should be at registration page")
public void user_should_be_at_registration_page() {
    System.out.println("Given statement");
    
      
    
}

@When("user enters following information")
public void user_enters_following_information(DataTable dataTable) {
		
	List<List<String>> data = dataTable.asLists();
		
				for(List<String> listvalue:data)
				{
					System.out.println(listvalue);
				}
				
				List<String> l1 = data.get(0);
				
				String value= l1.get(2);
				System.out.println(value);
				
				String email2= data.get(1).get(2);
								
				System.out.println(email2);
}

@When("Click on submit button")
public void click_on_submit_button() {
    System.out.println("When statement for Submit button");
}

@Then("User gets created")
public void user_gets_created() {
   System.out.println("Then statement ");
}


}

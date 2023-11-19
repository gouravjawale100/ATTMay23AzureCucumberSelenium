Feature: Login functionality with data
Scenario: Login with valid credentials
Given User is at the login screen
When User enters username as "testuserone"
And User enters password as "Test@1234"
And User click on submit button
Then User should redirect to Home page
Feature: login functionality
Scenario: login with valid credentials
Given user is at the login screen
When user enters username
And user enters password
And user clicks on login button
Then User should get logged in

Scenario: title verification
Given user is at the landing page
Then Title of page should be pagetitle

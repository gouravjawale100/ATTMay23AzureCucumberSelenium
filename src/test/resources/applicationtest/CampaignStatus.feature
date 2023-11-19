@feature1
Feature: Campaign functionality

@sanity
Scenario: creation of campaign
Given User is at the campaign page
When User click on create campaign button
And User enters the information
And User clicks on save button
Then Campaign should get created

@regression 
Scenario: scheduling campaign
Given User is at the campaign page
When User click on edit campaign 
And User enters the sending information
And User clicks on schedule button
Then Campaign should get scheduled

@functional
Scenario: Sent campaign
Given User is at the campaign page
When User click on Sent campaign 
Then User should see the sent count
Feature: Search functionality
@functional @regression
Scenario: Search product name
Given User is at the landing page
When User enters productname as "mobile"
And click on search button
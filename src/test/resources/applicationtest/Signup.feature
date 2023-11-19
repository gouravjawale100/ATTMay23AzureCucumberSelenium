Feature: Registration functionality
Scenario: Creation of account for a user
Given user should be at registration page
When user enters following information
| Erin | Smith | erinsmith@gmail.com | 9988776655 |
| Robert | White | robertwhite@gmail.com | 7788994455 |
And Click on submit button
Then User gets created


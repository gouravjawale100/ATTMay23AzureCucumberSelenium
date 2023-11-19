Feature: Signup 

Scenario Outline: Signup to application with different data
Given User is at the signup page
When User enters the "<name>" on form
And User enters the "<age>" inside the form
And User select the "<gender>"
And User select the server as <server>
Then User should get created

Examples:
| name | age | gender | server |
| Eder | 18 | Male | 5 |
| Ron | 22 | Male | 6 |
| Diana | 19 | Female | 7 |
| Daniel | 25 | Male | 8 |

	
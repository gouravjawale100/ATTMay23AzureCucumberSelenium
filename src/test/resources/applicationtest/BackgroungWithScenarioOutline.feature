Feature: Profile feature
Background:
Given user should be at profile page

Scenario Outline: Create profile for user
When User enter firstname as "<firstname>"
And User enters lastname as "<lastname>"
And User enters city name as "<city>"
Then Profile should get created

Examples:

| firstname | lastname | city |
| Eder | Mejia | Mexicocity |
| Aron | Severs | Austin |
| Cynthia | White | London |


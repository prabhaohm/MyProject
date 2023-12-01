
@Pink
Feature: Validate the login Functionality of Freightcenter Page

Background:
#Given User should load the chrome browser and load the url
When User should click the signin
And User should print the title of the page

Scenario: Validate the login with valid invalidusername and invalid password
And User should input invalid username in the textbox
And User should input invalid password in the textbox
And User should click the login button
Then User should check the credential page

Scenario: Validate the login with validusername and invalid password
And  User should input valid username and invalid passworD in the textbox
               |Person          |Animal  |Colours      |
               |Jack@hotmail.com|Tiger123|Orange321    |
               |Root@hotmail.com|Whale123|Blue321      |
               |Marsh@hotmail.com|Panther123|Black321  |
And User should click the login button
Then User should check the credential page

Scenario Outline: Valid the login with invalid username and valid password
And  User should input valid invalidusername"<Fruits>" and valid password"Colours" in the textbox
And User should click the login button
Then User should check the credential page

Examples:
           |Fruits            |Colours|
           |Apple@hotmail.com |Red|
          



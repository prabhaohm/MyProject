Feature: Validate the forgotten password functionality
Scenario: Validate the forgotten with invalid email
#Given User should open the chrome browser and load url
When User should click the Signin
And User should input the invalid email in the text box
And User should click the forgot link
And User should input invalid email in the recover text box
Then User should click the recover buton

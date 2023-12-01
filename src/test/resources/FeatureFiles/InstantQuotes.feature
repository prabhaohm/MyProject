
@Sanity
Feature: Validate the Free Instant Freight Quotes Functionality
Scenario: Validate the user to get free freight quotes
#Given User should open the chrome browser and load the url
When User should click the free instant freight quotes
And User should give input in the height text box
And User should give input in the lbs text box
And User should give input of pickup postal code in the text box
And User should click the pickup resdidental area check box
And User should give input of delivery postal code in the text box
And User should click the delivery residental area check box
And User should click the Quote button
Then User should navigate to the quick register page




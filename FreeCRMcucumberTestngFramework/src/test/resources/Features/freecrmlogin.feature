Feature: To test the Crm application
Background: To login into Crm application  

Given To open the application and navigate url
When user clicks on login button
When user enters email and password 
Then click on login button

Scenario: To verify login and take sceenshot
Given user is logged in the application
Then take a screenshot



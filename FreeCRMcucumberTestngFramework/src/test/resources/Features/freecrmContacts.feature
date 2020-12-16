Feature: To create a Contacts

Background: To login into Crm application  
Given To open the application and navigate url
When user clicks on login button
When user enters email and password 
Then click on login button

Scenario: To create a new contacts
Given users is logged in the applications
Then users clicks on the contacts
Then users clicks on the contacts new button
Then users enters the firstname "Abc1"
And user entered the last name "One"
And user enters the street "1st Camino road"
And users enter city "Freemont"
And users entered state "CA"
And users enters the zip "12345"
Then users selects the category
And users enters phone number "123 324 3456"
And users enters phone type "Home"
And users enters email "abc1@one.com"
And users enters email type "Personal"
And users clicks on save button
Then takes a screenshot

Scenario: To delete the created contacts
Given contacts dashboard has any contacts
Then users clicks on the contacts
And user selectes check of conatacts
And user clickied on deletebutton
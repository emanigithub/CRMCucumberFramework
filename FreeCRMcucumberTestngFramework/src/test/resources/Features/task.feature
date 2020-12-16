Feature: To test task page

Background: To login into Crm application  
Given To open the application and navigate url
When user clicks on login button
When user enters email and password 
Then click on login button

Scenario: To open the task page
Given Launch the tak page
When To add a new task
And Enter new tak title and description
|newtask1|description1|
And Enter completion and identifier
|compeltion1|ident1|
Then the task page to be saved
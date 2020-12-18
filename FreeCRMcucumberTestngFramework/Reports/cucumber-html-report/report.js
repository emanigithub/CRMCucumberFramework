$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/freecrmContacts.feature");
formatter.feature({
  "name": "To create a Contacts",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "To login into Crm application",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To open the application and navigate url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.LoginFreeCrmSteps.to_open_the_application_and_navigate_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.LoginFreeCrmSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.LoginFreeCrmSteps.user_enters_email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.LoginFreeCrmSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To create a new contacts",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "users is logged in the applications",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.users_is_logged_in_the_applications()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users clicks on the contacts",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.users_clicks_on_the_contacts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users clicks on the contacts new button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.users_clicks_on_the_contacts_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enters the firstname \"Abc1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.users_enters_the_firstname(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user entered the last name \"One\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.user_entered_the_last_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the street \"1st Camino road\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.user_enters_the_street(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enter city \"Freemont\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.users_enter_city(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users entered state \"CA\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.users_entered_state(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enters the zip \"12345\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.users_enters_the_zip(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users selects the category",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.users_selects_the_category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enters phone number \"123 324 3456\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.users_enters_phone_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enters phone type \"Home\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.users_enters_phone_type(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enters email \"abc1@one.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.users_enters_email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enters email type \"Personal\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.users_enters_email_type(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users clicks on save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.users_clicks_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "takes a screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.takes_a_screenshot()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "To login into Crm application",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To open the application and navigate url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.LoginFreeCrmSteps.to_open_the_application_and_navigate_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.LoginFreeCrmSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.LoginFreeCrmSteps.user_enters_email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.LoginFreeCrmSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To delete the created contacts",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "contacts dashboard has any contacts",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.contacts_dashboard_has_any_contacts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users clicks on the contacts",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.users_clicks_on_the_contacts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selectes check of conatacts",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.user_selectes_check_of_conatacts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clickied on deletebutton",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.ContactsSteps.user_clickied_on_deletebutton()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/freecrmlogin.feature");
formatter.feature({
  "name": "To test the Crm application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "To login into Crm application",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To open the application and navigate url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.LoginFreeCrmSteps.to_open_the_application_and_navigate_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.LoginFreeCrmSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.LoginFreeCrmSteps.user_enters_email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.LoginFreeCrmSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify login and take sceenshot",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is logged in the application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.LoginFreeCrmSteps.user_is_logged_in_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "take a screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.LoginFreeCrmSteps.take_a_screenshot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "logout from application",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("file:src/test/resources/Features/task.feature");
formatter.feature({
  "name": "To test task page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "To login into Crm application",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To open the application and navigate url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.LoginFreeCrmSteps.to_open_the_application_and_navigate_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.LoginFreeCrmSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.LoginFreeCrmSteps.user_enters_email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.LoginFreeCrmSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To open the task page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch the tak page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.TaskSteps.launch_the_tak_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To add a new task",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.TaskSteps.to_add_a_new_task()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter new tak title and description",
  "rows": [
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.TaskSteps.enter_new_tak_title_and_description(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter completion and identifier",
  "rows": [
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.TaskSteps.enter_completion_and_identifier(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the task page to be saved",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.TaskSteps.the_task_page_to_be_saved()"
});
formatter.result({
  "status": "passed"
});
});
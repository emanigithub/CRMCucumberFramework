$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/freecrmlogin.feature");
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
});
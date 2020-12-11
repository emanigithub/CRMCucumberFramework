package com.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.LoginPage.LoginFreeCrmPage;
import com.baseClasses.Library;
import com.reusabeFunctions.SeleniumUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFreeCrmSteps extends Library{
	LoginFreeCrmPage logpage;   // this is your class which is created in pages
	
	@Given("To open the application and navigate url")
	public void to_open_the_application_and_navigate_url() throws Exception {
		browserSetUp();    // this is from library class

	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		logpage = new LoginFreeCrmPage(driver);
		logpage.login();

	}

	@When("user enters email and password")
	public void user_enters_email_and_password() {
		logpage.email(properties.getProperty("email"),properties.getProperty("pass"));
		
	}

	@Then("click on login button")
	public void click_on_login_button() {
		logpage.logbutton();
	}

	@Given("user is logged in the application")
	public void user_is_logged_in_the_application() {

	}

	@Then("take a screenshot")
	public void take_a_screenshot() {
		SeleniumUtilities selutl = new SeleniumUtilities(driver);
		selutl.to_take_screenshot("/src/test/resources/Screenshots/CRMscreenshot.png");
	}

	/* @Then("logout from the application")
	public void logout_from_the_application() {
		logpage.settings();
		logpage.logout();

	}

	*@Then("close the browser")
	public void close_the_browser() {
		
	} */

}

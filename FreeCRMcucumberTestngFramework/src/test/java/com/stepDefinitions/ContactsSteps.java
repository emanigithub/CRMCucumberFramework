package com.stepDefinitions;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

import com.ContactPages.ContactsPage;
import com.baseClasses.Library;
import com.reusabeFunctions.SeleniumUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class ContactsSteps extends Library {
	ContactsPage cpage;
	SeleniumUtilities selutl;
	
	@Given("users is logged in the applications")
	public void users_is_logged_in_the_applications() {
		System.out.println("user logged in application");
	}

	@Then("users clicks on the contacts")
	public void users_clicks_on_the_contacts() {
		cpage = new ContactsPage(driver);
		 cpage.clickOnContacts();
	 
	}

	@Then("users clicks on the contacts new button")
	public void users_clicks_on_the_contacts_new_button() {
		cpage.clickOnNewButton();
	}

	@Then("users enters the firstname {string}")
	public void users_enters_the_firstname(String FirstName) {
		cpage.enterFirstName(FirstName);
	}

	@Then("user entered the last name {string}")
	public void user_entered_the_last_name(String LastName) {
		cpage.enterLastName(LastName);

	}

	@Then("user enters the street {string}")
	public void user_enters_the_street(String Street) {
		cpage.enterStreetAddress(Street);
	}

	@Then("users enter city {string}")
	public void users_enter_city(String City) {
		cpage.enterCity(City);

	}

	@Then("users entered state {string}")
	public void users_entered_state(String State){
		cpage.enterState(State);
	}

	@Then("users enters the zip {string}")
	public void users_enters_the_zip(String Zip) {
		cpage.enterZip(Zip);
	}

	@Then("users selects the category")
	public void users_selects_the_category() {

	}

	@Then("users enters phone number {string}")
	public void users_enters_phone_number(String Phone) {
		cpage.enterPhonenumber(Phone);
	}

	@Then("users enters phone type {string}")
	public void users_enters_phone_type(String PhoneType) {
		cpage.enterPhonetype(PhoneType);

	}

	@Then("users enters email {string}")
	public void users_enters_email(String Emailid) {
		cpage.enterEmail(Emailid);

	}

	@Then("users enters email type {string}")
	public void users_enters_email_type(String EmType) {
		cpage.enterEmailtype(EmType);

	}

	@Then("users clicks on save button")
	public void users_clicks_on_save_button() {
		cpage.clickingSavebutton();
		
	}

	@Then("takes a screenshot")
	public void takes_a_screenshot() {
		SeleniumUtilities selutl = new SeleniumUtilities(driver);
		selutl.to_take_screenshot("/src/test/resources/Screenshots/CRMContactsscreenshot.png");

	}
	
	@Given("contacts dashboard has any contacts")
	public void contacts_dashboard_has_any_contacts() {
	 
	}

	@Then("user selectes check of conatacts")
	public void user_selectes_check_of_conatacts() {
	   cpage.clicingContactscheckbox();
	}

	@Then("user clickied on deletebutton")
	public void user_clickied_on_deletebutton() {
	 cpage.clickingContactsdeletebutton();
	}

}
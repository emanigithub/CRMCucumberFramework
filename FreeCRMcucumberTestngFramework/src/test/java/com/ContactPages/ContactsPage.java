package com.ContactPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.reusabeFunctions.SeleniumUtilities;

public class ContactsPage {
	// Below code is with Page Factory Method, collecting all webElements
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"main-nav\"]/div[3]/a/i")
	WebElement contacts;
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")
	WebElement newbutton;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input")
	WebElement fname;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/div/input")
	WebElement lname;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[1]/div/div/div/div[1]/div/input")
	WebElement addrstreet;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[1]/div/div/div/div[2]/div/input")
	WebElement addrcity;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[1]/div/div/div/div[3]/div/input")
	WebElement addrstate;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[1]/div/div/div/div[4]/div/input")
	WebElement addrzip;
	//By addrcountry = 
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[2]/div/div")
	WebElement category;
	//By status =
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[2]/div/div/div/div[2]/div/input")
	WebElement phone;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[2]/div/div/div/div[3]/div/input")
	WebElement phonetype;
	@FindBy (xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div/div/div[1]/div/input")
	WebElement email;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div/div/div[2]/div/input")
	WebElement emailtype;
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]/i")
	WebElement savebutton;
	@FindBy(xpath= "//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[1]/td[1]/div/label")
	WebElement contactscheckbox;
	@FindBy(xpath= "//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[1]/td[8]/div/button/i")
	WebElement contactsdeletebutton;
		//SeleniumUtilities su;  // if you use any java script in below methods call this utilities,
	
	//This is Constructor
	public ContactsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnContacts() {
		contacts.click();
		
	}
	
	public void clickOnNewButton() {
		newbutton.click();
	}
	
	public void enterFirstName(String firstName) {
		fname.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) {
		lname.sendKeys(lastName);
	}
	
	public void enterStreetAddress(String streetAdd) {
		addrstreet.sendKeys(streetAdd);
	}
	
	public void enterCity(String city) {
		addrcity.sendKeys(city);
	}
	
	public void enterState(String state) {
		addrstate.sendKeys(state);
	}
	
	public void enterZip(String zip) {
		addrzip.sendKeys(zip);
		
	}
	
	/*public void addcountry() {
		
	}*/
	
	public void selectCategory(String cat) {
		category.sendKeys(cat);
		
	}
	
	public void enterPhonenumber(String pho) {
		phone.sendKeys(pho);
	}
	
	public void enterPhonetype(String photype) {
		phonetype.sendKeys(photype);
		
	}
	
	public void enterEmail(String eml) {
		email.sendKeys(eml);
	}
	
	public void enterEmailtype(String emltype) {
		emailtype.sendKeys(emltype);
	}
	
	public void clickingSavebutton() {
		savebutton.click();
		//savebutton.sendKeys(sbutton);
	}
	
	public void clicingContactscheckbox() {
		contactscheckbox.click();
	
	}
	public void clickingContactsdeletebutton() {
		contactsdeletebutton.click();
		
	}
}

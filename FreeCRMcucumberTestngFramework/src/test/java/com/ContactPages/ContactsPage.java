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
	@FindBy(xpath="//*[@id=\"main-nav\"]/a[3]/span")
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
	WebElement addzip;
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
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement savebutton;
	//SeleniumUtilities su;  // if you use any java script in below methods call this utilities,
	
	//This is Constructor
	public void ContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnContacts() {
		contacts.click();
		
	}
	
	public void clickOnNewButton() {
		newbutton.click();
	}
	
	public void enterFirstName(String FirstName) {
		fname.sendKeys(FirstName);
	}
	
	public void enterLastName(String LastName) {
		lname.sendKeys(LastName);
	}
	
	public void enterStreetAddress(String StreetAdd) {
		addrstreet.sendKeys(StreetAdd);
	}
	
	public void enterCity(String city) {
		addrcity.sendKeys(city);
	}
	
	public void enterState(String state) {
		addrstate.sendKeys(state);
	}
	
	public void enterAddress(String addr) {
		addrstreet.sendKeys(addr);
		
	}
	/*		
		
		
		public void cat() {cc
		WebElement cat = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[2]/div/div"));
		Select obj = new Select(cat);
		obj.selectByVisibleText("Lead");
		
	}
	
	public void phone(String pho) {
		driver.findElement(phone).sendKeys(pho);
		
	}
	
	public void phonetype(String ptype) {
		driver.findElement(phonetype).sendKeys(ptype);
	}
	
	public void email(String em) {
		driver.findElement(email).sendKeys(em);
	}
	
	public void emailtype(String emtype) {
		driver.findElement(emailtype).sendKeys(emtype);
	}
	
	public void savebutton(String sb) {
		driver.findElement(savebutton).click();
		
	}*/
}

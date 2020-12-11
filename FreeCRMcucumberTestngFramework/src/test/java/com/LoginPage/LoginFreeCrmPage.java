package com.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFreeCrmPage {
	//Collecting all webelements / object
	WebDriver driver;
	By loginbuttonmain=By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a");
	By email =By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input");
	By password = By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input");
	By loginbutton = By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]");
	By settings = By.xpath("//*[@id=\"top-header-menu\"]/div[3]/div[2]/div/i");
	By logoutbutton = By.xpath("//*[@id=\"top-header-menu\"]/div[3]/div[2]/div/div/a[5]/span");
	
	//This is constructor class
	public LoginFreeCrmPage(WebDriver driver) {
		this.driver=driver;
	}
	
	// Following ones are different methods
	public void login() {
		driver.findElement(loginbuttonmain).click();
	}
	
	public void email(String emailid, String passid) {
		driver.findElement(email).sendKeys(emailid);
		driver.findElement(password).sendKeys(passid);
	}
	
	public void settings() {
		driver.findElement(settings).click();
		
	}
	public void logbutton() {
		driver.findElement(loginbutton).click();
	}

	public void logout() {
		driver.findElement(logoutbutton).click();
	}
}

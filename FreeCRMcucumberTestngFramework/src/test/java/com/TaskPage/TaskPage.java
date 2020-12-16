package com.TaskPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskPage {
	
		WebDriver driver;
		By taskbutton = By.xpath("//*[@id=\"main-nav\"]/div[6]/a/span");
		By newTaskButton = By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button");
		By newTitle = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[1]/div[1]/div/div/input");
		By description = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[6]/div[1]/div/textarea");
		By newcompletion = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[6]/div[2]/div/div/input");
		By identifier=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[8]/div/div/div/input");
		By saveButton=By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]");
		
		public TaskPage(WebDriver driver) {
			this.driver = driver;
		}
		public void launchTaskpage() {
			driver.findElement(taskbutton).click();
		}
		public void createNewTask() {
			driver.findElement(newTaskButton).click();
			
		}
		public void newTitleandDescription(String title,String desc) {
			driver.findElement(newTitle).sendKeys(title);
			driver.findElement(description).sendKeys(desc);

	}
		public void completionAndidentifier(String comp,String identi) {
			driver.findElement(newcompletion).sendKeys(comp);
			driver.findElement(identifier).sendKeys(identi);
		}
		
		public void saveTeask() {
			driver.findElement(saveButton).click();
		}
}

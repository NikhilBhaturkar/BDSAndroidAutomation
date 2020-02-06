package com.testng.framework.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BDSLoginPage {
	WebDriver driver;

	public BDSLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By emailID = By.xpath("//input[@id='inputEmail']");
	By password = By.xpath("//input[@id='inputPass']");
	By agencyCode = By.xpath("//input[@id='agencyId']");
	By loginButton=By.xpath("//button[contains(text(),'Login')]");

	public void clickonLogin() {
		driver.findElement(emailID).sendKeys("user@pi.com");
		driver.findElement(password).sendKeys("User@123");
		driver.findElement(agencyCode).sendKeys("10013");
		driver.findElement(loginButton).click();
	}
	
	
}

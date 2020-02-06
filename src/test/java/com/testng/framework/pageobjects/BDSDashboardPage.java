package com.testng.framework.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class BDSDashboardPage {
	WebDriver driver;

	public BDSDashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	By newApplications = By.xpath("//div[contains(text(),'Applications')]/strong[text()='New']");
	
	public void checkMenuonDashboard()  {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String newapplicationtext = driver.findElement(newApplications).getText();
		System.out.println(newapplicationtext);
		Assert.assertEquals(driver.findElement(newApplications).getText(), "New");
	}
	
}

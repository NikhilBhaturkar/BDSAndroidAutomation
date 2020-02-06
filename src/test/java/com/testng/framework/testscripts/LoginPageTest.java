package com.testng.framework.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.framework.pageobjects.BDSDashboardPage;
import com.testng.framework.pageobjects.BDSLoginPage;
import com.testng.framework.utils.DriverInitializer;

public class LoginPageTest extends DriverInitializer{
	BDSLoginPage loginPage;
	BDSDashboardPage dashboardPage;
	
	@BeforeMethod
	public void setup() {
		loginPage = new BDSLoginPage(getDriver());
		dashboardPage=new BDSDashboardPage(getDriver());
	}
	
	@Test
	public void checkLogin() {
		loginPage.clickonLogin();
		dashboardPage.checkMenuonDashboard();
	}
	
	@AfterMethod
	public void quit() {
		quitBrowser();
	}
}

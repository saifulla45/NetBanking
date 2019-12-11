package com.NetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.NetBanking.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void login() {
		driver.get(appUrl);
		logger.info("Url is Opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		logger.info("Username entered");
		lp.setPassword(password);
		logger.info("Password entered");
		lp.clickButton();
		logger.info("Clicked on Login Button");
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		}
		else {
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
		}
	}

}

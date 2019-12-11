package com.NetBanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.NetBanking.utilities.ReadConfig;



public class BaseClass {
	ReadConfig readConfig=new ReadConfig();
    public  String appUrl=readConfig.getAppUrl();
	public  String username=readConfig.getUsername();
	public  String password=readConfig.getPassword();
	public static WebDriver driver;
	Logger logger;
	
	@BeforeClass
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver",readConfig.getChromePath());
		driver=new ChromeDriver();
		logger=Logger.getLogger("NetBanking_V1");
		PropertyConfigurator.configure("Log4j.properties");
		
		
	}
@AfterClass
public void tearDown() {
	driver.quit();
}
}

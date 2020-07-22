package com.simplilearn.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoadAmazonHomePage {
	WebDriver driver;
	@Before
	public void SetupDriver() {
		
		System.setProperty("Webdriver.gecko.driver","/home/ubuntu/eclipse-workspace/SeleniumTestwd/Driver/geckodriver");
		driver = new FirefoxDriver();
	}
	@Test
	public void verifyTitle() {
		final String siteUrl = "https://www.amazon.in/";
		driver.get(siteUrl);
		
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@Test
	public void verifySource(){
	
		final String siteUrl = "https://www.amazon.in/";
		driver.get(siteUrl);
		String actualUrl=driver.getCurrentUrl();
		
		Assert.assertEquals(siteUrl, actualUrl); 
	}
	@After
	public void closeDriver() {
		driver.close();
	}
}

package com.simplilearn.testscript;



import java.util.List;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindelementAmazonpage {
	@Before
	public void SetupDriver() {
		
		System.setProperty("Webdriver.gecko.driver","/home/ubuntu/eclipse-workspace/SeleniumTestwd/Driver/geckodriver");
		driver = new FirefoxDriver();
	}
	WebDriver driver;
	
	@Test
	public void FindInputsSource() {
		final String siteUrl = "https://www.amazon.in/";
		driver.get(siteUrl);
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(siteUrl, actualUrl); 
		List<WebElement> allInputs= driver.findElements(By.tagName("input"));
		for(WebElement oneInput : allInputs) {
			System.out.println(oneInput.getAttribute("value"));
		}
	}
	@After
	public void closeDriver() {
		driver.close();
	}
}

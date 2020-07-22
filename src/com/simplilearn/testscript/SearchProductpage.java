package com.simplilearn.testscript;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchProductpage {
	@Before
	public void SetupDriver() {
		
		System.setProperty("Webdriver.gecko.driver","/home/ubuntu/eclipse-workspace/SeleniumTestwd/Driver/geckodriver");
		driver = new FirefoxDriver();
	}
	WebDriver driver;
	@Test
	public void SearchForProduct() throws InterruptedException {
		final String siteUrl = "https://www.amazon.in/";
		driver.get(siteUrl);
		WebElement SearchField = driver.findElement(By.id("twotabsearchtextbox"));
		SearchField.sendKeys("Dell Laptop");
		WebElement Submit = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input"));
		Submit.click();
		Thread.sleep(20000);

}
	@After
	public void closeDriver() {
		driver.close();
	}

}
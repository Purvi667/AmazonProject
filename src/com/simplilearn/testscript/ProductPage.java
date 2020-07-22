package com.simplilearn.testscript;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProductPage {
	@Before
	public void SetupDriver() {
		
		System.setProperty("Webdriver.gecko.driver","/home/ubuntu/eclipse-workspace/SeleniumTestwd/Driver/geckodriver");
		driver = new FirefoxDriver();
	}
	WebDriver driver;
	
	@Test
	public void gotComputerPage() throws InterruptedException {
		final String siteUrl = "https://www.amazon.in/";
		driver.get(siteUrl);
		WebElement computerLink = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[3]/div[2]/div/a[4]"));
		computerLink.click();
		Thread.sleep(20000);
	
		WebElement Inputcheck = driver.findElement(By.cssSelector("ul.a-unordered-list:nth-child(10) > div:nth-child(1) > li:nth-child(1) > span:nth-child(1) > span:nth-child(1) > div:nth-child(1) > label:nth-child(1) > input:nth-child(1)"));
		Inputcheck.click();
		Thread.sleep(20000);
	}
	@After
	public void closeDriver() {
		driver.close();
	}
}

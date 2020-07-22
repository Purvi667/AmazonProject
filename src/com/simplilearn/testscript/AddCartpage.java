package com.simplilearn.testscript;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddCartpage {
	@Before
	public void SetupDriver() {
		
		System.setProperty("Webdriver.gecko.driver","/home/ubuntu/eclipse-workspace/SeleniumTestwd/Driver/geckodriver");
		driver = new FirefoxDriver();
	}
	WebDriver driver;
	
	@Test
	public void AddtoCart() throws InterruptedException {
		final String siteUrl = "https://www.amazon.in/";
		driver.get(siteUrl);
		WebElement computerLink = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[3]/div[2]/div/a[4]"));
		computerLink.click();
		
	WebElement Inputcheck = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div/div[2]/div/ul[1]/ul/div/li[5]/span/a/span"));
		Inputcheck.click();
		WebElement	Inputcheck1 = driver.findElement(By.cssSelector("div.bxc-grid__column--2-of-12:nth-child(2) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > img:nth-child(1)"));
		Inputcheck1.click();
		WebElement	Inputcheck2 = driver.findElement(By.cssSelector("#result_0 > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > a:nth-child(1) > h2:nth-child(1)"));
		Inputcheck2.click();
		
		WebElement Inputcheck3 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		Inputcheck3.click();
		Thread.sleep(2000);
		WebElement Inputcheck4 = driver.findElement(By.xpath("//*[@id=\"nav-cart\"]"));
		Inputcheck4.click();
		Thread.sleep(2000);
		
		
		
	}

		@After
		public void closeDriver() {
			driver.close();
		}
}

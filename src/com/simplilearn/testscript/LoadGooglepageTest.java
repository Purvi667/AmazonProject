package com.simplilearn.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoadGooglepageTest {

	public static void main(String[] args) {
		System.setProperty("Webdriver.gecko.driver","/home/ubuntu/eclipse-workspace/SeleniumTestwd/Driver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		String fetchedTitle=driver.getTitle();
		String expectedTitle="Google";
		if(fetchedTitle.equals(expectedTitle)) {
			System.out.println("Test passed");
			}else {
				System.out.println("Test failed");
		
			}
		driver.close();
}
	}

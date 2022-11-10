package com.qa.seleniumManager;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumManagerTest {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}

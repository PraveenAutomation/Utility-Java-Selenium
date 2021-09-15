package com.qa.seleniumUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptInitiateByClientDriver {

	public static void main(String[] args) {
		//System.out.println("Path="+System.getProperty("user.dir"));
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\ClientDrivers\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\ClientDrivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String baseUrl="http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		System.out.println("Title is : "+actualTitle);
		
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test Passed!!");
		}
		else
		{
			System.out.println("Test Failed!!");
		}
		
		driver.close();


	}

}

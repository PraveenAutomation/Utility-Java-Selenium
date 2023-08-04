package com.qa.batchMay23;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSession {
	
	public static String browser="chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String actualTitle=driver.getTitle();
		String expectedTitle="Google.co";
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Pass the case...");
		}
		else
		{
			System.out.println("Fail the case...");
		}
		
		if(driver!=null)
		{
			driver.quit();
		}
	}

}

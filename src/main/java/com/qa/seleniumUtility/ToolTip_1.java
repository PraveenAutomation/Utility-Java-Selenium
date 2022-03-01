package com.qa.seleniumUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip_1 {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/tooltip/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement facebook=driver.findElement(By.cssSelector("a[title*='Facebook']"));
		
		String expected_tooltip ="Facebook";
		String actual_title=facebook.getAttribute("title");
		
		// Assert the value:
		System.out.println("Actual title is :"+actual_title);
		
		if(actual_title.equals(expected_tooltip))
		{
			System.out.println("Test case is passed");
		}
		
		driver.close();
		
		
		

	}

}

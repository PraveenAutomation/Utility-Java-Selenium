package com.qa.seleniumUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIsElementPresent2 {
	
	public static WebDriver driver;
	
	public static boolean isElementPresent1(By by)
	{
		/*
		 * try { driver.findElement(By.xpath(locator)); return true; } catch(Throwable
		 * th) { return false; }
		 */
		int size=driver.findElements(by).size();
		if(size==0)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ele=driver.findElement(By.id("js-link-box-en"));
		
		
		System.out.println(isElementPresent1(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/a[9]")));
		

	}

}

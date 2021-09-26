package com.qa.seleniumInterviewSeries;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle_1 {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
	}
	
	@Test
	public void testCase() throws InterruptedException
	{
		String parentWinID=driver.getWindowHandle();
		System.out.println("Parent Win ID: "+parentWinID);
		
		Set<String> allWinID=driver.getWindowHandles();
		System.out.println("Total window Size: "+allWinID.size());
		System.out.println("All Win IDs are: ");
		for(String allIDs : allWinID)
		{
			System.out.println(allIDs);
		}
		
		//Using Iterator to iterate with in Window:
		Iterator<String> itr = allWinID.iterator();
		while(itr.hasNext())
		{
			String childWinID=itr.next();
			if(!parentWinID.equalsIgnoreCase(childWinID))
			{
				driver.switchTo().window(childWinID);
				System.out.println("Child URL is : "+driver.getCurrentUrl());
				System.out.println("Child Win Title is : "+driver.getTitle());
				Thread.sleep(2000);
				
			}
		}
			driver.switchTo().window(parentWinID);
	}
	
	
	public void tearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}

}

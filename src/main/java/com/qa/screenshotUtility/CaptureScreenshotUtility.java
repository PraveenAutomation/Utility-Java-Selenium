package com.qa.screenshotUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshotUtility {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		System.out.println(driver.getTitle());
		getFullPageScreeshot();
		WebElement ele= driver.findElement(By.linkText("LOG IN"));
		getPageElementScreeshot(ele);

	}
	
	public static void getFullPageScreeshot()
	{
		Date d=new Date();
		String FileName=d.toString().replaceAll(" ", "_").replaceAll(":", "_")+".jpg";
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(".//screenshot//"+FileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getPageElementScreeshot(WebElement element)
	{
		Date d=new Date();
		String FileName=d.toString().replaceAll(" ", "_").replaceAll(":", "_")+".jpg";
		
		File src=((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(".//screenshot//"+FileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}

package com.qa.seleniumUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot_ByRemoteWebDriver {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.get("http://thedemosite.co.uk/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//strong[contains(text(),'PHP and')]"));
		pageScreenshots();
		getElementScreenshot(ele);

	}
	
	public static void pageScreenshots()
	{
		Date d=new Date();
		String fileName=d.toString().replace(" ", "_").replace(":","_")+".jpg";
		RemoteWebDriver remoteWebDriver = (RemoteWebDriver)driver;
		File src=remoteWebDriver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(".//screenshots1//"+fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getElementScreenshot(WebElement element)
	{
		Date d=new Date();
		String fileName=d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		
		ChromeDriver chromeDriver = new ChromeDriver();
		File src=chromeDriver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(".//screenshot3//"+fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chromeDriver.executeScript("arguments[0].click()", element);
		
		//ChromeDriver chromeDriver = new ChromeDriver();
		//File screenshot = chromeDriver.getScreenshotAs(OutputType.FILE);
		//chromeDriver.executeScript("arguments[0].click()",driver.findElement(By.id("Some Id")));
	}

}

package com.qa.jScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JS_VDS_Alert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		// Generate Alert By JS:
		js.executeScript("alert('VDS TECH LABS');");
		

		 String alertText=driver.switchTo().alert().getText(); 
		 System.out.println(alertText);
		 //Thread.sleep(3000);
		// driver.switchTo().alert().accept();

	}

}

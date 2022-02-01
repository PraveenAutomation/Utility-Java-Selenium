package com.qa.jScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JS_VDS_Click {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		WebElement submitBtn=driver.findElement(By.name("submit"));
		// Click on the element:
		js.executeScript("arguments[0].click();",submitBtn);
		
		
		

	}

}

package com.qa.jScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All_In_One_JavascriptExecutor {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Navigate to URL by JSE:
		js.executeScript("window.location='http://demo.guru99.com/test/newtours/'");
		//Enter text value in fields:
		WebElement element=driver.findElement(By.xpath("//input[@name='userName']"));
		js.executeScript("arguments[0].value='admin';",element);
		WebElement element1=driver.findElement(By.xpath("//input[@name='password']"));
		js.executeScript("arguments[0].value='admin';",element1);
		//Click on submit button
		WebElement element2=driver.findElement(By.xpath("//input[@name='submit']"));
		js.executeScript("arguments[0].click()",element2);
		
		//WebElement ele3=driver.findElement(By.cssSelector("input[@name='submit']"));
		//js.executeScript("document.querySelector(ele3).click()");
		

	}

}

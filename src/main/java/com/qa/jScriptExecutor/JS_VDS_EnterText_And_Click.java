package com.qa.jScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JS_VDS_EnterText_And_Click {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		//driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("abc");
		
		//userName.sendKeys("abc@vds.com");
		WebElement uName=driver.findElement(By.cssSelector("input[name='userName']"));
		WebElement password=driver.findElement(By.cssSelector("input[name='password']"));
		WebElement submitBtn=driver.findElement(By.name("submit"));
		
		
		//Enter text by JS: 
		
		//js.executeScript("document.getElementByName('userName').value='admin'");
		js.executeScript("arguments[0].value=arguments[1]",uName,"admin");
		js.executeScript("arguments[0].value='admin'", password);

		
		// Click on the element:
		js.executeScript("arguments[0].click();",submitBtn);
		
		Thread.sleep(3000);
		js.executeScript("history.go(0)");
	}

}

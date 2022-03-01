package com.qa.jScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InnerTextByJSE {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://stqatools.com/");
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Get inner text of the entire web page
		String innnerText = js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println("Inner Text are"+innnerText);
		
		//Generate Alert Pop-up window:
		//js.executeScript("alert('Hello World!!');");
		
		
		
		
		
		
		
		

	}

}

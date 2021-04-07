package com.qa.seleniumUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollWebPage {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		//driver.get("http://demo.guru99.com/test/guru99home/");
		driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.linkText("Contest"));
		WebElement ele = driver.findElement(By.xpath("//a[text()='Linux']"));
		WebElement ele2=driver.findElement(By.xpath("//a[text()='VBScript']"));
		
		//scrollByPixel();
		//scrollByVisibleElement(ele);
		//scrollByPageTillEnd();
		horizontalScroll(ele2);
	}
	
	public static void scrollByPixel()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
	}
	
	public static void scrollByVisibleElement(WebElement element) 
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}
	
	public static void scrollByPageTillEnd()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	
	public static void horizontalScroll(WebElement element)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}
	
	

}

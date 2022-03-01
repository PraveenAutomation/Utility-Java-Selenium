package com.qa.selenium4feature;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Relative_Locators_Concept {
	
	private WebDriver driver;
	private WebDriverWait wait;
	private JavascriptExecutor javaScriptExecutor;
	final private String url="https://www.swtestacademy.com";
	
	@BeforeTest
	public void setupTest()
	{
		WebDriverManager.chromedriver().setup();
		this.driver=new ChromeDriver();
		//this.wait=new WebDriverWait(driver, ofSeconds(10));
		this.javaScriptExecutor=(JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterTest
	public void tearDown()
	{
		this.driver.quit();
	}
	
	@Test
	public void TC_01_Locator()
	{
		driver.get(url);
        WebElement firstArticle = driver.findElement(By.xpath("(//article)[1]"));
     
	}
	private WebElement highlightElement(WebElement element) {
        javaScriptExecutor.executeScript("arguments[0].style.border='3px solid red'", element);
        return element;
    }
	
	

}

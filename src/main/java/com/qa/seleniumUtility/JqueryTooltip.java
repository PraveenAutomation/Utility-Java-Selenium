package com.qa.seleniumUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryTooltip {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		String base_url="http://demo.guru99.com/test/tooltip.html";
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get(base_url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String expectedTooltip = "What's new in 3.2";	
		
		WebElement download=driver.findElement(By.id("download_now"));
		
		Actions act=new Actions(driver);
		
		act.clickAndHold().moveToElement(download);
		act.moveToElement(download).build().perform();
		
		WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));							
        String actualTooltip = toolTipElement.getText();			
        
        System.out.println("Actual Title of Tool Tip  "+actualTooltip);							
        if(actualTooltip.equals(expectedTooltip)) {							
            System.out.println("Test Case Passed");					
        }		
        driver.close();		

	}

}

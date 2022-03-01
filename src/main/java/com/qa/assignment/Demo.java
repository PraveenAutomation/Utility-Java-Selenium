package com.qa.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://irissoftware.com/careers/");
		
		Actions ac=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//a[text()='Services']"));
		ac.moveToElement(ele).build().perform();
		menu("Data & Analytics");
	}
	
	public static void menu(String str)
	{
		if(str.equalsIgnoreCase("Automation"))
		{
		WebElement ele=driver.findElement(By.xpath("//a[text()='Automation']"));
		ele.click();
		}
		else if(str.equalsIgnoreCase("Integrations"))
		{
			driver.findElement(By.linkText("Integrations")).click();
		}
		else if(str.equalsIgnoreCase("Cloud"))
		{
			driver.findElement(By.linkText("Cloud")).click();
		}
		else if(str.equalsIgnoreCase("Interactive"))
		{
			driver.findElement(By.linkText("Interactive")).click();
		}
		else if(str.equalsIgnoreCase("Data & Analytics"))
		{
			driver.findElement(By.linkText("Data & Analytics")).click();
		}
	}
	
	
}

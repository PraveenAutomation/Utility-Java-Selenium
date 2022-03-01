package com.qa.seleniumUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Static_DropDpwn {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		//WebElement ele=driver.findElement(By.xpath("//label[text()='Round Trip']"));
		//ele.click();
		WebElement ele2=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropDown=new Select(ele2);
		//dropDown.selectByVisibleText("AED");
		//String text=dropDown.getFirstSelectedOption().getText();
		//System.out.println(text);
		dropDown.selectByIndex(1);
		String text1=dropDown.getFirstSelectedOption().getText();
		System.out.println(text1);
		//dropDown.selectByValue("INR");
		//String text2=dropDown.getFirstSelectedOption().getText();
		//System.out.println(text2);
		
	}
	

}

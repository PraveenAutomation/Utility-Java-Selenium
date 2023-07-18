package com.qa.rsaSection7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StaticDropDown {
	
	WebDriver dr=new ChromeDriver();
	
	@BeforeTest
	public void setUp()
	{
		
		dr.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();
	}
	
	@Test
	public void staticDropdown_1()
	{
		WebElement ddOption= dr.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		Select dd = new Select(ddOption);
		
		dd.selectByIndex(3);
		System.out.println(dd.getFirstSelectedOption().getText());
		
		dd.selectByValue("AED");
		System.out.println(dd.getFirstSelectedOption().getText());
		
		dd.selectByVisibleText("INR");
		System.out.println(dd.getFirstSelectedOption().getText());
	}
	
	@Test
	public void updatedDropdown()
	{
		WebElement totalPassenger=dr.findElement(By.id("divpaxinfo"));
		totalPassenger.click();
		WebElement plusButton= dr.findElement(By.id("hrefIncAdt"));
		System.out.println(totalPassenger.getText());
		
		/*int i=1;
		while(i<5)
		{
			plusButton.click();
			i++;
		}*/
		
		for(int i=1;i<9;i++)
		{
			plusButton.click();
		}
		
		dr.findElement(By.id("btnclosepaxoption")).click();;
		System.out.println(totalPassenger.getText());
		
	}
	
	@AfterTest
	public void tearDown()
	{
		if(dr!=null)
		{
			dr.quit();
		}
	}

}

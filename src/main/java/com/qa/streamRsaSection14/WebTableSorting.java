package com.qa.streamRsaSection14;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableSorting {
	
	WebDriver dr = new ChromeDriver();

	@Test
	public void sortWebTable()
	{
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();
		dr.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		dr.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> elementsList = dr.findElements(By.xpath("//tr/td[1]"));
		List<String> originalList=elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		originalList.stream().sorted().forEach(s->System.out.println(s));
		
		
	}

}

package com.qa.seleniumInterviewSeries;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleExceptionDemo {

	public static void main(String[] args) {
		
		WebDriver dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		dr.get("https://ultimateqa.com/automation");
		
		WebElement ps=dr.findElement(By.xpath("(//a[normalize-space()='Professional Services'])[1]"));
		
		dr.findElement(By.xpath("(//a[normalize-space()='Blog'])[1]")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ps.click();
		
		
		

	}

}

package com.qa.batchMay23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondSession {

	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		//dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(10));
		
		dr.get("https://www.google.co.in/");
		
		dr.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
		dr.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("java@way2automation.com");
		dr.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		
		
		//dr.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("45987464");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))).sendKeys("gfjgdsjfg");
		WebElement nextButton=dr.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
		nextButton.click();
		//String errorTitle=dr.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[1]/div/form/span/section[2]/div/div/div[1]/div[2]/div[2]/span")).getText();
		String errorTitle= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[1]/div/form/span/section[2]/div/div/div[1]/div[2]/div[2]/span"))).getText();
		System.out.println(errorTitle);
		
		
		

	}

}

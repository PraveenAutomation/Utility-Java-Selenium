package com.qa.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calculator_Test {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.online-calculator.com/full-screen-calculator/");
		new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fullframe")));
		WebElement canvas = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("canvas")));
		//clicking on 3
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(0,(255/6)*3).click().build().perform();
		//clicking on the substract sign (-)
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174/5)*2,(255/6)*3).click().build().perform();
		//clicking on 1
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-(174/5)*4,(255/6)*3).click().build().perform();
		//clicking on equals to sign (=)
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174/5)*4,(255/6)*4).click().build().perform();

	}

}

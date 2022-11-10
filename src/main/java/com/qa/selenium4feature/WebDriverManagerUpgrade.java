package com.qa.selenium4feature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerUpgrade {

	public static void main(String[] args) {
		
		// Headless Mode: 
		
//		ChromeOptions co=new ChromeOptions();
//		co.setHeadless(true);
//		WebDriver driver=WebDriverManager.chromedriver().capabilities(co).create();
		
		WebDriver driver=WebDriverManager.chromedriver().create();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}

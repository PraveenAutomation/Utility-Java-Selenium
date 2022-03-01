package com.qa.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		WebElement ele=driver.findElement(By.xpath("//label[text()='Round Trip']"));
		
		ele.click();
		//select[@name='ctl00$mainContent$ddl_originStation1']/option[1]
		
		WebElement ele2=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		ele2.click();
		Select select = new Select(ele2);
		select.deselectByVisibleText("Ahmedabad (AMD)");
		
		
	}

}

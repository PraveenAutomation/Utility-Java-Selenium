package com.qa.selenium4feature;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("VDS TECH LABS",Keys.ENTER);
		System.out.println(driver.getTitle());
		
		//Fetch multiple elements:
		driver.navigate().to("https://trytestingthis.netlify.app/");
		List<WebElement> allOptins=driver.findElements(By.name("Optionwithcheck[]"));
		
		for(WebElement element : allOptins)
		{
			System.out.println("Options are: "+element.getText());
		}
		
		//Relative Locators:
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		WebElement loginBtn=driver.findElement(By.cssSelector("#btnLogin"));
		WebElement userName=driver.findElement(RelativeLocator.withTagName("input").above(loginBtn));
		userName.sendKeys("testing");
		
		//driver.close();
		//driver.quit();

	}

}

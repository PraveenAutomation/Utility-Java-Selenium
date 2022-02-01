package com.qa.seleniumUtility;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Test {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(options);
		

		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		//driver.findElement(By.linkText("Generate Alert Box")).click();
		//button[@onclick="alert('hi, JavaTpoint Testing');"]
		driver.findElement(By.xpath("//button[@onclick=\"alert('hi, JavaTpoint Testing');\"]")).click();
		
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		System.out.println(alert.getText());
		
		

	}

}

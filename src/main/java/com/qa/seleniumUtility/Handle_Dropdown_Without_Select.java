package com.qa.seleniumUtility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Dropdown_Without_Select {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		List<WebElement> allOptions=driver.findElements(By.xpath("//select[@name='country']//option"));
		System.out.println(allOptions.size());
		
		for(int i=0;i<=allOptions.size()-1;i++)
		{
			if(allOptions.get(i).getText().contains("ANDORRA"))
			{
				allOptions.get(i).click();
				break;
			}
		}
		

	}

}

package com.qa.seleniumUtility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTableHanldeInMoreEfficientWay {
	
	public static void main(String[] args) {
		
		//table[@class='dataTable']/tbody/tr -->Row Count
		//table[@class='dataTable']/tbody/tr[1]/td  -->Column Count 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> rowNum= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("Total no of rows : "+rowNum.size());
		
		List<WebElement> colNum= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println("Total no of cols : "+colNum.size());
		
		System.out.println("Data are below: ");
		for(int i=1;i<=(rowNum.size()-1850);i++)
		{
			for(int j=1;j<=colNum.size();j++)
			{
				WebElement data= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + i + "]/td[" + j + "]" +"     "));
				System.out.print(data.getText()+"   ");
			}
			System.out.println();
		}
		
		driver.quit();
	}

}

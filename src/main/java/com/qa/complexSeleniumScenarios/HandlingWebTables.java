package com.qa.complexSeleniumScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//
public class HandlingWebTables {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Handling Web Tables:
		//table[@class='dataTable']/tbody/tr --> Total no of rows
		//table[@class='dataTable']/tbody/tr[1]/td --> Total no of colmns
		
		List<WebElement> rowNum=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("Total no. of rows: "+rowNum.size());
		List<WebElement> colNum=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println("Total no. of colmns: "+colNum.size());
		
		for(int row=1;row<=rowNum.size();row++)
		{
			for(int col=1;col<=colNum.size();col++)
			{
				System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+row+"]/td["+col+"]")).getText()+" ");
			}
			System.out.println();
		}
		
		
	}

}

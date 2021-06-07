package com.qa.seleniumUtility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWindowHandles {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowCount=rows.size();
		System.out.println("Total no of rows are: "+rowCount);
		
		String beforeXpath="//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath="]/td[1]";
		
		for(int i=2;i<=rowCount;i++)
		{
			String actul_xpath=beforeXpath+i+afterXpath;
			WebElement element= driver.findElement(By.xpath(actul_xpath));
			System.out.println(element.getText());
			if(element.getText().equals("Ernst Handel"))
			{
				System.out.println("Company name "+element.getText()+"is found at position at "+(i-1));
				break;
			}
		}
		
		System.out.println("******CONTACTS*********");
		//*[@id="customers"]/tbody/tr[2]/td[2]
		
		String afterXpath_contacts="]/td[2]";
		
		for(int i=2;i<=rowCount;i++)
		{
			String actul_xpath=beforeXpath+i+afterXpath_contacts;
			WebElement element= driver.findElement(By.xpath(actul_xpath));
			System.out.println(element.getText());
			
		}
		
		System.out.println("******COUNTRY*********");
		//*[@id="customers"]/tbody/tr[2]/td[3]
		
		String afterXpath_country="]/td[3]";
		for(int i=2;i<=rowCount;i++)
		{
			String actualXpath=beforeXpath+i+afterXpath_country;
			WebElement element=driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
		
		// HANDLE WEB TABLE COLUMN: 
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[1]/th[3]
		System.out.println("*********COLUMN************");
		
		List<WebElement> col= driver.findElements(By.xpath("//*[@id=\'customers\']/tbody/tr[1]/th"));
		int colCount=col.size();
		System.out.println("Total no of Column count : "+colCount);
		
		String colBeforeXpath="//*[@id=\"customers\"]/tbody/tr[1]/th[";
		String colAfterXpath="]";
		
		System.out.println("Col values are: ");
		for(int i=1;i<=colCount;i++)
		{
			String colActualXpath=colBeforeXpath+i+colAfterXpath;
			WebElement ele= driver.findElement(By.xpath(colActualXpath));
			System.out.println(ele.getText());
		
		}
		
		driver.quit();
	}

}

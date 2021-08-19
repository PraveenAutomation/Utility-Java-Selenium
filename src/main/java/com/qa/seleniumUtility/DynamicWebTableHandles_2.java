package com.qa.seleniumUtility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTableHandles_2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/indices");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
		WebElement showMoreLink=driver.findElement(By.id("showMoreLess"));
		showMoreLink.click();
		
		WebElement webTable=driver.findElement(By.xpath("//table[@id='dataTable']//tbody"));
		
		List<WebElement> rows=webTable.findElements(By.tagName("tr"));
		int totalRows=rows.size();
		System.out.println("Total No. of rows: "+totalRows);
		
		for(int i=0;i<totalRows;i++)
		{
			List<WebElement> column=rows.get(i).findElements(By.tagName("td"));
			int colCount=column.size();
			for(int j=0;j<colCount;j++)
			{
				String cellText=column.get(j).getText();
				{
					if(cellText.equals("S&P BSE SmallCap"))
					{
						System.out.println("Prev close value is "+column.get(1).getText());
					}
				}
			}
		}
	}

}

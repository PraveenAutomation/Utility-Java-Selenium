package com.qa.seleniumInterviewSeries;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle_2_By_Main_Method {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		String mainWindow=driver.getWindowHandle();
		System.out.println("Parent Win-ID: "+mainWindow);
		
		//To handle all new Opened window:
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> it=s1.iterator();
		
		while(it.hasNext())
		{
			String childWin=it.next();
			System.out.println("Parent Child-ID: "+childWin);
			if(!mainWindow.equalsIgnoreCase(childWin))
			{
				driver.switchTo().window(childWin);
				System.out.println("Parent Child-ID: "+childWin);
				driver.findElement(By.name("emailid")).sendKeys("abc@vdstech.com");
				driver.findElement(By.name("btnLogin")).click();
				driver.close();
			}
		}
		
		//Switching to Main window:
		driver.switchTo().window(mainWindow);
		driver.close();

	}

}

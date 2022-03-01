package com.qa.assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EggTimerTest {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get("https://e.ggtimer.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//input[@id='EggTimer-start-time-input-text']")).sendKeys("25");
		//driver.findElement(By.linkText("Start")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Start']")).click();
		//span[normalize-space()='Time Expired!']
		
		// Switching to Alert        
        //Alert alert = driver.switchTo().alert();			
        // Capturing alert message.    
       // String alertMessage= driver.switchTo().alert().getText();				
        // Displaying alert message		
       // System.out.println(alertMessage);	

        		
        // Accepting alert		
        //alert.accept();	
        Thread.sleep(5000);
        //String time_txt=driver.findElement(By.xpath("//span[normalize-space()='22 seconds']")).getText();
        Thread.sleep(5000);
        //System.out.println(time_txt);
        Thread.sleep(5000);
        
		//String ext_msg=driver.findElement(By.xpath("//span[normalize-space()='Time Expired!']")).getText();
		//System.out.println(ext_msg);
		//span[normalize-space()='22 seconds']
        
        String beforeXpath="//span[normalize-space()='";
		String afterXpath="seconds']\"";
		
		for(int i=25;i<=0;i--)
		{
			String actul_xpath=beforeXpath+i+afterXpath;
			WebElement element= driver.findElement(By.xpath(actul_xpath));
			System.out.println(element.getText());
			if(element.getText().equals("18"))
			{
				System.out.println("Timer "+element.getText());
				break;
			}
		}
		
	}
		
		
}



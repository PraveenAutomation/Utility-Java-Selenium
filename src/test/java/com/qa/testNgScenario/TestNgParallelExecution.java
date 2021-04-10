package com.qa.testNgScenario;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgParallelExecution {
	
	public static WebDriver driver;
	@Test
	public void Test1()
	{
		System.out.println("I m in Test1 | "+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
		driver.close();
	}
	
	@Test
	public void Test2()
	{
		System.out.println("I m in Test2 | "+Thread.currentThread().getId());
		
		//WebDriverManager.edgedriver().setup();
		//driver=new EdgeDriver();
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "ToolsQA");
		driver.close();
	}

}

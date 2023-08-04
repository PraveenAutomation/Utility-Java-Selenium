package com.qa.batchMay23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestFindingElements {

	
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		/*
		 * Options opt = driver.manage(); Window win = opt.window(); win.maximize();
		 */
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		String title = driver.getTitle();
		title.length();
		
		driver.getTitle().length();
		
		/*
		WebElement username = driver.findElement(By.name("identifier"));
		username.sendKeys("java@way2automation.com");
		
		
		WebElement nxtBtn = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
		nxtBtn.click();
		*/
		
		driver.findElement(By.name("identifier")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		//Thread.sleep(3000);
		
		                             //*[@id="password"]/div[1]/div/div[1]/input
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"))).sendKeys("sdfsdfsf");
		
		//driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("sdfsdf");
		
		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		
		
		System.out.println(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[1]/div/form/span/section[2]/div/div/div[1]/div[2]/div[2]/span"))).getText());
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[1]/div/form/span/section[2]/div/div/div[1]/div[2]/div[2]/span")).getText());
		
		
	}

}

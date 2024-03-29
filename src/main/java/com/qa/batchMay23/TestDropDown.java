package com.qa.batchMay23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(dropdown);
		//select.selectByVisibleText("Eesti");
		select.selectByValue("hi");
		
		
		List<WebElement> values = dropdown.findElements(By.tagName("option"));
		System.out.println(values.size());
		
		
		System.out.println(values.get(0).getText());
		System.out.println(values.get(0).getAttribute("lang"));
		
		for(int i=0; i<values.size(); i++) {
			
			System.out.println(values.get(i).getAttribute("value"));
		}
		
		
		System.out.println("-----finding links----");
		
		
		WebElement block = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[7]/div[3]"));
	
		
		List<WebElement> links = block.findElements(By.tagName("a"));
		
		System.out.println(links.size()+"---Total links");
		
		
		for(WebElement link: links) {
			
			System.out.println(link.getText()+"---URL is---"+link.getAttribute("href"));
			
		}
		
		
		
		driver.findElements(By.xpath("//*[@id=\"load_form\"]/div[1]/div[2]/input")).get(1).click();
		
		
		WebElement block2 = driver.findElement(By.xpath("//block2"));
		
		
		block2.findElements(By.id("abc")).get(1).click();
		
		
		
		
		
		
		

	}

}

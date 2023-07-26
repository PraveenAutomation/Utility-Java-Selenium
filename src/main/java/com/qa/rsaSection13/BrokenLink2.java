package com.qa.rsaSection13;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLink2 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver dr = new ChromeDriver();
		
		SoftAssert sa = new SoftAssert();
		
		dr.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links = dr.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		for(WebElement link : links)
		{
			String url=link.getAttribute("href");
			
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode=conn.getResponseCode();
			System.out.println(respCode);
			
			// This is hard Assertion
			//Assert.assertTrue("The link with text "+link.getText()+" is broken with code "+respCode, respCode<400);
			
			// This is soft Assertion
			sa.assertTrue(respCode<400, "The link with text "+link.getText()+" is broken with code "+respCode);
			
			//Assert.assertTrue(respCode<400, "The link with text "+link.getText()+" is broken with code "+respCode);
			
			//if(respCode>400)
			//{
				//System.out.println("The link with text "+link.getText()+" is broken with code "+respCode);
				//Assert.assertTrue(false);
			//}
		}
		
		sa.assertAll();
		



	}

}

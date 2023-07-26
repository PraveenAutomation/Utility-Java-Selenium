 package com.qa.rsaSection13;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		/* Broken URL Scenario:
		 *  Step1: To get all URLS tied up to the links using selenium.
		 *  Step2: Java method will call URLs and get the status code
		 *  Step3: Validate if statuscode>400 i.e. URLs is not working & links which is tied to the URL is broken
		 *  
		 *  $('a[herf*="soapui"]')
		 *  a[href*='soapu']
		 *  //a[normalize-space()='SoapUI']
		 */
		
		// String url=dr.findElement(By.xpath("//a[normalize-space()='SoapUI']")).getAttribute("href");
		// String url=dr.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href"); 
		
		String url=dr.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int code=conn.getResponseCode();
		System.out.println(code);

		

	}

}

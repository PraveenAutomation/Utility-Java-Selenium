package com.qa.rsaSection13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HttpSSLAuthCheck {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		WebDriver dr=new ChromeDriver(option);
		
		dr.get("https://expired.badssl.com/");
		System.out.println(dr.getTitle());

	}

}

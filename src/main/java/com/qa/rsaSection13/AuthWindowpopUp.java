package com.qa.rsaSection13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthWindowpopUp {

	public static void main(String[] args) {
		
		WebDriver dr=new ChromeDriver();
		dr.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		System.out.println(dr.getTitle());
		
		String msg=dr.findElement(By.cssSelector("p")).getText();
		System.out.println(msg);

	}

}

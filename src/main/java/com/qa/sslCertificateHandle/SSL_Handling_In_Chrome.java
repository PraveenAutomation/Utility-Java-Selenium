package com.qa.sslCertificateHandle;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSL_Handling_In_Chrome {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ssl=new ChromeOptions();
		ssl.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(ssl);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://expired.badssl.com/");
		System.out.println("The page title is: "+driver.getTitle());
		driver.quit();

	}

}

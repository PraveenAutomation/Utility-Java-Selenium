package com.qa.rsaSection13;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotUtils {

	public static void main(String[] args) throws IOException {
		
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.google.com");
		
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		File src= ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\VANU\\Selenium\\abc.png"));

	}

}

package com.qa.javaUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValueDrive {

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		//FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"src\\test\\java\\com\\qa\\javaUtility\\data.properties");
		FileInputStream fis=new FileInputStream("D:\\Selenium\\Selenium-Utils\\Utility-Java-Selenium\\src\\test\\java\\com\\qa\\javaUtility\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("browser"));
		
		prop.setProperty("browser", "Firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos=new FileOutputStream("D:\\Selenium\\Selenium-Utils\\Utility-Java-Selenium\\src\\test\\java\\com\\qa\\javaUtility\\data.properties");
		prop.store(fos, null);
	
		
		//System.out.println(System.getProperty("user.dir"));
	}

}

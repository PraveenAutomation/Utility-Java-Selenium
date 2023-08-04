package com.qa.batchMay23;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBrowser {

	public static String browser = "edge";
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		/*
		 * Child1 c1 = new Child1();
		 * Child2 c2 = new Child2();
		 * Parent p1 = new Child1();
		 * Parent p2 = new Child2();
		 * 
		 * FirefoxDriver
		 * ChromeDriver
		 * EdgeDriver
		 * 
		 * 
		 * 
		 */

		// CTRL + SHIFT + O
		/// 4.6
		// System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		// WebDriverManager.chromedriver().setup();

		// FirefoxDriver driver = new FirefoxDriver();
		// EdgeDriver driver = new EdgeDriver();

		if (browser.equals("chrome")) {

			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {

			 driver = new FirefoxDriver();

		} else if (browser.equals("edge")) {

			 driver = new EdgeDriver();

		}

		driver.get("http://google.com");
		String title = driver.getTitle();
		System.out.println(title.length());
		System.out.println(title);

		String expectedTitle = "Gmail.com";

		if (title.equals(expectedTitle)) {

			System.out.println("Test case pass");
		} else {

			System.out.println("Test case fail");
		}

		driver.close();
	}

}

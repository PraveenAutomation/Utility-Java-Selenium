package com.qa.assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompareTimer {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void compareCoundown() throws ParseException
	{


//Count-down timer for looping upto 8 minutes
    int countdown = 25;
    while(countdown-->0) {
        // Fetching the actual class-countdown-timer value
        String actualTimerText = driver.findElement(By.id("class-countdown-timer")).getText().trim();
        String expectedTimerText = "Próxima clase en vivo en ";

        // Fetching the actual countdown-timer value
        String countdownTimer = driver.findElement(By.xpath("//span[@class='countdown-timer']")).getText().trim();

        // Converting the time for better comparing
        SimpleDateFormat format = new SimpleDateFormat("hh:mm");
        Date expectedFirstTime = format.parse("05:00"), expectedSecondTime = format.parse("02:00");
        Date actualCountdownTimer = format.parse(countdownTimer);

        // Checking the condition if the 'class-countdown-timer' text is 'Próxima clase en vivo ee' and counter is in between '05:00' and '02:00' or not? 
        if(actualTimerText.equals(expectedTimerText) && ((actualCountdownTimer.equals(expectedSecondTime) || actualCountdownTimer.after(expectedSecondTime)) && (actualCountdownTimer.equals(expectedFirstTime) || actualCountdownTimer.before(expectedFirstTime)))) {
            System.out.println("Condition Satisfied...");
            // Do something
            break;
        }
        // Waiting for one second before finding the element and checking the condition
       // Thread.sleep(1000);
	
    }
	}

}

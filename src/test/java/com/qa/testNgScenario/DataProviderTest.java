package com.qa.testNgScenario;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "dp")
	public void dataTest(String email, String pwd)
	
	{
		System.out.println(email+" "+pwd);
	}
	
	@Test(dataProviderClass = CustomDataProvider.class, dataProvider = "dpAnotherClass")
	public void dataTestFromAnotherClass(String fName, String lName)
	{
		System.out.println(fName+" "+lName);
	}
	
	@DataProvider(name="dp")
	public Object[][] getData()
	{
	
		Object[][] data={{"abc@gmail.com","abc"},{"mno@gmail.com","mno"},{"test@gmail.com","test"}};
		return data;
		
	}

}

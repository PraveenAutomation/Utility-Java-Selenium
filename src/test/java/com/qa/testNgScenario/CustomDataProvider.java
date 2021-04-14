package com.qa.testNgScenario;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
	
	@DataProvider(name="dpAnotherClass")
	public Object[][] getDataFromAnotherCalss()
	{
		Object[][] data= {{"raatan","Kam"},{"Ram","Vashisth"},{"Mohan","Murali"}};
		return data;
		
	}

}

package com.qa.testNgScenario;

import org.testng.annotations.Test;

public class PageFactoryDataProvider {
	
	private String str;
	
	public PageFactoryDataProvider(String str)
	{
		this.str=str;
	}
	
	@Test
	public void method()
	{
		System.out.println(str);
	}
}

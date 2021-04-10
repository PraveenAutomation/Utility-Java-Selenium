package com.qa.testNgScenario;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameter {
	
	@Test
	@Parameters({"MyName"})
	public void TestParameter(@Optional("Praveen") String name)
	{
		//System.out.println("My Name is"+name+" & "+"Age is "+age);
		System.out.println("My Name is "+name);
	}

}

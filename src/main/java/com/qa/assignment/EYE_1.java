package com.qa.assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EYE_1 {
	
	@Test
	public void applicationTest()
	{
		System.out.println("A is Running");
		Assert.assertTrue(2>3);
		System.out.println("B is Running");
	}

}

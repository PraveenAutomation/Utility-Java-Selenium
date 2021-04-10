package com.qa.testNgScenario;

import org.testng.annotations.Test;

public class TestNgThreadCount {
	
	@Test(threadPoolSize = 3,invocationCount = 3, timeOut = 1000)
	public void Test1()
	{
		System.out.println("I m in Test1 | "+Thread.currentThread().getId());
	}
	
	@Test
	public void Test2()
	{
		System.out.println("I m in Test2 | "+Thread.currentThread().getId());
	}
	
	@Test
	public void Test3()
	{
		System.out.println("I m in Test3 | "+Thread.currentThread().getId());
	}

}

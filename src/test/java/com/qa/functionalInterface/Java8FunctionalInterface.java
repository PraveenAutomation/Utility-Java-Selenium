package com.qa.functionalInterface;

@FunctionalInterface
public interface Java8FunctionalInterface {
	
	public void display();
	
	
	default public void defaultMethod()
	{
		System.out.println("Default Method!!");
	}
	
	default public void defaultMethod_1()
	{
		System.out.println("Default Method-1");
	}
	
	static public void staticMethod()
	{
		System.out.println("Static Method!!");
	}
	
	static public void staticMethod_1()
	{
		System.out.println("Static Method-1");
	}

}

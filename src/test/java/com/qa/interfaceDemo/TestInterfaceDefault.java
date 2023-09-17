package com.qa.interfaceDemo;

interface Drawable1
{
	void draw1();
	
	default void msg()
	{
		System.out.println("Welcome default in java 8");
	}
	
}

public class TestInterfaceDefault implements Drawable1{
	
	public void draw1()
	{
		System.out.println("Draw1 is implemented...");
	}

	public static void main(String[] args) {
		
		Drawable1 d = new TestInterfaceDefault();
		d.draw1();
		d.msg();
		

	}

}

package com.qa.javaException10Hrs;

public class RumtimeStackMechanism {

	public static void main(String[] args) {
		
		fun();
	}
	
	public static void fun()
	{
		morefun();
	}
	public static void morefun()
	{
		System.out.println("More fun");
	}

}

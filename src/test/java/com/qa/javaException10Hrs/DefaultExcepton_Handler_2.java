package com.qa.javaException10Hrs;

public class DefaultExcepton_Handler_2 {

	public static void main(String[] args) {

		doStuff();

	}

	public static void doStuff() {
		doMoreStuff();
		//System.out.println("Hello Stuff...");
		System.out.println(10/0);
		
	}

	private static void doMoreStuff() {
		System.out.println("Hello doMoreStuff.....");
		
	}

}

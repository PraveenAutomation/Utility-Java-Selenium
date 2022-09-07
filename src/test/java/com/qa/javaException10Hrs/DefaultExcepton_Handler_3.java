package com.qa.javaException10Hrs;

public class DefaultExcepton_Handler_3 {

	public static void main(String[] args) {
		 doStuff();
		 System.out.println(10/0);

	}

	public static void doStuff() {
		doMoreStuff();
		System.out.println("Hi doStuff...");
		
	}

	public static void doMoreStuff() {
		System.out.println("Hello doMoreStuff....");
		
	}

}

package com.qa.javaException10Hrs;

public class DefaultExcepton_Handler {

	public static void main(String[] args) {
		
		doStuff();

	}

	public static void doStuff() {
		doMoreStuff();
		
	}

	public static void doMoreStuff() {
		System.out.println(10/0);
		
		
	}

}

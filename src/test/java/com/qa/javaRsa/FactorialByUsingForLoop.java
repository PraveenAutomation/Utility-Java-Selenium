package com.qa.javaRsa;

public class FactorialByUsingForLoop {

	public static void main(String[] args) {
		
		factByForloop(6);

	}

	private static void factByForloop(int num) {
		
		long fact=1;
		for(int i=1;i<num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is: "+fact);
		
		
	}

}

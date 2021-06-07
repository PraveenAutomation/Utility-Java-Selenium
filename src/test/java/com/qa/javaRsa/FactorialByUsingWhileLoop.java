package com.qa.javaRsa;

public class FactorialByUsingWhileLoop {

	public static void main(String[] args) {
		factbyWhileLoop(5);

	}

	private static void factbyWhileLoop(int num) {
		
		int fact=1;
		int i=1;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
		
	}

}

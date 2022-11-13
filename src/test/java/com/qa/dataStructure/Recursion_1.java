package com.qa.dataStructure;

public class Recursion_1 {
	
	static int arr[]= {4,5,7,8,3,10};

	public static void main(String[] args) {
		
		// Sum of Array method:
		int sum=sumOfDigit(arr.length-1);
		System.out.println(sum);
		
		// Factorial of a number method:
		int fact_value =  factorialOfNumber(4);
		System.out.println(fact_value);
		
		// Fibonacci Series method:
		int fib_value=fibonacciOfNumber(7);
		System.out.println(fib_value);
		
	}

	private static int fibonacciOfNumber(int i) {
		if(i==0||i==1)
		{
			return i;
		}
		else
		{
		return fibonacciOfNumber(i-1)+fibonacciOfNumber(i-2);
		}

	}

	private static int factorialOfNumber(int n) {
		
		if(n==0)
			return 1;
		return n*factorialOfNumber(n-1);
	}

	private static int sumOfDigit(int n) {
		
		if(n==0)
			return arr[n];
		else
			return arr[n]+sumOfDigit(n-1);
		
	}

}

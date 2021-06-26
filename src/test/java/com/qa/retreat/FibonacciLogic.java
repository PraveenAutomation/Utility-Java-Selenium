package com.qa.retreat;

public class FibonacciLogic {

	public static void main(String[] args) {
		fiboSeries();

	}

	private static void fiboSeries() {
		
		int a=0;
		int b=1;
		int c=0;
		int i=1;
		
		while(i<9)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			i++;
		}
		
	}

}

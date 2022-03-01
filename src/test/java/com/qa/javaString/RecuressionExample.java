package com.qa.javaString;

public class RecuressionExample {

	public static void main(String[] args) {
		
		System.out.println("Addition is : "+sum(2,10));

	}

	private static int sum(int i, int j) {
		if(j>i)
		{
			return j+sum(i,j-1);
		}
		else
		{
			return j;
		}
		
		
	}

}

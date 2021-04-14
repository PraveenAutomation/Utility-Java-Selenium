package com.qa.javaRsa;

public class SumArray {

	public static void main(String[] args) {
		
		int x[]= {4,5,9,9,6,3,2};
		System.out.println(arraySum(x));

	}

	private static int arraySum(int x[]) {
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		//System.out.println("Sum is "+sum);
		return sum;
		
	}

}

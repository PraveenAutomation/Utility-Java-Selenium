package com.qa.javaRsa;

public class MultiplyWithoutOperator {

	public static void main(String[] args) {

		int result=multiply(5,10);
		System.out.println(result);

	}

	private static int multiply(int i, int j) {
		int k=1;
		int sum=0;
		while(k<=j)
		{
			sum=sum+i;
			k++;
		}
		return sum;
	}
	

}

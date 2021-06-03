package com.qa.javaRsa;

public class PrimeNumberFinding {

	public static void main(String[] args) {
		
		isPrime();

	}

	private static void isPrime() {
		
		boolean flag=false;
		int val = 31;
		
		for(int i1=2;i1<=val/2;i1++)
		{
			if(val%2==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("Not Prime Number!!");
		else
			System.out.println("Prime");
		
	}

}

package com.qa.javaRsa;

public class ReverseOfAnInteger {

	public static void main(String[] args) {
		
		long num=5489564;
		long rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		long num1=12345;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		


	}

}

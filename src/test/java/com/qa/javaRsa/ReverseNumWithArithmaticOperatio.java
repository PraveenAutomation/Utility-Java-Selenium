package com.qa.javaRsa;

public class ReverseNumWithArithmaticOperatio {

	public static void main(String[] args) {
		
		int result= reverserNum(543);
		System.out.println(result);

	}

	public static int reverserNum(int i) {
		int rev=0;
		while(i!=0)
		{
			int digit=i%10;
			rev=digit+rev*10;
			i=i/10;
		}
			
		return rev;
	}

}

package com.qa.javaRsa;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num=121,rem,rev=0;
		int temp=num;
		
		
		while(num!=0)
		{
			//rem=temp%10;
			rev=rev*10+num%10;
			num=num/10;
		}
		if(rev==num)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}

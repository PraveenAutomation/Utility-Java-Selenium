package com.qa.javaRsa;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num=121,rev=0;
		
		
		while(num!=0)
		{
			int temp=0;
			int rem=temp%10;
			rev=rev*10+rem;
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

package com.qa.sqtools;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		revString();
	}

	private static void revString() {
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s1=sc.nextLine();
		int len=s1.length();
		System.out.println("Reverse string is below: ");
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		sc.close();
	}

}

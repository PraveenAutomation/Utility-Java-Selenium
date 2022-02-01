package com.qa.reverseString;

import java.util.Scanner;

public class ReverseString_By_chatAt {

	public static void main(String[] args) {
		System.out.println("Enter String: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		revString(s);
		sc.close();

	}

	private static void revString(String s) {
		int l=s.length();
		String rev="";
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
	}

}

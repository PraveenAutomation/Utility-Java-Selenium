package com.qa.reverseString;

import java.util.Scanner;

public class StringReverse_By_StringBuffer {

	public static void main(String[] args) {
		System.out.println("Enter Original String: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		revString(s);
		sc.close();

	}
	
	public static void revString(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		StringBuffer rev=sb.reverse();
		System.out.println("Reversed String: "+rev);
		
	}

}

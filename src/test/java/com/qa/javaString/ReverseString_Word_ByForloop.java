package com.qa.javaString;

import java.util.Scanner;

public class ReverseString_Word_ByForloop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		
		String is=sc.nextLine();
		
		String os=reverseTheSentence(is);
		System.out.println("Input String "+is);
		System.out.println("Output String :"+os);
		sc.close();
		
	}

	private static String reverseTheSentence(String is) {
		String a[]=is.split("\\s");
		String rev="";
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i]+" ";
		}
		return rev;
	}


}

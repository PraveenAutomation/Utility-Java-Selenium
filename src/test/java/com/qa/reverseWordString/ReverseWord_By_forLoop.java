package com.qa.reverseWordString;

import java.util.Scanner;

public class ReverseWord_By_forLoop {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		
		String is=sc.nextLine();
		
		String os=reverseWord(is);
		System.out.println("Input String: "+is);
		System.out.println("Output String: "+os);
		sc.close();

	}

	private static String reverseWord(String s) {
		String a[]=s.split("\\s");
		String rev="";
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i]+" ";
		}
		return rev;
	}

}

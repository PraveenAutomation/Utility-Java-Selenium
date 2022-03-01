package com.qa.javaString;

import java.util.Scanner;

public class ReverseString_ByStringBuffer {

	public static void main(String[] args) {
		//String s="Hi VDS TECH LABS";
		System.out.println("Enter String: ");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		System.out.println("Reverse of String: "+sb.reverse());
		sc.close();

	}

}

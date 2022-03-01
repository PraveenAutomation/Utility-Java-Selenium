package com.qa.javaString;

public class CompareString_ByUsingDoubleEqualOperator {

	public static void main(String[] args) {
		String s1="VDS";
		String s2="TECH";
		compareTwoString(s1,s2);

	}

	private static void compareTwoString(String s1, String s2) {
		if(s1==s2)
			System.out.println("Strings are Equal");
		else
			System.out.println("Strings are not equal!");
		
	}

}

package com.qa.javaProgramBank;

public class SwapString_By_Using_3rd_Variable {

	public static void main(String[] args) {
		String s1="Love";
		String s2="You";
		swapString(s1,s2);

	}

	private static void swapString(String s1, String s2) {
		String temp = s1;
		s1=s2;
		s2=temp;
		System.out.println(s1+" "+s2);
		
		
	}

}

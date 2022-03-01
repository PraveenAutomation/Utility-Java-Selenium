package com.qa.javaProgramBank;

public class SwapStringWithout_3rd_Variable {

	public static void main(String[] args) {
		String a="Hello";
		String b="World";
		System.out.println(a+b);
		swapString(a,b);

	}

	private static void swapString(String a, String b) {
		System.out.println("String before swap: "+a+" "+b);
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("String after swap: "+a+" "+b);
		
	}

}

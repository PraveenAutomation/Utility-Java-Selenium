package com.qa.javaString;

public class DotEqualMethod_DoubleEqualOperator {

	public static void main(String[] args) {
		String s1=new String("VDS");
		String s2=new String("VDS");
		
		System.out.println(s1==s2);//Address or reference Comparison
		System.out.println(s1.equals(s2));// Content or value Comparison

	}

}

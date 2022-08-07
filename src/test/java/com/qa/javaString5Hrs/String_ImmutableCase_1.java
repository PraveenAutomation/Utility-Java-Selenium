package com.qa.javaString5Hrs;

public class String_ImmutableCase_1 {

	public static void main(String[] args) {
		String s1=new String("VDS");
		String s2=s1.toUpperCase();
		String s3=s1.toLowerCase();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		

	}

}

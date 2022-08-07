package com.qa.javaString5Hrs;

public class String_Constructor {

	public static void main(String[] args) {
		char[] ch= {'J','a','v','a'};
		String s=new String(ch);
		System.out.println("String is= "+s);
		
		byte[] b= {97,98,99,100};
		String s1=new String(b);
		System.out.println("Chars are= "+s1);

	}

}

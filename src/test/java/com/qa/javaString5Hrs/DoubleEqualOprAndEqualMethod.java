package com.qa.javaString5Hrs;

public class DoubleEqualOprAndEqualMethod {

	public static void main(String[] args) {
		// By String
		String s1=new String("VDS");
		String s2=new String("VDS");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		// By String Buffer
		StringBuffer sb1=new StringBuffer("VDS");
		StringBuffer sb2=new StringBuffer("VDS");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));

	}

}

package com.qa.javaString5Hrs;

public class StringBuffer_1 {

	public static void main(String[] args) {
		
		//Constructor in StringBuffer:
		//Constructor-1
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("abcdefghijklm4gu");
		System.out.println(sb.capacity());
		sb.append("o");
		System.out.println(sb.capacity());
		//Constructor-2
		StringBuffer sb1=new StringBuffer(1000);
		System.out.println(sb1.capacity());
		//Constructor-3
		StringBuffer sb2=new StringBuffer("VDS");
		System.out.println(sb2.capacity());
		
		//METHODS:
		sb2.insert(3, " TECH");
		System.out.println(sb2);
		

	}

}

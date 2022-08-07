package com.qa.javaString5Hrs;

public class Final_Vs_Immutability {

	public static void main(String[] args) {
		final StringBuffer sb=new StringBuffer("vanu");
		sb.append("VDS");
		System.out.println(sb);
		
		//sb=new StringBuffer("Tech");
		// Final is for variable where as Immutability is for Object.
		// Once any reference we have declare as final then we can not assign new variable 

	}

}

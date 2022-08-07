package com.qa.javaString5Hrs;

public class StringMutabilityVsImmutability {

	public static void main(String[] args) {
		
		// By String
		String s=new String("VDS");
		s.concat(" TECH");
		System.out.println("String is s= "+s);
		
		// By String Buffer
		StringBuffer sb=new StringBuffer("VDS");
		sb.append(" TECH");
		System.out.println("StringBuffer is sb="+sb);



	}

}

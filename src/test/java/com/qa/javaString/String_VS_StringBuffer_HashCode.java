package com.qa.javaString;

public class String_VS_StringBuffer_HashCode {
	

	public static void main(String[] args) {
		
		System.out.println("Hash Code of String:");
		String s="VDS";
		System.out.println(s);
		System.out.println(s.hashCode());
		//s=s+"TECH";
		s=s.concat("TECH");
		System.out.println(s);
		System.out.println(s.hashCode());
		
		System.out.println("Hash Code of StringBuffer:");
		StringBuffer sb=new StringBuffer("java");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb=sb.append("Faq");
		System.out.println(sb);
		System.out.println(sb.hashCode());

	}

}

package com.qa.javaBlog;

public class ReverseStringByForLoop {

	public static void main(String[] args) {
		
		String s="VDS TECH LABS";
		revString(s);
		

	}

	private static void revString(String s) {
		String rev="";
		int l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse of String : "+rev);
		
	}
	
	

}

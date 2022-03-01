package com.qa.javaString;

public class AllSubString_OfMainString {

	public static void main(String[] args) {
		
		String s="VDS";
		allsubString(s);

	}

	private static void allsubString(String s) {
		System.out.println("All sub strings are: ");
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				System.out.println(s.substring(i,j));
			}
		}
		
	}

}

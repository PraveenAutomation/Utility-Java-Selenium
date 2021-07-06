package com.qa.javaString;

public class CompareString_ByDotEqualMethod {

	public static void main(String[] args) {
		String s1="VDS";
		String s2=new String("VDS");
		String s3=new String("VDS");
		compareTwoString(s1,s2,s3);

	}

	private static void compareTwoString(String s1, String s2,String s3) {
		if(s1.equals(s2))
		{
			System.out.println("Equal!");
		}
		else if(s2.equals(s3))
		{
			System.out.println("Not Equal!");
		}
		else
		{
			System.out.println("None are equals!");
		}
		
			
		
	}

}

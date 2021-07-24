package com.qa.getAPI;

public class Test {

	public static void main(String[] args) {
		String s="VDS TECH LABS";
		revString(s);

	}
	
	public static void revString(String str)
	{
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse String: "+rev);
	}

}

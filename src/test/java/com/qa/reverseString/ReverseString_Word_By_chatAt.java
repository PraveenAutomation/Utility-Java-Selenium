package com.qa.reverseString;

public class ReverseString_Word_By_chatAt {

	public static void main(String[] args) {
		String s="VDS TECH LABS";
		System.out.println(revStringByWord(s));

	}

	private static String revStringByWord(String s) {
		String a[]=s.split("\\s");
		int len=a.length;
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i]+" ";
		}
		return rev;
		
	}

}

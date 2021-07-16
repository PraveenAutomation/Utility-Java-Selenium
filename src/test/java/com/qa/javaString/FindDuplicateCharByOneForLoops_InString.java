package com.qa.javaString;

public class FindDuplicateCharByOneForLoops_InString {

	public static void main(String[] args) {
		String s="beautifule beach";
		duplicateChar(s);

	}

	private static void duplicateChar(String s) {
		int len=s.length();
		char[] arr=s.toCharArray();
		for(int i=0;i<=len;i++)
		{
			if(arr[i]==arr[i+1])
			{
				System.out.print(arr[i]+" ");
				break;
			}
		}
		
	}

}

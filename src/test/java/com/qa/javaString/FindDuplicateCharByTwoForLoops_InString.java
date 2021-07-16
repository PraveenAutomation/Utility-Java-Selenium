package com.qa.javaString;

public class FindDuplicateCharByTwoForLoops_InString {

	public static void main(String[] args) {
		String s="beautifule beach";
		duplicateChar(s);

	}

	private static void duplicateChar(String str) {
		int l=str.length();
		char[] c=str.toCharArray();
		System.out.println("Duplicate Character in stringare: ");
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(c[i]==c[j])
				{
					System.out.print(c[j]+" ");
					break;
				}
			}
		}
		
		
	}

}

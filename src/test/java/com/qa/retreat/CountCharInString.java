package com.qa.retreat;

public class CountCharInString {
	public static void main(String[] args) {
		String s="VDS TECH LABS";
		char c='S';
		System.out.println(countChar(s,c));
	}

	private static int countChar(String s,char c) {
		
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
				count++;
			}

		}
		return count;
		
	}

}

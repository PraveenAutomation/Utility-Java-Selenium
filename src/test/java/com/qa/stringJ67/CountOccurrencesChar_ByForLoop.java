package com.qa.stringJ67;

public class CountOccurrencesChar_ByForLoop {

	public static void main(String[] args) {
		String s="vds tech labs is softwares";
		char c='v';
		countOccurrencesChar(s,c);

	}

	private static void countOccurrencesChar(String s,char c) {
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
				count++;
			}
		}
		System.out.println("Count of char is: "+count);
		
	}

}

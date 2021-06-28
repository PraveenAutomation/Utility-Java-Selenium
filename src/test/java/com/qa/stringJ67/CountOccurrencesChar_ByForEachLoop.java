package com.qa.stringJ67;

public class CountOccurrencesChar_ByForEachLoop {

	public static void main(String[] args) {
		String s="vds tech labs panel";
		char c='e';
		countOccurrencesChar(s,c);
		

	}

	private static void countOccurrencesChar(String s, char c) {
		int count =0;
		for(char ch : s.toCharArray())
		{
			if(ch==c)
			{
				count++;
			}
		}
		System.out.println("Char count is: "+count);
		
	}

}

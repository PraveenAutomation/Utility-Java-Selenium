package com.qa.javaString;

public class Count_NoOfPalindrome_InString {

	public static void main(String[] args) {
		String s1="Madam Arrora teaches malayalam";
		System.out.println(countPalin(s1));
	

	}
	
	//Utility to check if word is Palindrome:
	static boolean checkPalindrome(String word)
	{
		int len=word.length();
		word=word.toLowerCase();
		for(int i=0;i<len;i++,len--)
			if(word.charAt(i) != word.charAt(len-1))
				return false;
		return true;	
	}
	
	//Utility to Count Palindrome words:
	static int countPalin(String str)
	{
		//To check last word for palindrome
		str=str+"";
		//TO store each word:
		String word="";
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			//Extracting each word:
			if(ch!=' ')
				word=word+ch;
			else
				if(checkPalindrome(word))
					count++;
				word="";
		}
		return count;
	}
	

}

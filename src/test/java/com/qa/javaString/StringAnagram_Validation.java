package com.qa.javaString;

import java.util.Arrays;

public class StringAnagram_Validation {

	public static void main(String[] args) {
		String s1="listen";
		String s2="silent ";
		validateAnagram(s1,s2);

	}

	private static void validateAnagram(String s1, String s2) {
		if(s1.length()!=s2.length())
		{
			System.out.println("String is not Anagram!");
		}
		else
		{
			//Converting both the arrays to character array
			char[] str1=s1.toCharArray();
			char[] str2=s2.toCharArray();
			
			//Sorting the arrays using in-built function sort ()  
			Arrays.sort(str1);
			Arrays.sort(str2);
			
			//Comparing both the arrays using in-built function equals ()
			if(Arrays.equals(str1, str2)== true)
			{
				System.out.println("Strings are anagram");
			}
			else
			{
				System.out.println("Strings are not anagram");
			}
			
		}
		
	}
}

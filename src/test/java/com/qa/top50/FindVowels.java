package com.qa.top50;

public class FindVowels {

	public static void main(String[] args) {
		
		String s="Automation";
		System.out.println(stringConatinVowels(s));
	}

	private static boolean stringConatinVowels(String s) {
		
		return s.toLowerCase().matches(".*[aeiou]*.");
		
	}

}

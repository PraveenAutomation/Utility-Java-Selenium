package com.qa.javaString;

public class CountCharacterOccurnces_18June22 {

	public static void main(String[] args) {
		
		String s="Java Language is Great";
		int totalLength=s.length();
		String replaceAwithspace=s.replace("a","");
		System.out.println("Strinf is : "+replaceAwithspace);
		int lengthafterA=replaceAwithspace.length();
		System.out.println("No of A's is: "+(totalLength-lengthafterA));

	}

}

package com.qa.javaRsa;

public class CharacterOccuranceIn_String {

	public static void main(String[] args) {
		
		int count=countOccurance("praveen",'e');
		System.out.println(count);

	}

	private static int countOccurance(String word, char c) {
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)==c)
			{
				count++;
			}
		}
		return count;
		
	}

}

package com.qa.javaProgramBank;

public class Find_Initial_Letters_InFullName {

	public static void main(String[] args) {
		String name="VDS TECHLABS Praveen";
		printInitials(name);

	}

	public static void printInitials(String name) {
		if(name.length()==0)
			return;
		String words[]=name.split(" ");
		for(String word : words)
		{
			System.out.print(Character.toUpperCase(word.charAt(0))+" ");
		}
		
	}
	
	

}

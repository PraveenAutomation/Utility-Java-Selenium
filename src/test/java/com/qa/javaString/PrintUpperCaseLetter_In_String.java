package com.qa.javaString;

public class PrintUpperCaseLetter_In_String {

	public static void main(String[] args) {
		String str="Welcome to VDS Tech Labs!!";
		upperCaseLetter(str);

	}

	private static void upperCaseLetter(String str) {
		int len=str.length();
		System.out.println("Capitals letter are: ");
		for(int i=0;i<len;i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				System.out.print(str.charAt(i)+" ");
			}
		}
		
	}

}

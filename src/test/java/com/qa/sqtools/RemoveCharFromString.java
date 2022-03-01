package com.qa.sqtools;

public class RemoveCharFromString {

	public static void main(String[] args) {
		String s="chicago";
		char c='c';
		String ns=removeChar(s, c);
		System.out.println("Old String is "+s);
		System.out.println("New String is: "+ns);

	}

	private static String removeChar(String s, char c) {
		if(s==null)
		{
			return null;
		}
		else
		{
			return s.replaceAll(Character.toString(c), "");
		}
	}

}

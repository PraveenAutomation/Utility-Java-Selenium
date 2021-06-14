package com.qa.javaBlog;

public class StringReverse_ByRecursive {

	public static void main(String[] args) {
		
		StringReverse_ByRecursive sr=new StringReverse_ByRecursive();
		String s="My name is VDS Tech";
		String rev=sr.revByRecursive(s);
		System.out.println("Reverse of String is : "+rev);
		
		

	}
	
	public String revByRecursive(String s)
	{
		int l=s.length();
		if(l==1)
			return s;
		else
			return s.charAt(l-1) + revByRecursive(s.substring(0,l-1));
	}

}

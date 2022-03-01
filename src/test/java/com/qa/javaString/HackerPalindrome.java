package com.qa.javaString;

public class HackerPalindrome {

	public static void main(String[] args) {
		String s="VDS";
		int n = 0;
		System.out.println(palinString(s,n));
		

	}

	private static int palinString(String s,int n) {
		String rev="";
	    for(int i=s.length()-1;i>=0;i--)
	    {
	        rev=rev+s.charAt(i);
	    }
	    if(rev==s)
	    {
	        n=n+1;
	    }
	    return n;
	    }
		
	}
	

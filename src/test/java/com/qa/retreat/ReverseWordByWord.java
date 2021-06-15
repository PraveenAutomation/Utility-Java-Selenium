package com.qa.retreat;

public class ReverseWordByWord {

	public static void main(String[] args) {
		
		String s="VDS TECH LABS";
		String a[]=s.split("\\s");
		String rev="";
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i]+" ";
		}
		System.out.println(rev);

	}

}

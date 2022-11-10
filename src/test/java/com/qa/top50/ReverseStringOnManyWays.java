package com.qa.top50;

public class ReverseStringOnManyWays {

	public static void main(String[] args) {
		String s1="Java Automation";
		String s2="Software Testing";
		String s3="DevOps Operation";
		
		revString1ByStringBuffer(s1);
		//System.out.println(revString2ByIteration(s2));
		revString2ByIteration(s2);
		//System.out.println(revString3ByCharAtMethod(s3));
		revString3ByCharAtMethod(s3);

	}

	private static String revString3ByCharAtMethod(String s3) {
		
		int len=s3.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s3.charAt(i);
		}
		System.out.println(rev);
		return rev;
		
	}

	private static String revString2ByIteration(String s2) {
		
		if(s2==null)
			throw new IllegalArgumentException("Not valid string");
		
		StringBuffer sb=new StringBuffer();
		char[] ch=s2.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
			sb.append(ch[i]);
		System.out.println(sb.toString());
		return sb.toString();
		
	}

	private static void revString1ByStringBuffer(String s1) {
		StringBuffer sb=new StringBuffer(s1);
		System.out.println(sb.reverse());
		
	}

}

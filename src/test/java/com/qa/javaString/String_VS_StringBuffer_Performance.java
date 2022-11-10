package com.qa.javaString;

public class String_VS_StringBuffer_Performance {
	
	public static String concatWithString()
	{
		String s="VDS";
		for(int i=0;i<1000;i++)
		{
			s=s+" TECH";
		}
		return s;
	}
	
	public static String concatWithStringBuffer()
	{
		StringBuffer sb = new StringBuffer("Java");
		for(int i=0;i<1000;i++)
		{
			sb=sb.append(" FAQ");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		//System.out.println(" "+concatWithString());
		//System.out.println(concatWithStringBuffer());
		
		long totalTime=System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-totalTime)+"ms"); 
		
		totalTime=System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println("Time taken by Concating with StringBuffer: "+(System.currentTimeMillis()-totalTime)+"ms"); 

	}

}

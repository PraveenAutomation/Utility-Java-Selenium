package com.qa.javaString;

public class LengthOfLastWord_In_String {
	
	public static void main(String[] args) {
		LengthOfLastWord_In_String ab=new LengthOfLastWord_In_String();
		String x="VDS TECH LABS";
		System.out.println(lengthOfLastWord(x));
	}
	
	public static int lengthOfLastWord(String s)
	{
		int len=0;
		
		String a=s.trim();
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==' ')
			{
				len=0;
			}
			else
			{
				len++;
			}
		}
		return len;
	}

}

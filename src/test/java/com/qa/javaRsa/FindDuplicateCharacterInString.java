package com.qa.javaRsa;

public class FindDuplicateCharacterInString {

	public static void main(String[] args) {
		String s="Praveen VDS TECH LABS";
		int l=s.length();
		char[] ch=s.toCharArray();
		
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("Duplicate Char are: "+ch[j]);
					break;
				}
			}
				
		}

	}

}

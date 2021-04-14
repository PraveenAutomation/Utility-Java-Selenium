package com.qa.starPattern;

public class AlphaPattern {

	public static void main(String[] args) {
		
		alphPattern();


	}
	
	public static void alphPattern()
	{
		//int alpha=65;
		int lowerAlpha=97;
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(lowerAlpha+j)+" ");
			}
			System.out.println();			
		}
	}

}

package com.qa.javaRsa;

public class StarTringleRSA {
	public static void main(String[] args) {
		
		starTrRsa();
		
	}
	
	public static void starTrRsa()
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}

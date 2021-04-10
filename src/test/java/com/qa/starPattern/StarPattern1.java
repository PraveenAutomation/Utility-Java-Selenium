package com.qa.starPattern;

public class StarPattern1 {

	public static void main(String[] args) {
		
		System.out.println("======== STAR TRIANGLE ===========");
		starTriange();
		System.out.println("===========REVERSE STAR TRIANGLE ==============");
		starReverseTriange();
		System.out.println("============ COMPLETE STAR TRIANGLE =============");
		starTriange();
		starReverseTriange();
		System.out.println("------------------------------");
		backwardStarTriangle();
		System.out.println("-----------Pyramid-------------------");
		pryamidfStarTriangle();

	}
	
	public static void starTriange()
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
		
	public static void starReverseTriange()
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void backwardStarTriangle()
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
		
		public static void pryamidfStarTriangle()
		{
			for(int i=0;i<=4;i++)
			{
				for(int j=3;j>=i;j--)
				{
					System.out.print(" ");
				}
				
				for(int k=0;k<=i;k++)
				{
					System.out.print(" *");
				}
				System.out.println();
			}
	}

	
	

}

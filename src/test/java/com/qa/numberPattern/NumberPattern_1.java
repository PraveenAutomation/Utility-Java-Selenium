package com.qa.numberPattern;

import java.util.Scanner;

public class NumberPattern_1 {

	public static void main(String[] args) {
		upperHalfAndLowerHalfNumPattern();

	}
	
	public static void upperHalfAndLowerHalfNumPattern()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Pattern for how many rows?");
		
		int rows=sc.nextInt();
		
		System.out.println("Below are the Pattern: ");
		
		// First Upper Half:
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//For Lower half:
		for(int i=rows-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}

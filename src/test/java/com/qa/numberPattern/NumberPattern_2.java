package com.qa.numberPattern;

import java.util.Scanner;

public class NumberPattern_2 {

	public static void main(String[] args) {
		increasingNumberTrianglePattern();

	}
	
	public static void increasingNumberTrianglePattern()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many rows: ");
		int rows=sc.nextInt();
		System.out.println("Pattern are Below: ");
		
		//Actual Logic:
		for(int i=1;i<=rows;i++)
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

package com.qa.numberPattern;

import java.util.Scanner;

public class NumberPattern_3 {

	public static void main(String[] args) {
		
		increasingNumPattern();

	}
	
	public static void increasingNumPattern()
	{
		System.out.println("Enter the row num in pattern: ");
		Scanner sc = new Scanner(System.in);
		int rowNum=sc.nextInt();
		int value=1;
		System.out.println("Pattern is: ");
		for(int i=1;i<=rowNum;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(value+"\t");
				value++;
			}
			System.out.println();
		}
		
	}

}

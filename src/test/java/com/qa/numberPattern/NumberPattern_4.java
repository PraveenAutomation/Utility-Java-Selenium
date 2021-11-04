package com.qa.numberPattern;

import java.util.Scanner;

public class NumberPattern_4 {

	public static void main(String[] args) {
		
		numTriangePatternWithSameDigit();

	}
	
	public static void numTriangePatternWithSameDigit()
	{
		System.out.println("Enter the Patter num: ");
		Scanner sc=new Scanner(System.in);
		int rowNum=sc.nextInt();
		
		System.out.println("Your required pattern is: ");
		for(int i=1;i<=rowNum;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}

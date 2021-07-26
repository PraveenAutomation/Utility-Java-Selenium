package com.qa.sqtools;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		numberPattern();
		

	}
	
	public static void numberPattern()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
		System.out.println("Pattern is below: ");
		for(int i=1;i<=n;i++)
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

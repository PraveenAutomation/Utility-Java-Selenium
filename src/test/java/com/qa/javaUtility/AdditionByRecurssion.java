package com.qa.javaUtility;

import java.util.Scanner;

public class AdditionByRecurssion {

	public static void main(String[] args) {
		System.out.println(addUptoTen(10));
		System.out.println(sumRange(5,10));
		int a=summationUpToN(5);
		System.out.println("Sum upto 5: "+a);

	}
	
	public static int summationUpToN(int num)
	{
		int sum=0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number: ");
			sc.nextInt();
		}
		for(int i=0;i<=num;i++)
		{
			sum+=i;
		}
		return sum;
	}
	
	public static int addUptoTen(int k)
	{
		if(k>0)
		{
			return k+ addUptoTen(k-1);
		}
		else
		{
			return 0;
		}
	}
	
	public static int sumRange(int start, int end)
	{
		if(end>start)
			return end+sumRange(start, end-1);
			else
				return end;
		
	}

}

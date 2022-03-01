package com.qa.arrayProgramBank;

import java.util.Scanner;

public class Find_Even_Odd_Elmnt_In_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();
		// Create an int array of size n:
		int num[]=new int[n];
		
		// Take input for the array:
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		
		countOddEven(num);
		
		sc.close();

	}

	private static void countOddEven(int[] arr) {
		
		int oddCount=0;
		int evenCount=0;
		
		// traverse the array:
		for(int i=0;i<arr.length;++i)
		{
			if(arr[i]%2==0)
				++evenCount;
			else 
				++oddCount;
		}
		
		System.out.println("Count of Even Numbers = "+evenCount);
		System.out.println("Count of Odd numbers = "+oddCount);
		
	}

}

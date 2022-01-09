package com.qa.arrayProgramBank;

import java.util.Scanner;

public class Array_Input_From_User {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		// Integer Array Object:
		int [] a=new int[5];
		//Displaying Default value of an Array:
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		// Initiliaze the value of an array:
		System.out.println("Enter "+a.length+"Integer value: ");
		//Read Input:
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array's Element are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
			
		sc.close();
		
		
	}

}

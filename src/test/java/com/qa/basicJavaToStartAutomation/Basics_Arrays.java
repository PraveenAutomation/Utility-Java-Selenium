package com.qa.basicJavaToStartAutomation;

public class Basics_Arrays {

	public static void main(String[] args) {
		
		int[] a2= {1,5,7,8,9,6,3,4,10};
		System.out.println(a2[5]);
		for(int i=0;i<a2.length;i++)
		{
			System.out.print(a2[i]+" ");
		} 
		
		
		System.out.println("\n*****************");
		
		for(int a : a2)
		{
			System.out.print(a+" ");
		}

	}

}

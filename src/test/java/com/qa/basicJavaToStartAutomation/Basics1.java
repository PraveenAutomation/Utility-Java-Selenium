package com.qa.basicJavaToStartAutomation;

public class Basics1 {

	public static void main(String[] args) {
		
		// Varable:
		int age=25;
		String name="Software";
		char ch='a';
		float money=45.9f;
		double money2=12.9d;
		boolean myTest=true;
		
		System.out.println(age);
		
		//Array:
		int a1[]=new int[3];
		a1[0]=2;
		a1[1]=8;
		a1[2]=9;
		System.out.println(a1[2]);
		
		int[] a2= {1,5,7,8,9,6,3,4,10};
		System.out.println(a2[5]);
		
		/*
		 *  for(initilization;condition;incement or decrement) 
		 *  {
		 *     operation
		 *  }
		 */		
		for(int i=0;i<a2.length;i++)
		{
			System.out.print(a2[i]+" ");
		} 
		
		
		System.out.println("\n*****************");
		
		for(int a : a2)
		{
			System.out.print(a+" ");
		}
		System.out.println("\n*****************");
		// String names
		String[] names= {"Software","Test","Automation","Selenium","Playwright"};
		System.out.println(names[2]);
		
		System.out.println("------------------");
		
		for(int i=0;i<names.length;i++)
		{
			
			System.out.println(names[i]);
		}
		
		System.out.println("================");
		
		for(String s : names)
		{
			System.out.println(s);
		}

	}

}

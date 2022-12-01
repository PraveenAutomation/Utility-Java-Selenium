package com.qa.polyMorphism;

public class MethodOverloading_1 {
	
	public long add(int a, long b)
	{
		return a+b;
	}
	public double add(int a, double b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		
		MethodOverloading_1 obj=new MethodOverloading_1();
		
		// Here Type Promotion is happening int to long & float to double
		System.out.println(obj.add(10,10.5f));
		System.out.println(obj.add(10,10));
		

	}

}

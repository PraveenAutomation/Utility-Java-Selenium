package com.qa.polyMorphism;

public class TestOverloading2 {

	public static void main(String[] args) {
		
		System.out.println(Adder1.add(12.5, 11.4));
		System.out.println(Adder1.add(5, 8));
		

	}

}

class Adder1
{
	static int add(int a, int b)
	{
		return a+b;
	}
	static double add(double a, double b)
	{
		return a+b;
	}
}

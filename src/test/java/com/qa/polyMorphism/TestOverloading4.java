package com.qa.polyMorphism;

public class TestOverloading4 {
	
	// Implicit Type promotion:
	// byte-->short-->int -->long-->float-->double

	public static void main(String[] args) {
		Adder2 a = new Adder2();
		a.sum(10, 20);
		a.sum(5, 5, 5);
	}

}

class Adder2
{
	void sum(int a , long b)
	{
		System.out.println(a+b);
	}
	
	void sum(int a , int b, int c)
	{
		System.out.println(a+b+c);
	}
}

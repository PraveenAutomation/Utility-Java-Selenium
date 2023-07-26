package com.qa.polyMorphism;

public class TestOverloading1 {

	public static void main(String[] args) {
		System.out.println(Adder.add(4,5));
		System.out.println(Adder.add(10, 10, 10));
		

	}

}
class Adder
{
	static int add(int a , int b)
	{
		return a+b;
	}
	
	static int add(int a , int b, int c)
	{
		return a+b+c;
	}
}

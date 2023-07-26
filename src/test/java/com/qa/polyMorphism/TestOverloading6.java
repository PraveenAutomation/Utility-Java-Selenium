package com.qa.polyMorphism;

public class TestOverloading6 {

	public static void main(String[] args) {
		TestOverloading6 t = new TestOverloading6();
		//t.sum(10,20);

	}
	
	void sum(int a, long b)
	{
		System.out.println("int & long");
	}
	
	void sum(long a , int b)
	{
		System.out.println("long & int");
	}

}

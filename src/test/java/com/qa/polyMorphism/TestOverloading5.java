package com.qa.polyMorphism;

public class TestOverloading5 {

	public static void main(String[] args) {
		
		TestOverloading5 t = new TestOverloading5();
		t.sum(10, 10.5);
		t.sum(5, 10);
		
		

	}
	
	void sum(int a , int b)
	{
		System.out.println("Int arguments");
	}
	
	void sum(int a, double b)
	{
		System.out.println("Int & double arguments");
	}

}

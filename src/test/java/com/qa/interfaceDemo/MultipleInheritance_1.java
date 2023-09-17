package com.qa.interfaceDemo;

interface Animal
{
	void sound();
}

interface Dog
{
	void bark();
}

public class MultipleInheritance_1 implements Animal , Dog {
	
	public void sound()
	{
		System.out.println("Animal sound....");
	}
	
	public void bark()
	{
		System.out.println("Dog barking...");
	}

	public static void main(String[] args) {
		
		MultipleInheritance_1 mi = new MultipleInheritance_1();
		mi.bark();
		mi.sound();
		

	}

}

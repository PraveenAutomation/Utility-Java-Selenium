package com.qa.interfaceDemo;

interface Animal1
{
	void walk();
}

interface Dog1 extends Animal
{
	void sound();
}

public class InterfaceInheritance_1 implements Dog1 {
	
	public void walk()
	{
		System.out.println("Animal walking....");
	}
	
	public void sound()
	{
		System.out.println("Dog is barking");
	}

	public static void main(String[] args) {
		InterfaceInheritance_1 ih = new InterfaceInheritance_1();
		ih.walk();
		ih.sound();
	}



}

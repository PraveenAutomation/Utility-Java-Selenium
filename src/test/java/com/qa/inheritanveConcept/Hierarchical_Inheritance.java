package com.qa.inheritanveConcept;

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.eat();
		c.meow();
		// c.bark();--> CTE


	}
	

}
class Animal2
{
	void eat()
	{
		System.out.println("Animal2 eating...");
	}
}
class Dog2 extends Animal2
{
	void bark()
	{
		System.out.println("Dob2 barking...");
	}
}
class Cat extends Animal2
{
	void meow()
	{
		System.out.println("Cat meowing...");
	}
}

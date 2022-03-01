package com.qa.inheritanveConcept;

public class Single_Inheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
		d.eat();

	}

}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog is barking...");
	}
}
class Animal
{
	void eat()
	{
		System.out.println("Eating Animal...");
	}
}

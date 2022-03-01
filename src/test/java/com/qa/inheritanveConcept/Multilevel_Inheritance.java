package com.qa.inheritanveConcept;

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		BabyDog1 bd=new BabyDog1();
		bd.babyBark();
		bd.eat();
		bd.bark();
		

	}
}
class Animal1
{
	void eat()
	{
		System.out.println("Animal Eating...");
	}
}
class Dog1 extends Animal1
{
	void bark()
	{
		System.out.println("Dog Barking...");
	}
}
class BabyDog1 extends Dog1
{
	void babyBark()
	{
		System.out.println("Baby Dog Barking...");
	}
}


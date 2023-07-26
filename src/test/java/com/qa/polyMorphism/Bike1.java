package com.qa.polyMorphism;

public class Bike1 extends Vehicle1 {
	
	void run()
	{
		System.out.println("Bike is running....");
	}

	public static void main(String[] args) {
		Bike1 b = new Bike1();
		b.run();
		

	}

}

class Vehicle1
{
	void run()
	{
		System.out.println("Vehicle is running");
	}
}
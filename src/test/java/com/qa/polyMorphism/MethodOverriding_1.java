package com.qa.polyMorphism;

public class MethodOverriding_1 {
	
	public static void main(String[] args) {
		
		Vehicle v=new Bike();
		v.run();

	}
}
	
class Vehicle 
	{
		public void run()
		{
			System.out.println("Vechicle is running fine....");
		}

	}
	
class Bike extends Vehicle
	{
		public void run()
		{
			System.out.println("Bike is running fine....");
		}
	}



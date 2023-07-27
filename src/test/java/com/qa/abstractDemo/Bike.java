package com.qa.abstractDemo;

public class Bike extends Honda {

	public static void main(String[] args) {
		
		Bike b = new Bike();
		b.run();

	}


	void run() {
		System.out.println("running safely....");
		
	}

}

abstract class Honda
{
	abstract void run();
}

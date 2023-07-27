package com.qa.abstractDemo;

class Bike1 extends TestAbs2
{
	void run() {
		System.out.println("Bike is run fine");
		
	}
	
}

abstract class TestAbs2 {
	
	TestAbs2()
	{
		System.out.println("This is constructor");
	}
	
	abstract void run();
	
	void changeGear()
	{
		System.out.println("Gear can be change......");
	}

	public static void main(String[] args) {
		
		//TestAbs2 b1 = new Bike1();
		Bike1 b1 = new Bike1();
		b1.changeGear();
		b1.run();

	}

}



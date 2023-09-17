package com.qa.abstractDemo2;

abstract class Bike
{
	abstract void run();
}

public class TestAbstract_1 extends Bike {

	public static void main(String[] args) {
		
		
		Bike b = new TestAbstract_1();
		b.run();

	}

	@Override
	void run() {
		System.out.println("Bike running");
		
	}

}

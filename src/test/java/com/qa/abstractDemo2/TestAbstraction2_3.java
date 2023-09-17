package com.qa.abstractDemo2;

abstract class Bike1
{
	String bikeName="Maruti Suzuki";
	abstract void run();
	void safty()
	{
		System.out.println("Safty is mandatory...");
	}
	
	abstract int speed();
}

abstract class Honda extends Bike1
{
	void run()
	{
		System.out.println("Bike is runnoing....");
	}
}

class Suzuki extends Honda
{

	@Override
	int speed() {
		
		return 100;
	}
	
}

public class TestAbstraction2_3 {

	public static void main(String[] args) {
		Bike1 s =new Suzuki();
		s.run();
		System.out.println(s.speed());
		s.safty();
		System.out.println(s.bikeName);

	}

}

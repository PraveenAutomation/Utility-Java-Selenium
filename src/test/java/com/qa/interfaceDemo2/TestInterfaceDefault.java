package com.qa.interfaceDemo2;

interface Deafult
{
	void print6();
	default void msg()
	{
		System.out.println("Default greet message.....");
	}
}

class A6 implements Deafult
{

	@Override
	public void print6() {
		System.out.println("Default interface print method is implemented....");
		
	}
	
}

public class TestInterfaceDefault {

	public static void main(String[] args) {
		A6 a6 = new A6();
		
		a6.msg();
		a6.print6();

	}

}

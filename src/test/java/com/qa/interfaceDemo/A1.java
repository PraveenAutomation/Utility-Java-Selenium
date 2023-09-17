package com.qa.interfaceDemo;

interface printable
{
	void print();
}

public class A1 implements printable {
	
	public void print()
	{
		System.out.println("Implemented interface method....");
	}

	public static void main(String[] args) {
		
		A1 a = new A1();
		a.print();
	}

}

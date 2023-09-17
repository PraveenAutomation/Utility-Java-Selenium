package com.qa.interfaceDemo2;

interface I1
{
	void m1();
}

class A2 implements I1
{
	public void m1()
	{
		System.out.println("Jai Ho Bhole Nath!!");
	}
}

public class TestInterface_1  {

	public static void main(String[] args) {
		
		A2 a = new A2();
		a.m1();
		

	}

}

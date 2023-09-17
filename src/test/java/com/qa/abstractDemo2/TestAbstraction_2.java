package com.qa.abstractDemo2;

abstract class Draw
{
	abstract void shape();
}

class Abs1 extends Draw
{
	public void shape()
	{
		System.out.println("Abs1 shape implemented....");
	}
}

class Abs2 extends Draw
{
	public void shape()
	{
		System.out.println("Abs2 shape implemented....");
	}
}

public class TestAbstraction_2 {

	public static void main(String[] args) {
		
		Draw d = new Abs1();
		d.shape();
		Draw d1 = new Abs2();
		d1.shape();
		

	}

}

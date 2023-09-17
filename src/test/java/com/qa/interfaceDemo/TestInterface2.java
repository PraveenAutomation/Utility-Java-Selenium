package com.qa.interfaceDemo;

interface Bank
{
	float rateOfInterest();
}

class SBI implements Bank
{
	public float rateOfInterest()
	{
		return 10.2f;
	}
}

class HDFC implements Bank
{
	public float rateOfInterest()
	{
		return 9.2f;
	}
}

public class TestInterface2 {

	public static void main(String[] args) {
		Bank b1,b2;
		b1=new SBI();
		System.out.println(b1.rateOfInterest());
		b2=new HDFC();
		System.out.println(b2.rateOfInterest());

	}

}

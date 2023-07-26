package com.qa.polyMorphism;

public class Test {

	public static void main(String[] args) {
		
		SBI s = new SBI();
		PNB p = new PNB();
		AXIX a=new AXIX();
		System.out.println(s.getRateOfInterest());
		System.out.println(p.getRateOfInterest());
		System.out.println(a.getRateOfInterest());

	}

}

class Bank
{
	int getRateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}
class PNB extends Bank
{
	int getRateOfInterest()
	{
		return 8;
	}
}

class AXIX extends Bank
{
	int getRateOfInterest()
	{
		return 9;
	}
}

package com.qa.abstractDemo;

abstract class Bank
{
	abstract int getRateOfInterest();
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

public class TestBank {

	public static void main(String[] args) {
		
		Bank b;
		b= new SBI();
		int sbiROI=b.getRateOfInterest();
		System.out.println(sbiROI);
		b=new PNB();
		int pnbROI=b.getRateOfInterest();
		System.out.println(pnbROI);
		

	}

}

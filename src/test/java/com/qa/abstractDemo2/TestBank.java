package com.qa.abstractDemo2;

abstract class Bank
{
	abstract int getROI();
}

class SBI extends Bank
{

	@Override
	int getROI() {
		return 7;
	}
	
}

class PNB extends Bank
{

	@Override
	int getROI() {
		
		return 5;
	}
	
}

public class TestBank {

	public static void main(String[] args) {
		
		Bank b1 = new SBI();
		System.out.println(b1.getROI());
		Bank b2 = new PNB();
		System.out.println(b2.getROI());
		

	}

}

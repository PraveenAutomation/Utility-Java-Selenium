package com.qa.interfaceDemo2;

interface Bank
{
	float getInterest();
}

class SBI implements Bank
{

	public float getInterest() {
		
		return 8.2f;
	}
	
}

class HDFC implements Bank
{

	public float getInterest() {
		
		return 7.2f;
	}
	
}

public class TestInterface_3 {

	public static void main(String[] args) {
		
		Bank b = new SBI();
		System.out.println(b.getInterest());
		

	}

}

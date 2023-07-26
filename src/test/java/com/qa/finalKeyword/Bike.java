package com.qa.finalKeyword;

public class Bike {
	
	final int speedlimit=10;
	
	final String PAN_CARD_NUMBER;
	
	Bike()
	{
		PAN_CARD_NUMBER = "45789897897";
		System.out.println(PAN_CARD_NUMBER);
	}
	
	void run()
	{
		//speedlimit=40;
	}

	public static void main(String[] args) {
		
		Bike b = new Bike();
		b.run();

	}

}

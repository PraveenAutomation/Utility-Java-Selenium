package com.qa.interfaceDemo2;

interface Printable
{
	void print();
}

interface Showable
{
	void show();
}

class A4 implements Printable , Showable
{

	@Override
	public void show() {
		
		System.out.println("Print message.....");
	}

	@Override
	public void print() {
		
		System.out.println("Show the message...");
		
	}
	
}
public class TestInterface_4 {
	
	public static void main(String[] args) {
		
		A4 a4=new A4();
		a4.print();
		a4.show();
		

	}

}

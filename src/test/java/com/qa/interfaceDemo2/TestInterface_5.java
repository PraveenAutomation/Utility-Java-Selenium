package com.qa.interfaceDemo2;

interface Print5
{
	void print5();
}

interface Show5 extends Print5
{
	void show5();
}

public class TestInterface_5 implements Show5{
	
	public void print5()
	{
		System.out.println("implements print5....");
	}
	@Override
	public void show5() {
		System.out.println("implements show5....");
		
	}

	public static void main(String[] args) {
		
		TestInterface_5 i5 = new TestInterface_5();
		i5.show5();
		i5.print5();
		

	}



}

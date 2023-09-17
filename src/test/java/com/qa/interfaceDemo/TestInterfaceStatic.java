package com.qa.interfaceDemo;

interface Calculation
{
	void calc();
	
	static int cube(int n)
	{
		return n*n*n;
	}
}

class Circle1 implements Calculation
{
	public void calc()
	{
		System.out.println("Calculation is smooth....");
	}
}


public class TestInterfaceStatic {
	
	

	public static void main(String[] args) {
		
		Calculation c = new Circle1();
		c.calc();
		System.out.println(Calculation.cube(5));
		
		

	}

}

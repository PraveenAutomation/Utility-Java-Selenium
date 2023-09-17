package com.qa.interfaceDemo2;

interface I2
{
	void draw();
	int a=5;
}

class Reactangle implements I2
{
	public void draw()
	{
		System.out.println("Implementation by Rectangle...");
	}
}

class Circle implements I2
{
	public void draw()
	{
		System.out.println("Implementation by Circle...");
	}
}

public class TestInterface_2 {

	public static void main(String[] args) {
		
		I2 i2=new Reactangle();
		i2.draw();
		

	}

}

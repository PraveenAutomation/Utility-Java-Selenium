package com.qa.abstractDemo;

abstract class Shape
{
	abstract void draw();
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Draw a circle.....");
	}
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Draw a circle....");
	}
}

public class TestAbs1 {
	
	public static void main(String[] args) {
		
		Shape s = new Circle();
		s.draw();
		
	}

}

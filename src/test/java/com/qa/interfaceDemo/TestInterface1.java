package com.qa.interfaceDemo;

interface Drawable
{
	void draw();
}

class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("draw rectangle.....");
	}
}

class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("draw circle...");
	}
}
public class TestInterface1 {

	public static void main(String[] args) {
		
		Drawable d1,d2;
		d1=new Circle();
		d1.draw();
		d2=new Rectangle();
		d2.draw();
		

	}

}



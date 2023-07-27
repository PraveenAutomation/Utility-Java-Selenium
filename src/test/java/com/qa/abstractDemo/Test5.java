package com.qa.abstractDemo;

interface A
{
	void a();
	void b();
	void c();
	void d();
}

abstract class B implements A
{
	public void a()
	{
		System.out.println("implemented a method");
	}
}

class M extends B
{

	
	public void b() {
		System.out.println("implemented b method");
		
	}


	public void c() {
		System.out.println("implemented c method");
		
	}

	
	public void d() {
		System.out.println("implemented d method");
		
	}
	
}

public class Test5 {

	public static void main(String[] args) {
		
		A x = new M();
		x.a();
		x.b();
		x.c();
		x.d();
		

	}

}

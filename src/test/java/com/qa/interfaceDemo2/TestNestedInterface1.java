package com.qa.interfaceDemo2;

interface Inf1
{
	void say();
	interface Inf2
	{
		void cal();
	}
}

class A8 implements Inf1.Inf2
{

	
	public void say() {
		System.out.println("Say Hello....!");
		
	}

	
	public void cal() {
		int a=5;
		int b=5;
		System.out.println(a+b);
		
	}
	
}

public class TestNestedInterface1   {

	public static void main(String[] args) {
		
		A8 a8=new A8();
		a8.cal();
		a8.say();
		

	}



}

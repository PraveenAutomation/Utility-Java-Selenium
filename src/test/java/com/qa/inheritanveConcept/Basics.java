package com.qa.inheritanveConcept;

public class Basics extends Test {
	
	int salary=10000;
	int sum(int a,int b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		Basics b=new Basics();
		b.salary();
		System.out.println(b.name);
		System.out.println(b.sum(5, 10));
		System.out.println(b.salary);
		
		Test t = new Test();
		System.out.println("Name from Test is :"+t.name);
		t.salary();
		
	}
}

class Test
{
	String name="VDS TECH LABS";
	void salary()
	{
		System.out.println("Standard salary");
		
	}
}

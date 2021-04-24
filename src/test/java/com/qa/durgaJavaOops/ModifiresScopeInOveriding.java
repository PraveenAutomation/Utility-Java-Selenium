package com.qa.durgaJavaOops;

public class ModifiresScopeInOveriding {
	public static void main(String[] args) {
		A a=new B();
		a.m1();
		
	}

}
class A
{
	protected void m1()
	{
		System.out.println("Protected ");
	}
}
class B extends A
{
	public void m1()
	{
		System.out.println("Protected...");
	}
}
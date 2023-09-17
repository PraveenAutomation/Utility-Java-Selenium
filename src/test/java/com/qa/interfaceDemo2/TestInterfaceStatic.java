package com.qa.interfaceDemo2;

interface StaticInterface
{
	void jump();
	static int cuble(int a)
	{
		return a*a*a;
	}
}

class A7 implements StaticInterface
{
	public void jump()
	{
		System.out.println("Jump method is implemented....");
	}
}

public class TestInterfaceStatic {

	public static void main(String[] args) {
		
		A7 a7 = new A7();
		a7.jump();
		
		System.out.println(StaticInterface.cuble(6));

	}

}

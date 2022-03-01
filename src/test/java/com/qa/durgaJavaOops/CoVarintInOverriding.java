package com.qa.durgaJavaOops;

public class CoVarintInOverriding {
	public static void main(String[] args) {
		
	}

}

class P1
{
	public Object m1()
	{
		return null;
	}
}
class C1 extends P1
{
	public Integer m1()
	{
		return null;
	}
}

// We can run on different java version by using this : javac -source 1.4 CovarientExample.java
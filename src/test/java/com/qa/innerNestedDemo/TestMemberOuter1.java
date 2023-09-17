package com.qa.innerNestedDemo;

public class TestMemberOuter1 {
	
	private int data = 30;
	
	class Inner
	{
		void dataRead()
		{
			System.out.println("Value of Data is : "+data);
		}
	}

	public static void main(String[] args) {
		
		TestMemberOuter1 tmo = new TestMemberOuter1();
		TestMemberOuter1.Inner in =tmo.new Inner();
		
		in.dataRead();
		
		

	}

}

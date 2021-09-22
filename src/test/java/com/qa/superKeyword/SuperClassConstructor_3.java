package com.qa.superKeyword;

class X3
	{
		X3()
		{
			System.out.println("Parent class method of name show");
		}
	}
class Y3 extends X3
	{
		Y3()
		{
			super();
			System.out.println("Child class method of name show");
			
		}
	}

public class SuperClassConstructor_3 {

	public static void main(String[] args) {
		Y3 y=new Y3();
		
				

	}

}

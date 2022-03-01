package com.qa.superKeyword;

class X1
	{
		X1()
		{
			System.out.println("Patrent class method of name show!!");
		}
	}

class Y1 extends X1
	{
		Y1()
		{
			super();//For calling the super class constructor
			System.out.println("Child class method of name show!!");
			
		}
	}

public class SuperClassConstructor_2 {

	public static void main(String[] args) {
		Y1 d=new Y1();
	}

}

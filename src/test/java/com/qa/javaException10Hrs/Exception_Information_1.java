package com.qa.javaException10Hrs;

public class Exception_Information_1 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			
		}

	}

}

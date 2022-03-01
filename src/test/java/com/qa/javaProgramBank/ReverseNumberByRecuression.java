package com.qa.javaProgramBank;

public class ReverseNumberByRecuression {

	public static void main(String[] args) {
		revByRecursion(123);
		revByRecursion(123456);

	}
	
	public static void revByRecursion(int number)
	{
		if(number<10)
		{
			System.out.println(number);
			return;
		}
		else
		{
			System.out.print(number%10);
			revByRecursion(number/10);
		}
	}

}

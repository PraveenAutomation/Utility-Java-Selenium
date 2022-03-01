package com.qa.javaProgramBank;

public class ReverseNum {

	public static void main(String[] args) {
		int num=123;
		revNum(num);

	}

	private static void revNum(int num) {
		while(num>0)
		{
			int rev=num%10;
			System.out.print(rev);
			num=num/10;
		}
		
	}

}

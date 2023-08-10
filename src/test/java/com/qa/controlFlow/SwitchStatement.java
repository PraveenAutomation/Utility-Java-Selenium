package com.qa.controlFlow;

public class SwitchStatement {

	public static void main(String[] args) {
		
		int num=1;
		switch(num)
		{
		case 0:
			System.out.println("num is 0");
			break;
		case 1:
			System.out.println("Num is 1");
			break;
		default:
			System.out.println("Num is "+num);
		}

	}

}

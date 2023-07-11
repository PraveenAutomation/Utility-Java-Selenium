package com.dev.smallProject;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		operations();
		
		

	}
	
	public static void operations()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		//read double number:
		double first = sc.nextDouble();
		double second = sc.nextDouble();
		System.out.print("Enter an operator (+, -, *, /): ");
		System.out.print("Enter an operator (+, -, *, /): ");
		char operator = sc.next().charAt(0);
		double result;
		//switch case for each of the operations
		switch(operator)
		{
		case '+':
		result = first + second;
		break;
		case '-':
		result = first - second;
		break;
		case '*':
		result = first * second;
		break;
		case '/':
		result = first / second;
		break;
		// operator doesn't match any case constant (+, -, *, /)
		 
		 
		default:
		System.out.printf("Error! operator is not correct");
		return;
		}
		//printing the result of the operations
		System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
		
	}

}

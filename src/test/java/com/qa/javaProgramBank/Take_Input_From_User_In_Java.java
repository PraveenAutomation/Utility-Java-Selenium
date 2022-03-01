package com.qa.javaProgramBank;

import java.util.Scanner;

public class Take_Input_From_User_In_Java {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User name: ");
		String name=sc.nextLine();
		System.out.println("User name is : "+name);
	}

}

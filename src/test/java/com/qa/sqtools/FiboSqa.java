package com.qa.sqtools;

import java.util.Scanner;

public class FiboSqa {

	public static void main(String[] args) {
		fiboSeries();
	}
	
	public static void fiboSeries()
	{
		int x1=0,x2=1,x3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Num: ");
		int n=sc.nextInt();
		System.out.println("Fibonaccci series is below:");
		System.out.print(x1+" "+x2);
		for(int i=2;i<n;++i)
		{
			x3=x1+x2;
			System.out.print(" "+x3);
			x1=x2;
			x2=x3;
		}
		sc.close();
	}

}

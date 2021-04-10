package com.qa.javaRsa;

public class FibonaciSeriesLogic {

	public static void main(String[] args) {
		fiboSeries();
		int count =10;
		fiboUsingRecurrsion(count-2);
		
	}
	
	public static void fiboSeries()
	{
		int a=0;
		int b=1;
		int i=1;
		int sum=0;
		while(i<9)
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			i++;
		}
		
	}
	
	public static void fiboUsingRecurrsion(int count)
	{
		int x=0,y=1,z=0;
		if(count>0)
		{
			z=x+y;
			x=y;
			y=z;
			System.out.println(z);
			System.out.println(x+" "+y);
			fiboUsingRecurrsion(count-1);
			
		}
	}

}

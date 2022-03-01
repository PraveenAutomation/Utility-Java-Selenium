package com.qa.javaUtility;

public class StaticKeywordExaplme {
	
	int rollNo=0;
	String studentName="";
	static int seatNo=9;
	static StaticKeywordExaplme staticObject=new StaticKeywordExaplme();
	
	

	public static void main(String[] args) {
		System.out.println("Hello from main method!!!");
		StaticKeywordExaplme obj=new StaticKeywordExaplme();

	}
	
	static
	{
		int seatNo=1;
		System.out.println("Hello from static block!!!");
	}
	
	public void print(int i)
	{
		System.out.println("Roll No."+rollNo);
		System.out.println("Student Name "+studentName);
		System.out.println("Seat Number "+seatNo);
		
		rollNo=rollNo+1;
		studentName="John";
		seatNo=101;
		
		System.out.println("Roll No."+rollNo);
		System.out.println("Student Name "+studentName);
		System.out.println("Seat Number "+seatNo);
		
	}
	
	public static void staticPrint()
	{
		System.out.println("Roll No. "+StaticKeywordExaplme.staticObject.rollNo);
		//System.out.println("Student Name "+studentName);
		System.out.println("Seat Number "+seatNo);
	}

}

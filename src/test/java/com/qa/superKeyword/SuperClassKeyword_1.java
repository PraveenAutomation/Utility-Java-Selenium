package com.qa.superKeyword;

class X
{
	int val=9;
}

class Y extends X
{
	int val=89;
	void showSuper()
	{
		System.out.println("Child class variable: "+val);
		System.out.println("Super class variable thru super keyword: "+super.val);
	}
}

public class SuperClassKeyword_1 {

	public static void main(String[] args) {
		Y a = new Y();
		a.showSuper();
	}
}

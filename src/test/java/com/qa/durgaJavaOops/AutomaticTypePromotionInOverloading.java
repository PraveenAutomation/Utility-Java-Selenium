package com.qa.durgaJavaOops;

public class AutomaticTypePromotionInOverloading {

	public static void main(String[] args) {
		
		Byte b=5;
		
		AutomaticTypePromotionInOverloading t=new AutomaticTypePromotionInOverloading();
		t.m1();
		t.m1(10);
		t.m1(10.2f);
		t.m1('a');
		t.m1(b);
		t.m1(10l);
		//t.m1(10.5);

	}
	
	public void m1()
	{
		System.out.println("No args");
	}
	public void m1(int i)
	{
		System.out.println("int args");
	}
	public void m1(float f)
	{
		System.out.println("float args");
	}

}

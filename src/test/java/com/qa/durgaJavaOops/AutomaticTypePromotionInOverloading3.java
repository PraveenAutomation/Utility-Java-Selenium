package com.qa.durgaJavaOops;

public class AutomaticTypePromotionInOverloading3 {

	public static void main(String[] args) {
		
		AutomaticTypePromotionInOverloading3 t=new AutomaticTypePromotionInOverloading3();
		t.m1("VDS");
		t.m1(new StringBuffer());
		//t.m1(null);
	}
	
	public void m1(String s)
	{
		System.out.println("String version");
	}
	
	public void m1(StringBuffer sb)
	{
		System.out.println("StringBuffer Version");
	}

}

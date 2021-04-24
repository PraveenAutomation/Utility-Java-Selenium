package com.qa.durgaJavaOops;

public class OveridingConcept {
	public static void main(String[] args) {
		P p = new P();
		p.marry();
		
		C c=new C();
		c.marry();
		
		P p1 = new C();
		p1.marry();
		
	}
}

class P
{
	public void property()
	{
		System.out.println("Parent Propert: Cash+Gold+land");
	}
	public void marry()
	{
		System.out.println("Parent Marry: subhalaxmi/hirawati");
	}
}

class C extends P
{
	public void marry()
	{
		System.out.println("Child Marry: kattrina/nayantara");
	}
}


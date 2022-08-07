package com.qa.javaString5Hrs;

final class Own_ImmutableClass_2 {
	
	private int i;
	Own_ImmutableClass_2(int i)
	{
		this.i=i;
	}
	
	public Own_ImmutableClass_2 modify(int i)
	{
		if(this.i==i)
		{
			return this;
		}
		else
		{
			return new Own_ImmutableClass_2(i);
		}
	}

	public static void main(String[] args) {
		Own_ImmutableClass_2 r1=new Own_ImmutableClass_2(10);
		Own_ImmutableClass_2 r2=r1.modify(100);
		Own_ImmutableClass_2 r3=r1.modify(10);
		
		System.out.println(r1==r2);
		System.out.println(r1==r3);

	}

}

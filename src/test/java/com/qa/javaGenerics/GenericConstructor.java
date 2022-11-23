package com.qa.javaGenerics;

public class GenericConstructor {
	
	public GenericConstructor(int a)
	{
		System.out.println("Type Integer & Value is "+a);
	}
	
	public GenericConstructor(String name)
	{
		System.out.println("Type is String & name is "+name);
	}
	
	public <T> GenericConstructor(T val)
	{
		System.out.println("Generic Type & accept any kind of value "+val);
	}

}

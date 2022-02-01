package com.qa.javaString;

final class IC {
	final private int data;
	
	public IC(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}
	
	//Provide setter method to set data but
	//but return new object without touching the old object
	public IC setData(int data) {

		return new IC(data);
	}

}


public class TestImmutableClass {

	
	public static void main(String[] args) {		
				
		IC i1 = new IC(1000);
		IC i3 = i1.setData(1000);
		
		//if we change the value of object i1
		//address will be changed 
		IC i2 = i1.setData(5000);
		//i4 get different memory
		System.out.println(i1.getData());
		System.out.println(i2.getData());	
		System.out.println(i1==i2);
		System.out.println(i1==i3);
				
	}

}
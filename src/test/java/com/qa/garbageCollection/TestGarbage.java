package com.qa.garbageCollection;

public class TestGarbage {
	
	public void finalize()
	{
		System.out.println("Object is garbage collected");
	}

	public static void main(String[] args) {
		
		TestGarbage tg1=new TestGarbage();
		TestGarbage tg2=new TestGarbage();
		
		tg1=null;
		tg2=null;
		System.gc();
		
		
		

	}

}

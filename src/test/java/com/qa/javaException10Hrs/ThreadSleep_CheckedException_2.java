package com.qa.javaException10Hrs;

public class ThreadSleep_CheckedException_2 {

	public static void main(String[] args) {
		
		System.out.println("Very Happy.....");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

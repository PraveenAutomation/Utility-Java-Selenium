package com.qa.interfaceDemo;

interface Showable
{
	void show();
	interface Message
	{
		void msg();
	}
}

public class TestNestedInterface implements Showable.Message{
	
	public void show()
	{
		System.out.println("Showning");
	}
	
	public static void main(String[] args) {
		
		Showable.Message message = new TestNestedInterface();
		message.msg();
		

	}

	@Override
	public void msg() {
		System.out.println("Hello ....greet.....");
		
	}

}

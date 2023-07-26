package com.qa.encapsulationDemo;

import java.util.Properties;

public class Test3 {

	public static void main(String[] args) {
		
		Properties p = System.getProperties();
		p.setProperty("pirate", "scurvy");
		String s= p.getProperty("argProp")+" ";
		s+= p.getProperty("pirate");
		System.out.println(s);
		
		int x=5;
		int y=x++;
		int z=++y;
		System.out.println(z);

	}

}

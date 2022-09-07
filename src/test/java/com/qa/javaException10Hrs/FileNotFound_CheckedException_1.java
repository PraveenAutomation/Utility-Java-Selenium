package com.qa.javaException10Hrs;

import java.io.*;

public class FileNotFound_CheckedException_1 {
	public static void main(String... args) throws FileNotFoundException {
	
			PrintWriter pw = new PrintWriter("abc.txt");
     		pw.println("Hello");

	}
}
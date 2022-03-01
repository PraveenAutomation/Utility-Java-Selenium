package com.qa.assignment;

class Test4 {
	public void method1(int num1, float num2) {
		System.out.println("int-float method");
	}

	public void method1(float num1, int num2) {
		System.out.println("float-int method");
	}

	public static void main(String[] args) {
		Test4 t = new Test4();
		t.method1(40, 20.0f);
	}
}
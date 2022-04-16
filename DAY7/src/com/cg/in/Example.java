package com.cg.in;

public class Example {

	int a, b;

	public void setdata(int a, int b) {
		a = a;
		b = b;
	}

	public void showdata() {

		System.out.println("Value of a  " + a);
		System.out.println("value of b " + b);

	}

	public static void main(String[] args) {
		Example ex = new Example();
		ex.setdata(10, 20);
		ex.showdata();

	}

}

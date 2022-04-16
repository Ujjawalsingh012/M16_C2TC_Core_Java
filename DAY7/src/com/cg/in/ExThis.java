package com.cg.in;

public class ExThis {
	int a, b;

	public void setdata(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void showdata() {

		System.out.println("Value of a  " + a);
		System.out.println(" value of b " + b);

	}

	public static void main(String[] args) {

		ExThis ex = new ExThis();
		ex.setdata(10, 20);
		ex.showdata();

	}

}

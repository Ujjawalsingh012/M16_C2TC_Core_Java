package com.cg.in;

public class ExConstructor_This {
	int num;

	ExConstructor_This(int number) {
		this.num = number;
	}

	public static void main(String[] args) {
		ExConstructor_This in = new ExConstructor_This(820);
		System.out.println("the value " + in.num);

	}

}

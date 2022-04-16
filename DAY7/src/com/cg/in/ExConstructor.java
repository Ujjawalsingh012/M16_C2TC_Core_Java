package com.cg.in;

public class ExConstructor {
	int num;

	ExConstructor(int num) {
		num = num;
	}

	public static void main(String[] args) {
		ExConstructor in = new ExConstructor(720);
		System.out.println(in.num);

	}

}

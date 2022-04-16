package com.cg.in;

public class Exampl {

	int x;
	String mystr;
	static {
		String mystr = "helo";
		int x = 10;
	}

	public static void main(String[] args) {
		Exampl ex = new Exampl();

		System.out.println(ex.mystr);
		System.out.println(ex.x);

	}

}

package com.cg.in;

public class fibonacci {

	static void fib(int i) {
		if (i >= 1) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
			fib(i - 1);
		}
		
	}

	static int a = 0;
	static int b = 1;

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		 fibonacci fb = new fibonacci();
		 fb.fib(5);
		

	}

}

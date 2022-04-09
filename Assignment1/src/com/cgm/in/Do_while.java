package com.cgm.in;

public class Do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		do {
			if (i % 2 == 0) {
				System.out.println("Prime number");
			} else {
				System.out.println("not prime number");
			}
			i++;
		} while (i <= 10);

	}

}

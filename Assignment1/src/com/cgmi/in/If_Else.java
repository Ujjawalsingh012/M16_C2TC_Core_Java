package com.cgmi.in;

public class If_Else {

	public static void main(String[] args) {
		int a = 40;
		int b = 60;
		int c = 80;
		if (a <= b) {
			if (c == b) {
				System.out.println(" BOTH  ARE EQUAL C AND B");
			} else {
				System.out.println(" BOTH ARE NOT EQUAL C AND B");
			}
		} else if (b < c) {
			if (a > b) {
				System.out.println(" A is greater than b");
			} else {
				System.out.println(" b  is greater than  a");
			}
		} else {
			System.out.println(" faild ");
		}

	}

}

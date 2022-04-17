package com.cg.in;

public class Sum_OF_Digits {

	private static int sumOfDigits(int num) {

		if (num == 0) {
			return 0;
		}

		return num % 10 + sumOfDigits(num / 10);
	}

	public static void main(String[] args) {

		int result = sumOfDigits(1234);

		System.out.println(result);
	}

}

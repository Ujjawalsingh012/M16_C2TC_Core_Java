package com.cg.in;

public class Assignment {

	public static void main(String[] args) {
		// = += -= *= /= %= &= ^= |= <<= >>= >>>=
		int a=1;
		int b=2;
		int c =a;   // =
		System.out.println("= :" + c);
		
		a +=100;
		System.out.println("+= : " + a);
		b *=20;
		System.out.println("*= :"+b);
		
		a &=45;
		System.out.println("& : "+ a);
		
		b ^=10;
		System.out.println("^  : "+ b);

	}

}

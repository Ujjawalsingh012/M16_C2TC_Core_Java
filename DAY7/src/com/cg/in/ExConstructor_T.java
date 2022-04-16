package com.cg.in;

public class ExConstructor_T {
	int a;
	ExConstructor_T()
	{
		this(10);
		System.out.println("default constructor " + a);
		
	}
	public ExConstructor_T(int i) {
		this.a=i;
		System.out.println("inside constructor paremeter" + a);
		
	}
	public static void main(String[] args) {
     	ExConstructor_T in = new	ExConstructor_T();
		
	}

}

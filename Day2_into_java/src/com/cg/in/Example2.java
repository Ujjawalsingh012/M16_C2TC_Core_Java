package com.cg.in;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		float a=10.2f;
		System.out.println("float input  : " + a);
		
		// User input 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input : ");
		float x=sc.nextFloat();
		System.out.println("User input   : " + x);

	}

}

package com.cg.in;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		// Compile time input
		int a=10;
		System.out.println("integer input  : " + a);
		
		// User input 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		int x=sc.nextInt();
		System.out.println("User input " + x);
		
				

	}

}

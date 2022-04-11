package com.cg.in;

import java.util.Scanner;

public class Example3 {
	
	
	Example3(int age , String s)
	{
		System.out.println("your age " + age);
		System.out.println(" your name is " + s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR AGE");
		int ag=sc.nextInt();
		System.out.println("ENTER YOUR NAME");
		 String ss=sc.next();
		  Example3 s = new Example3(ag ,ss );

	}

}

package com.cgm.in;

public class Do_while_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fac=1;
		int i=1;
		int n=5;
		do {
			fac *=i;
			i++;
		}while(i<=n);
		System.out.println("factorial : " + fac);
		
		
	}

}

package com.cg.in;

public class Example2 {
	
	int rollno;
	String name;
	Example2(int r , String n) {
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println("your name is  " + name + " and roll number " + rollno);
	}

	public static void main(String[] args) { 
		Example2 ex = new	Example2(452,"rahthor");
		Example2 ex1 = new	Example2(120 , "singh");
		ex.display();
		ex1.display();


	}

}

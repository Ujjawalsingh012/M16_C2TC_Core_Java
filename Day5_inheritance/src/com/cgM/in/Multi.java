package com.cgM.in;

class Emp
{
	void display()
	{
		System.out.println("emp");
	}
}
class student extends Emp
{
	void print()
	{
		System.out.println("Student");
	}
}
class boy extends student
{
	void x()
	{
		System.out.println("boy");
	}
}

public class Multi {
	public static void main(String[] args) {
      boy B = new boy();
      B.display();
      B.print();
	}

}

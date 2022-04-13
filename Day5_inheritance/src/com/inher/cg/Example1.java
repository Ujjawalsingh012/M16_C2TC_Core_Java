package com.inher.cg;

class parent{
	public void print()
	{
		System.out.println("print");
	}
}

public class Example1  extends parent{
	public static void main(String[] args) {
		Example1  ex=new	Example1 ();
		ex.print();
	}

}

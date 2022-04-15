package com.cg.in;
abstract class A{
	
	void display()
	{ 
		System.out.println("hello");
	}
	
}
class B  extends A
{
	void run()
	{
		System.out.println(" run");
	}

	
}


public class Abstract {
	public static void main(String[] args) {
		B b=new B();
		b.display();
		b.run();
	}
	

}
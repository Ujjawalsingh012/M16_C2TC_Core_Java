package com.cg.in;
class parents{
	 final void t()
	{
		System.out.println(" final method ");
	}
}

class child extends parents{
	void time()
	{
		System.out.println(" time");
	}
	//void t()  // cannot override final class
	{
		System.out.println(" override");
	}
}

public class OVerFinal {
	public static void main(String[] args) {
	child ch = new  child();
	ch.t();
	}

}

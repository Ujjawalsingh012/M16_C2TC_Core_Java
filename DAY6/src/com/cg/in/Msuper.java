package com.cg.in;

class C {
	void run() {
		System.out.println(" run = parents ");
	}
}

class V extends C {
	void run() {
		System.out.println(" run = child");

	}

	void display() {
		run();
		super.run();
	}
}

public class Msuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		b.display();
	}

}


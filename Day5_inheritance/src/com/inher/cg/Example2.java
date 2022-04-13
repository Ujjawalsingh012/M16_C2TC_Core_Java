package com.inher.cg;

class samsung {
	void accept() {
		System.out.println("Vivo");
	}
}

class vivo extends samsung {
	void display() {
		System.out.println(" samsung");
	}

}

class vivov1 extends vivo {
	public void print() {
		System.out.println(" samsung");
	}
}

public class Example2 {

	public static void main(String[] args) {
		vivov1 v = new vivov1();
		v.accept();
		v.display();
		v.print();
	}

}

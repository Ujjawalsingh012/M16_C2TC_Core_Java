package com.cg.in;
class Animal{
	String color ="red";
}

class Dog extends Animal
{
	String color=" white";
	void printcolor()
	{
		System.out.println( " Dog color " + color);
		System.out.println(" Animal color "+ super.color);
	}
}
public class Super {
	public static void main(String[] args) {
		Dog dog = new 	Dog ();
		dog.printcolor();
	}
}


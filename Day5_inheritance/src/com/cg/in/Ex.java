package com.cg.in;

class vehicle
{
	void display()
	{
		System.out.println("Vehicle");
	}
}

class Car extends vehicle
{
	 void display2()
	 {
		 System.out.println("Car - Vehicle");
	 }
}
class Bike extends vehicle
{
	void print()
	{
		System.out.println("Bike- vehicle");
	}
}

public class Ex {
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.display();
		bike.print();
	     Car car = new Car();
	     car.display2();
	}

}

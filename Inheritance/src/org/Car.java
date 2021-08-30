package org;

public class Car extends Vehicle {
	int CC;
	int gear;

	// This is subclass which extends for vehicle
	void attriburesCar() {

		// The subclass refers to the members of the superclass
		System.out.println("The Color OF car : " + color);
		System.out.println("The Speed OF car : " + speed);
		System.out.println("The Size OF car : " + size);
		System.out.println("The CC OF car : " + color);
		System.out.println("The Number OF gears OF car : " + gear);
	}




	public static void main(String[] args) {
		Car b1 = new Car();
		b1.color = "Blue";
		b1.speed = 200;
		b1.size = 22;
		b1.CC = 1000;
		b1.gear = 5;
		b1.attriburesCar();

	}

}

package org2;

public class Car {

	String make;
	String model;
	int yearMade;

	public Car(String make, String model, int yearMade) {
		this.make = make;
		this.model = model;
		this.yearMade = yearMade;
	}

	public String toString() {
		return "The make " + " -" + make + " -" + "The model is " + model + " -" + "The year made is " + yearMade;

	}

}

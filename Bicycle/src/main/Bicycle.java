package main;

public class Bicycle {

	protected int gear;
	protected int speed;
	
	
//create constructor 
	public Bicycle(int startGear,int startSpeed ) {
		gear = startGear;
		speed = startSpeed;
	}

	//create first method
	public void setGear(int newValue) {
		gear = newValue;
	}
	//create second method
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	//create third method
	public void speedUp(int increment) {
		speed +=increment;
	}

}

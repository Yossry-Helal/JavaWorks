package main;

public class MountainBike extends Bicycle {

//new method will be added to the Bicycle class methods
	public int seatHeight;

// create the new constructor including the seatHeight new method
	public MountainBike( int startGear,int startSpeed, int seatHeight) {
		super(startGear,startSpeed);
		this.seatHeight = seatHeight;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setHeight(int newValue) {

	}

}

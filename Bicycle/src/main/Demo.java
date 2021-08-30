package main;

public class Demo {

	public static void main(String[] args) {
		MountainBike mountainBike= new MountainBike(20,10,1);
		System.out.println("Gears is :"+ mountainBike.gear);
		System.out.println("Seat Height is : "+ mountainBike.seatHeight);
		System.out.println("Bike speed is :" + mountainBike.speed);
		
		
		mountainBike.applyBrake(12);
		System.out.println("Bike speed after applying breaks is :"+ mountainBike.speed);;
		
	}

}

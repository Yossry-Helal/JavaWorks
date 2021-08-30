package org;

public class test {
	Day day;

	public test(Day day) {
		this.day = day;

	}

	public void tellItLikeItIs() {
		switch (day) {
		case Monday:
			System.out.println("Mondays are bad.");
			break;

		case Friday:
			System.out.println("Fridays are better .");
			break;
		case Saturday:case Sunday: 
			System.out.println("Weekends are the best");
			break;
			
			default:
				System.out.println("Midweek days are So-So");
				break;

		}
	}

	public static void main(String[] args) {
		test firstDay= new test(Day.Monday);
		firstDay.tellItLikeItIs();
		
		test thirdDay= new test(Day.Wednesday);
		thirdDay.tellItLikeItIs();
		
		test fifthDay=new test(Day.Friday);
		fifthDay.tellItLikeItIs();
		
		test sixthDay= new test(Day.Saturday);
		sixthDay.tellItLikeItIs();
		
		test seventhDay= new test(Day.Sunday);
		seventhDay.tellItLikeItIs();

	}

}

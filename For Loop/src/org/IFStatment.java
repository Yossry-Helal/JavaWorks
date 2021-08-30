package org;

public class IFStatment {

	public static void main(String[] args) {
		int testScore = 80;
		char grade;

		if (testScore >= 90) {
			grade = 'A';

		} else if (testScore >= 80) {
			grade = 'B';

		} else if (testScore >= 70) {
			grade = 'C';
		} else if (testScore >= 60) {
			grade = 'D';

		} else {
			grade = 'F';
		}
		System.out.println("Grade = "+grade);
	}

}

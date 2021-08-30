package org;

public class Students5 {
	int rollno;
	String name;
	static String college = "UOP";

	public Students5(int rollno, String name) {

		this.rollno = rollno;
		this.name = name;
	}

	void display() {
		System.out.println("rollno" + " " + name + " " + college);
	}

	public static void main(String[] args) {
		Students5 st1 = new Students5(111, "Yossry");
		Students5 st2 = new Students5(222, "Karim");

		st1.display();
		st2.display();

	}

}

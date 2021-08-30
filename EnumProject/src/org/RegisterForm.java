package org;

enum Gender {
	male, Female
};

enum Course {
	Database, Programing, Math, ERP
};

enum Semester {
	Summer, Winter, Fall, Spring
};

public class RegisterForm {
	String stdname;
	Gender stdgender;
	Course crs;
	Semester sem;

	public RegisterForm() {
		stdname = "No Name";
		stdgender = Gender.male;
		crs = Course.Math;
		sem = Semester.Spring;
	}
}
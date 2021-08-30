package org;

public class MyTostring {

	int rollno;
	String name;
	String city;

	MyTostring(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	public String toString() {
		return rollno + "" + name + "" + city;

	}

	public static void main(String[] args) {
		MyTostring str1 = new MyTostring(1234, " Yossry", " Cairo");
		MyTostring str2 = new MyTostring(5436, " Karim", " Alex");
		System.out.println(str1);
		System.out.println(str2);
	}

}

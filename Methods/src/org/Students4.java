package org;

public class Students4 {
	int id;
	String name;

	public Students4(int i, String n) {
		super();
		this.id = i;
		this.name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {

		Students4 s1 = new Students4(111, "Waleed");
		Students4 s2 = new Students4(222, "Yossry");

		s1.display();
		s2.display();

	}

}

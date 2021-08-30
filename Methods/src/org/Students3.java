package org;

class Students3 {
	int id;
	String name;

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		Students3 s1 = new Students3();
		Students3 s2 = new Students3();
		
		
		s1.display();
		s2.display();

	}
}
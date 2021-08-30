package org;

public class HogwartsSchool {

	public static void main(String[] args) {

		Student s1 = new Student("Yossry", 40, 2341);
		Student s2 = new Student("Karim", 7, 2671);
		Student s3 = new Student("Sandy", 2, 2331);
		
		
		
		System.out.println("Name : " + s1.getName()+" \nAge " + s1.getAge()+ "\nId Number is " + s1.getId());
		System.out.println("Name : " + s2.getName()+" \nAge " + s2.getAge()+ "\nId Number is " + s2.getId());
		System.out.println("Name : " + s3.getName()+" \nAge " + s3.getAge()+ "\nId Number is " + s3.getId());

	}

}

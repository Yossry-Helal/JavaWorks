package org;

public class Main {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.setID(15426);
		emp1.setName("Yossry Helal");
		emp1.setSalary(2500);
		
		System.out.println("Employee ID is : " + emp1.getID());
		System.out.println("Employee Name is : " + emp1.getName());
		System.out.println("Employee salary is : " + emp1.getSalary());
	}

}


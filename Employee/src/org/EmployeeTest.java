package org;

public class EmployeeTest {

	public static void main(String[] args) {

		SalaryEmployee sEmp1 = new SalaryEmployee();
		sEmp1.setEmpID(123);
		sEmp1.setEmpName("Yossry Helal");
		sEmp1.display();

		HourlyEmployee hrEmp1 = new HourlyEmployee();
		hrEmp1.setEmpName("Karim");
		hrEmp1.setEmpID(456);
		hrEmp1.display();

		System.out.println("The Hourly Employee info is : " + hrEmp1.getEmpName() + " And his Employee ID is "
				+ hrEmp1.getEmpID() + " And his Salary is " + hrEmp1.display());
		System.out.println("The Salary Emploee info is :  " + sEmp1.getEmpName() + " And his Employee id is "
				+ sEmp1.getEmpID() + " And his Salary is " + sEmp1.display());

	}

}

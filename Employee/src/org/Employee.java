package org;

public abstract class Employee {

		
		private String empName;
		private int empID;
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public int getEmpID() {
			return empID;
		}
		public void setEmpID(int empID) {
			this.empID = empID;
		}
		
		
		public abstract double display();

	

}

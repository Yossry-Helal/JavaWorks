package org;

public class HourlyEmployee extends Employee {

	private double hourlyRate;
	private double hoursWorked;

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		hourlyRate = 30.5;
	}

	public double getHoursWorked() {
		hoursWorked = 30.5;
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double display() {
		return hoursWorked * hourlyRate;

	}

}

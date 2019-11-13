package com.training.managerexecutiveemployee;

public class MarketingExecutive extends Employee {
	
	/**
	 * Attributes of marketing executive object
	 */
	private int kilometersTravelled;
	private static final int telephoneAllowance = 1500;
	private double tourAllowance;

	/**
	 * No argument constructor
	 */
	public MarketingExecutive() {
	}

	/**
	 * Parameterized constructor
	 */
	public MarketingExecutive(String employeeName, int employeeId, double employeeBasicSalary, int kilometersTravelled) {
		super(employeeName, employeeId, employeeBasicSalary);
		this.kilometersTravelled = kilometersTravelled;
		this.tourAllowance = 5 * kilometersTravelled;
	}

	/**
	 * toString() method to return details of marketing executive object
	 */
	@Override
	public String toString() {
		return super.toString() + ", KilometersTravelled - " + kilometersTravelled + ", Tour Allowance - "
				+ tourAllowance + ", Telephone Allowance - " + telephoneAllowance;
	}
}

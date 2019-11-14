package com.training.managerexecutiveemployee;

public class MarketingExecutive extends Employee {

	/**
	 * Attributes of marketing executive object
	 */
	private int kilometersTravelled;
	private static final int telephoneAllowance = 1500;
	private double tourAllowance;
	private double employeeGrossSalary;
	private double employeeNetSalary;
	private static final int pt = 200;

	/**
	 * No argument constructor
	 */
	public MarketingExecutive() {
	}

	/**
	 * Parameterized constructor
	 */
	public MarketingExecutive(String employeeName, int employeeId, double employeeBasicSalary, double medical,
			int kilometersTravelled) {
		super(employeeName, employeeId, employeeBasicSalary, medical);
		this.kilometersTravelled = kilometersTravelled;
		this.tourAllowance = 5 * kilometersTravelled;
	}

	/**
	 * toString() method to return details of marketing executive object
	 */
	@Override
	public String toString() {
		return super.toString() + ", Employee Net Salary - " + calculateNetSalary() + ", Employee Gross Salary - "
				+ calculateGrossSalary() + ", KilometersTravelled - " + kilometersTravelled + ", Tour Allowance - "
				+ tourAllowance + ", Telephone Allowance - " + telephoneAllowance;
	}

	@Override
	public double calculateGrossSalary() {
		this.employeeGrossSalary = 1.5 * super.getEmployeeBasicSalary();
		return employeeGrossSalary;
	}

	@Override
	public double calculateNetSalary() {
		calculateGrossSalary();
		this.employeeNetSalary = employeeGrossSalary - (0.12 * super.getEmployeeBasicSalary() + pt);
		return employeeNetSalary;
	}
}

package com.training.managerexecutiveemployee;

public class Manager extends Employee {

	/**
	 * Attributes of a manager object
	 */
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowances;
	private double employeeGrossSalary;
	private double employeeNetSalary;
	private static final int pt = 200;

	/**
	 * No argument constructor
	 */
	public Manager() {
	}

	/**
	 * Parameterized constructor
	 */
	public Manager(String employeeName, int employeeId, double employeeBasicSalary, double medical) {
		super(employeeName, employeeId, employeeBasicSalary, medical);
		this.petrolAllowance = 0.08 * employeeBasicSalary;
		this.foodAllowance = 0.13 * employeeBasicSalary;
		this.otherAllowances = 0.03 * employeeBasicSalary;
	}

	/**
	 * toString() method to return details of the manager object
	 */
	@Override
	public String toString() {
		return super.toString() + ", Employee Net Salary - " + calculateNetSalary() + ", Employee Gross Salary - "
				+ calculateGrossSalary() + ", PetrolAllowance - " + petrolAllowance + ", FoodAllowance - "
				+ foodAllowance + ", OtherAllowances - " + otherAllowances;
	}

	/**
	 * Overridden method to implement calculateGrossSalary() Employee class
	 */
	@Override
	public double calculateGrossSalary() {
		employeeGrossSalary = 1.5 * super.getEmployeeBasicSalary();
		return employeeGrossSalary;
	}

	/**
	 * Overridden method to implement calculateNetSalary() Employee class
	 */
	@Override
	public double calculateNetSalary() {
		calculateGrossSalary();
		employeeNetSalary = employeeGrossSalary - 0.12 * super.getEmployeeBasicSalary() - pt;
		return employeeNetSalary;
	}

}

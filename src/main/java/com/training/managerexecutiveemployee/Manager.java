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
	
	/**
	 * No argument constructor
	 */
	public Manager() {
	}

	/**
	 * Parameterized constructor
	 */
	public Manager(String employeeName, int employeeId, double employeeBasicSalary) {
		super(employeeName, employeeId, employeeBasicSalary);
		this.petrolAllowance = 0.08*employeeBasicSalary;
		this.foodAllowance = 0.13*employeeBasicSalary;
		this.otherAllowances = 0.03*employeeBasicSalary;
		this.employeeGrossSalary = 1.5*employeeBasicSalary;
		this.employeeNetSalary = employeeGrossSalary - 0.12*employeeBasicSalary-200;
	}

	/**
	 * toString() method to return details of the manager object
	 */
	@Override
	public String toString() {
		return super.toString() + ", Employee Net Salary - " + employeeNetSalary + ", Employee Gross Salary - " + 
		employeeGrossSalary + ", PetrolAllowance - " + petrolAllowance + ", FoodAllowance - " + foodAllowance +
		", OtherAllowances - " + otherAllowances;
	}
}

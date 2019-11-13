package com.training.managerexecutiveemployee;

public abstract class Employee {

	/**
	 * Attributes of an employee object
	 */
	private String employeeName;
	private int employeeId;
	private double employeeBasicSalary;
	
	/**
	 * No Argument constructor
	 */
	public Employee() {
	}

	/**
	 * Parameterized constructor
	 */
	public Employee(String employeeName, int employeeId, double employeeBasicSalary) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeBasicSalary = employeeBasicSalary;
	}

	/**
	 * Mutators and Accessors for the attributes of the Employee object
	 * @return
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getEmployeeBasicSalary() {
		return employeeBasicSalary;
	}

	public void setEmployeeBasicSalary(double employeeBasicSalary) {
		this.employeeBasicSalary = employeeBasicSalary;
	}

	/**
	 * toString() method that returns the details of an employee object
	 */
	@Override
	public String toString() {
		return "Employee Name - " + employeeName + ", Employee ID - " + employeeId + ", Employee Basic Salary - "
				+ employeeBasicSalary;
	}
}

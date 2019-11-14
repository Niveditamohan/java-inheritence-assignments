package com.training.managerexecutiveemployee;

public abstract class Employee {

	/**
	 * Attributes of an employee object
	 */
	private String employeeName;
	private int employeeId;
	private double employeeBasicSalary;
	private double medical;
	
	/**
	 * No Argument constructor
	 */
	public Employee() {
	}

	/**
	 * Parameterized constructor
	 */
	public Employee(String employeeName, int employeeId, double employeeBasicSalary, double medical) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeBasicSalary = employeeBasicSalary;
		this.medical = medical;
	}

	/**
	 * Mutators and Accessors for the attributes of the Employee object
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

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	/**
	 * toString() method that returns the details of an employee object
	 */
	@Override
	public String toString() {
		return "Employee Name - " + employeeName + ", Employee ID - " + employeeId + ", Employee Basic Salary - "
				+ employeeBasicSalary;
	}
	
	public abstract double calculateGrossSalary();
	public abstract double calculateNetSalary();
}

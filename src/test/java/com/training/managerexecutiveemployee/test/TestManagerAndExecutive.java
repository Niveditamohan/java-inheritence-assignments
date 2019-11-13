package com.training.managerexecutiveemployee.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.managerexecutiveemployee.Employee;
import com.training.managerexecutiveemployee.Manager;
import com.training.managerexecutiveemployee.MarketingExecutive;

public class TestManagerAndExecutive {

	private Employee employee;
	private Employee employee1;
	
	/**
	 * Method that executes before every test case
	 */
	@Before
	public void setUp() {
		employee = new Manager("Nivedita", 101, 380000);
		employee1 = new MarketingExecutive("Nivedita", 101, 380000, 50);
	}
	
	/**
	 * Method to check for Manager class
	 */
	@Test
	public void showDetailsManager() {
		assertEquals("Employee Name - Nivedita, Employee ID - 101, Employee Basic Salary - 380000.0, "
				+ "Employee Net Salary - 524200.0, Employee Gross Salary - 570000.0, PetrolAllowance -"
				+ " 30400.0, FoodAllowance - 49400.0, OtherAllowances - 11400.0", employee.toString());
	}
	
	/**
	 * Method to check for Executive class
	 */
	@Test
	public void showDetailsExecutive() {
		assertEquals("Employee Name - Nivedita, Employee ID - 101, Employee Basic Salary - 380000.0,"
				+ " KilometersTravelled - 50, Tour Allowance - 250.0, Telephone Allowance - 1500", 
				employee1.toString());
	}
	
	/**
	 * Method that executes after every class
	 */
	@After
	public void tearDown() {
		employee = null;
		employee1 = null;
	}
}

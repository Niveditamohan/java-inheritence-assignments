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
	 * Method that executes before every test case, creates a new object and also initialises its properties 
	 */
	@Before
	public void setUp() {
		employee = new Manager("Nivedita", 101, 380000, 3000);
		employee1 = new MarketingExecutive("Riya", 102, 500000, 50, 5000);
	}

	/**
	 * Method to check for Manager class
	 */
	@Test
	public void testshowDetailsManager() {
		assertEquals("Employee Name - Nivedita, Employee ID - 101, Employee Basic Salary - 380000.0, "
				+ "Employee Net Salary - 524200.0, Employee Gross Salary - 570000.0, PetrolAllowance - 30400.0, "
				+ "FoodAllowance - 49400.0, OtherAllowances - 11400.0", employee.toString());
	}

	/**
	 * Method to check for Marketing Executive class
	 */
	@Test
	public void testshowDetailsMarketingExecutive() {
		assertEquals("Employee Name - Riya, Employee ID - 102, Employee Basic Salary - 500000.0,"
				+ " Employee Net Salary - 689800.0, Employee Gross Salary - 750000.0, KilometersTravelled - 5000,"
				+ " Tour Allowance - 25000.0, Telephone Allowance - 1500", employee1.toString());
	}

	/**
	 * Method to check calculateGrossSalary() of Manager class
	 */
	@Test
	public void testcalculateGrossSalaryManager() {
		assertEquals(570000, employee.calculateGrossSalary(), 0.03);
	}

	/**
	 * Method to check calculateNetSalary() of Manager class
	 */
	@Test
	public void testcalculateNetSalaryManager() {
		assertEquals(524200, employee.calculateNetSalary(), 0.03);
	}

	/**
	 * Method to check calculateGrossSalary() of MarketingExecutive class
	 */
	@Test
	public void testcalculateGrossSalaryMarketingExecutive() {
		assertEquals(750000, employee1.calculateGrossSalary(), 0.03);
	}

	/**
	 * Method to check calculateNetSalary() of MarketingExecutive class
	 */
	@Test
	public void testcalculateNetSalaryMarketingExecutive() {
		assertEquals(689800, employee1.calculateNetSalary(), 0.03);
	}
	
	/**
	 * Method that executes after every class and refreshes the value of object
	 */
	@After
	public void tearDown() {
		employee = null;
		employee1 = null;
	}
}

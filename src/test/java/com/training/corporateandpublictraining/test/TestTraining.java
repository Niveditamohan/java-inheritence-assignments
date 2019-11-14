package com.training.corporateandpublictraining.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.corporateandpublictraining.CorporateTraining;
import com.training.corporateandpublictraining.PublicTraining;
import com.training.corporateandpublictraining.Training;

public class TestTraining {

	private Training training;
	private Training training1;
	
	/**
	 * Executes before every test case; creates new object and initializes its properties
	 */
	@Before
	public void setUp() {
		training = new CorporateTraining("Big Data", 101, 35000, 4);
		training1 = new PublicTraining("Java", 102, 5000, 50);
	}
	
	/**
	 * Method to test getOrderValue() method of CorporateTraining class
	 */
	@Test
	public void testCorporateTraining() {
		assertEquals(140000, training.getOrderValue(), 0.03);
	}
	
	/**
	 *  Method to test getOrderValue() method of PublicTraining class
	 */
	@Test
	public void testPublicTraining() {
		assertEquals(250000, training1.getOrderValue(), 0.03);
	}
	
	/**
	 * Method that executes after every test case; refreshes the object
	 */
	@After
	public void tearDown() {
		training = null;
		training1 = null;
	}
}

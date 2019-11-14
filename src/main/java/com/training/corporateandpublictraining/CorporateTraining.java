package com.training.corporateandpublictraining;

public class CorporateTraining extends Training {
	
	private int days;
	
	/**
	 * Default constructor
	 */
	public CorporateTraining() {
	}
	
	/**
	 * Parameterized constructor
	 * Passes subject, id and fees to super class Training
	 * @param subject
	 * @param id
	 * @param fees
	 * @param days
	 */
	public CorporateTraining(String subject, int id, double fees, int days) {
		super(subject, id, fees);
		this.days = days;
	}

	/**
	 * Getters and setters for all the fields
	 */
	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	/**
	 * Method that overrides the getOrderValue() of abstract super class Training 
	 * So it provides implementation 
	 */
	@Override
	public double getOrderValue() {
		return super.getFees()*days;
	}

}

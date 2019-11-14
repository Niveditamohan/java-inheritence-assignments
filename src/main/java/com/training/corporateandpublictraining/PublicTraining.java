package com.training.corporateandpublictraining;

public class PublicTraining extends Training {

	private int noOfParticipants;
	
	/**
	 * Default constructor
	 */
	public PublicTraining() {
	}

	/**
	 * Parameterized constructor
	 * Passes subject, id and fees to super class Training
	 * @param subject
	 * @param id
	 * @param fees
	 * @param noOfParticipants
	 */
	public PublicTraining(String subject, int id, double fees, int noOfParticipants) {
		super(subject, id, fees);
		this.noOfParticipants = noOfParticipants;
	}

	/**
	 * Getters and setters for all the fields
	 */
	public int getNoOfParticipants() {
		return noOfParticipants;
	}

	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}

	/**
	 * Method that overrides the getOrderValue() of abstract super class Training 
	 * So it provides implementation 
	 */
	@Override
	public double getOrderValue() {
		return noOfParticipants*super.getFees();
	}
}

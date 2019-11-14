package com.training.corporateandpublictraining;

public abstract class Training {

	private String subject;
	private int id;
	private double fees;
	
	/**
	 * Default constructor
	 */
	public Training() {
	}

	/**
	 * Parameterized constructor
	 * @param subject
	 * @param id
	 * @param fees
	 */
	public Training(String subject, int id, double fees) {
		super();
		this.subject = subject;
		this.id = id;
		this.fees = fees;
	}

	/**
	 * Getters and setters for all the fields
	 */
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
	
	/**
	 * Abstract method to calculate fees
	 * REASON: To allow child classes to add their own implementation
	 */
	public abstract double getOrderValue();
}

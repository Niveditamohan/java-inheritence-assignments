package com.training.date.exception;

public class InvalidYearException extends Exception {

	/**
	 * Default constructor
	 */
	public InvalidYearException() {
	}
	
	/**Parameterized constructor
	 * Passes message to super class Exception
	 * @param message
	 */
	public InvalidYearException(String message) {
		super(message);
	}
}

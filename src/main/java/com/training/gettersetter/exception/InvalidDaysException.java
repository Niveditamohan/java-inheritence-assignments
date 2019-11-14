package com.training.gettersetter.exception;

public class InvalidDaysException extends Exception {

	/**
	 * No argument constructor
	 */
	public InvalidDaysException() {
	}
	
	/**Default constructor
	 * Passes message to super class Exception
	 * @param message
	 */
	public InvalidDaysException(String message) {
		super(message);
	}
}

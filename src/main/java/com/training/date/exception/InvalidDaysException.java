package com.training.date.exception;

public class InvalidDaysException extends Exception {

	/**
	 * No argument constructor
	 */
	public InvalidDaysException() {
	}
	
	/**Parameterized constructor
	 * Passes message to super class Exception
	 * @param message
	 */
	public InvalidDaysException(String message) {
		super(message);
	}
}

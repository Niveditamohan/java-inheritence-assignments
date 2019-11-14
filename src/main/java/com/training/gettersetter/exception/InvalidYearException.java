package com.training.gettersetter.exception;

public class InvalidYearException extends Exception {

	public InvalidYearException() {
	}
	
	/**Default constructor
	 * Passes message to super class Exception
	 * @param message
	 */
	public InvalidYearException(String message) {
		super(message);
	}
}

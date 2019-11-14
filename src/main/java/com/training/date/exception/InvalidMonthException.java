package com.training.date.exception;

public class InvalidMonthException extends Exception {

	/**
	 * Default constructor
	 */
	public InvalidMonthException() {
	}
	
	/**Parameterized constructor
	 * Passes message to super class Exception
	 * @param message
	 */
	public InvalidMonthException(String message) {
		super(message);
	}
}

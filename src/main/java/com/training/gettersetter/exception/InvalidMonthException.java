package com.training.gettersetter.exception;

public class InvalidMonthException extends Exception {

	public InvalidMonthException() {
	}
	
	/**Default constructor
	 * Passes message to super class Exception
	 * @param message
	 */
	public InvalidMonthException(String message) {
		super(message);
	}
}

package com.training.date.test;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.date.FormatDate;
import com.training.date.exception.InvalidDaysException;
import com.training.date.exception.InvalidMonthException;
import com.training.date.exception.InvalidYearException;

public class TestMutatorAndAccsessorForDate {

	private FormatDate date;
	private SimpleDateFormat sdf;

	/**
	 * Executes before every test case; creates new object and initializes its
	 * properties
	 */
	@Before
	public void setUp() {
		date = new FormatDate();
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	/**
	 * Method that tests the date parsing functionality of returnDate() method in
	 * FormatDate class
	 * 
	 * @throws ParseException
	 * @throws InvalidYearException
	 * @throws InvalidMonthException
	 * @throws InvalidDaysException
	 */
	@Test
	public void testFormatDateForCorrectInput()
			throws ParseException, InvalidDaysException, InvalidMonthException, InvalidYearException {
		date.setDays(13);
		date.setMonths(11);
		date.setYear(2019);

		Date expected = sdf.parse("13-11-2019");
		assertEquals(expected, date.returnDate());
	}

	/**
	 * Method to test the date parsing functionality of returnDate() method in
	 * FormatDate class when invalid year is entered but other inputs are accurate
	 * 
	 * @throws ParseException
	 * @throws InvalidDaysException
	 * @throws InvalidMonthException
	 * @throws InvalidYearException
	 */
	@Test(expected = InvalidYearException.class)
	public void testFormatDateForInvalidYearButCorrectDayAndMonth()
			throws ParseException, InvalidDaysException, InvalidMonthException, InvalidYearException {
		date.setDays(13);
		date.setMonths(11);
		date.setYear(0);

		date.returnDate();
	}
	
	/**
	 * Method to test the date parsing functionality of returnDate() method in
	 * FormatDate class when invalid days entered but other inputs are accurate
	 * 
	 * @throws ParseException
	 * @throws InvalidDaysException
	 * @throws InvalidMonthException
	 * @throws InvalidYearException
	 */
	@Test(expected = InvalidDaysException.class)
	public void testFormatDateForInvalidDaysButCorrectMonthAndYear()
			throws ParseException, InvalidDaysException, InvalidMonthException, InvalidYearException {
		date.setDays(30);
		date.setMonths(2);
		date.setYear(2019);

		date.returnDate();
	}
	
	/**
	 * Method to test the date parsing functionality of returnDate() method in
	 * FormatDate class when invalid month is entered but other inputs are accurate
	 * 
	 * @throws ParseException
	 * @throws InvalidDaysException
	 * @throws InvalidMonthException
	 * @throws InvalidYearException
	 */
	@Test(expected = InvalidMonthException.class)
	public void testFormatDateForInvalidMonthButCorrectDaysAndYear()
			throws ParseException, InvalidDaysException, InvalidMonthException, InvalidYearException {
		date.setDays(13);
		date.setMonths(13);
		date.setYear(2016);

		date.returnDate();
	}
	
	/**
	 * Executes after every test case and refreshes the object
	 */
	@After
	public void tearDown() {
		date = null;
	}
}

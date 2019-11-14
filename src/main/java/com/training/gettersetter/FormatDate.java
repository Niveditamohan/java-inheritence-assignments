package com.training.gettersetter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.training.gettersetter.exception.InvalidDaysException;
import com.training.gettersetter.exception.InvalidMonthException;
import com.training.gettersetter.exception.InvalidYearException;

public class FormatDate {

	private int days;
	private int months;
	private int year;

	/**
	 * Mutators and Accessors for all the fields
	 */
	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * Method that uses days, month and year input given through mutator methods and calculates the date based on the values
	 * @return Returns Date after checking if the conditions satisfy; if not then it throws the respective exceptions
	 * @throws ParseException
	 * @throws InvalidDaysException
	 * @throws InvalidMonthException
	 * @throws InvalidYearException
	 */
	public Date returnDate() throws ParseException, InvalidDaysException, InvalidMonthException, InvalidYearException {
		if (((months == 1 || months == 3 || months == 5 || months == 7 || months == 8 || months == 10 || months == 12)
				&& (days > 31)) || ((months == 4 || months == 6 || months == 9 || months == 11) && days > 30)
				|| (months == 2 && year % 2 == 0 && days > 29) || (months == 2 && year % 2 != 0 && days > 28))
			throw new InvalidDaysException("Check the number of days entered!");

		else if (months > 12)
			throw new InvalidMonthException("Check the month entered!");

		else if (year < 1000)
			throw new InvalidYearException("Check the year entered!");
		else {
			String dateString = days + "-" + months + "-" + year;
			Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
			return date;
		}
	}
}

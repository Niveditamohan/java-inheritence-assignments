package com.training.gettersetter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {

	private int days;
	private int months;
	private int year;

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

	public String returnDate() throws ParseException {
		String dateString  = days + "-" + months + "-" + year;
		Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
		return date.getDay()+ "-" + date.getMonth() + "-" + date.getYear();
	}
}

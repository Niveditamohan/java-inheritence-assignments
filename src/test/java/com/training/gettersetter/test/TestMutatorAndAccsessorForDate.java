package com.training.gettersetter.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.training.gettersetter.FormatDate;

public class TestMutatorAndAccsessorForDate {

	FormatDate date = new FormatDate();

	@Test
	public void testDate() {
		date.setDays(13);
		date.setMonths(11);
		date.setYear(2019);
		assertEquals(13 - 11 - 2019, date.returnDate());
	}
}

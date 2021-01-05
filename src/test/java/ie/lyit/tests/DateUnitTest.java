package ie.lyit.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ie.lyit.bank.Date;

public class DateUnitTest {

	Date d1, d2;
	
	@Before
	public void init() {
		d1 = new Date(1,12,2020);
		d2 = new Date(1,12,2020);
	}

	@Test
	public void testDateEquals() {
		assertTrue("d1 should equal d2", d1.equals(d2));
	}
	
	@Test
	public void testDayRange() {
		
		try {
			d1.setDay(50);
			fail("Should not be able to speciy day greater than 31");
		}
		catch(IllegalArgumentException e) {
			assertTrue("", true);
		}
		
		try {
			d1.setDay(-50);
			fail("Should not be able to speciy day less than zero");
		}
		catch(IllegalArgumentException e) {
			assertTrue("", true);
		}
	}
	
	@Test
	public void testMonthRange() {
		
		try {
			d1.setMonth(50);
			fail("Should not be able to speciy month greater than 12");
		}
		catch(IllegalArgumentException e) {
			assertTrue("", true);
		}
		
		try {
			d1.setMonth(-50);
			fail("Should not be able to speciy month less than zero");
		}
		catch(IllegalArgumentException e) {
			assertTrue("", true);
		}
	}
	
	@Test
	public void testYearRange() {
		
		try {
			d1.setMonth(1989);
			fail("Should not be able to speciy month less than 1990");
		}
		catch(IllegalArgumentException e) {
			assertTrue("", true);
		}
	}

}

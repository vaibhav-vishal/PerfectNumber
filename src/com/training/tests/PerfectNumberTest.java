package com.training.tests;

import static org.junit.Assert.*;
import org.junit.Test;

import com.training.domain.PerfectNumber;

public class PerfectNumberTest {

	PerfectNumber perfectNumber = null;
	
	@Test
	public void testPositiveInput() {
		perfectNumber = new PerfectNumber(10);
		assertTrue(perfectNumber.getNum() > 0);
	}

	@Test(timeout = 10)
	public void testCorrectResult() {
		perfectNumber = new PerfectNumber(28);
		assertTrue(perfectNumber.checkPerfectNumber());
	}

	@Test(timeout = 10)
	public void testIncorrectResult() {
		perfectNumber = new PerfectNumber(3);
		assertFalse(perfectNumber.checkPerfectNumber());
	}

	@Test
	public void teststartRange() {
		perfectNumber = new PerfectNumber(1, 100);
		perfectNumber.printPerfectNumber();
		assertTrue(perfectNumber.getStart() > 0);
	}

	@Test
	public void testEndRange() {
		perfectNumber = new PerfectNumber(1, 200);
		perfectNumber.printPerfectNumber();
		assertTrue(perfectNumber.getEnd() > 0);
	}
}

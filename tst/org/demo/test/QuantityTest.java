package org.demo.test;

import static org.junit.Assert.*;

import org.demo.main.Centimeter;
import org.demo.main.Length;
import org.demo.main.Meter;
import org.demo.main.Quantity;

import org.junit.Test;

public class QuantityTest {

	@Test
	public void testEqualValues() {

		Length meter = new Meter(1);
		Length centiMeter = new Centimeter(100);

		Quantity quantity = new Quantity(meter, centiMeter);
		boolean result = quantity.isEqual(meter,centiMeter);
		System.out.println(result);
		assertEquals(true, result);
	}

	@Test
	public void testNotEqualValues() {

		Length meter = new Meter(100);
		Length centiMeter = new Centimeter(100);

		Quantity quantity = new Quantity(meter, centiMeter);
		boolean result = quantity.isEqual(meter, centiMeter);
		assertEquals(false, result);
	}

}

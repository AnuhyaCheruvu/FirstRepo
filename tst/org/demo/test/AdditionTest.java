package org.demo.test;

import static org.junit.Assert.*;

import org.demo.main.Centimeter;
import org.demo.main.Length;
import org.demo.main.Meter;
import org.junit.Test;

public class AdditionTest {

	@Test
	public void testAddingMeterAndCentimeter() {
		Length meter = new Meter(1);
		Length centimeter = new Centimeter(100);
		Meter sumValue = Meter.convertBackToMeter(meter.add(centimeter));
		
		assertEquals(true, sumValue.equals(new Meter(2)));
		
	}
	

}

package org.demo.test;

import static org.junit.Assert.*;

import org.demo.main.Centimeter;
import org.demo.main.Length;
import org.demo.main.Meter;
import org.demo.main.Millimeter;
import org.junit.Test;

public class MeterConversionTest {

	@Test
	public void testConvertToMilli() {
		Length meter = new Meter(1);
		Length millimeter = new Millimeter(1000);
		assertEquals(true, millimeter.equals(meter.convertToBase()));
	}
	
	@Test
	public void testConvertMeterToCentimeter() {
		Meter meter = new Meter(1);
		Length centimeter= new Centimeter(100);
		
		assertEquals(true,meter.equals(meter.convertBackToMeter(centimeter)));
	}

}

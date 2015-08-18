package org.demo.test;

import static org.junit.Assert.*;

import org.demo.main.Centimeter;
import org.demo.main.Length;
import org.demo.main.Meter;
import org.demo.main.Millimeter;
import org.junit.Test;

public class CentimeterConversionTest {

	@Test
	public void testEqualConversionValues() {
		Centimeter centiMeter = new Centimeter(100);
		Meter meter = new Meter(1);
		Meter meterConverted = centiMeter.convertToMeter();
		assertEquals(true, meter.equals(meterConverted));

	}

	@Test
	public void testNotEqualConverstionValues() {
		Centimeter centiMeter = new Centimeter(100);
		Meter meter = new Meter(100);
		Meter meterConverted = centiMeter.convertToMeter();
		assertEquals(false, meter.equals(meterConverted));

	}

	@Test
	public void testCentimeterToBase() {
		Length centimeter = new Centimeter(1);
		Length millimeter = new Millimeter(10);

		Millimeter millimeterConverted = centimeter.convertToBase();

		assertEquals(true, millimeter.equals(millimeterConverted));
	}

	@Test
	public void testConvertMeterToCentimeter() {
		Length oneMeter = new Meter(1);
		Centimeter centimeter = new Centimeter(100);

		assertEquals(true,
				centimeter.equals(Centimeter.convertToCentimeter(oneMeter)));

	}
	
}

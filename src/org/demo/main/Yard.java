package org.demo.main;

public class Yard extends Length {

	private final double BASE_VALUE_TO_CONVERT_TO_MILLI = 900;
	@Override
	public Millimeter convertToBase() {
		return new Millimeter(value*BASE_VALUE_TO_CONVERT_TO_MILLI);
	}

}

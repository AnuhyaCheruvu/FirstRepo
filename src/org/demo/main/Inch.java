package org.demo.main;

public class Inch extends Length {

	private final double BASE_VALUE_TO_CONVERT_TO_MILLI= 25;

	public Inch(double inch_value) {
		this.value= inch_value;
	}

	@Override
	public Millimeter convertToBase() {
		// TODO Auto-generated method stub
		return new Millimeter(value * BASE_VALUE_TO_CONVERT_TO_MILLI);
	}
	
	


}

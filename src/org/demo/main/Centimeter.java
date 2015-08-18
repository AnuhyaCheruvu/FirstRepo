package org.demo.main;

public class Centimeter extends Length {

	private final double BASE_VALUE_TO_CONVERT_TO_MILLI= 10;
	private final double BASE_VALUE_TO_CONVERT_TO_METER = 100;
	
	

	public Centimeter( double centimeter_value) {

		this.value = centimeter_value;
	}

	@Override
	public Millimeter convertToBase() {
		return new Millimeter(value*BASE_VALUE_TO_CONVERT_TO_MILLI);
		
	}
	
	public Meter convertToMeter() {
		return new Meter(value/BASE_VALUE_TO_CONVERT_TO_METER);
	}
	
	public static  Centimeter convertToCentimeter(Length baseValue) {
		
		
		return new Centimeter(baseValue.convertToBase().value/10);
		
	}
	
	public boolean equals(Centimeter obj) {
		if(this.value == obj.value)
			return true;
		return false;
	}



}

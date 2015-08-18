package org.demo.main;

public class Meter extends Length {
	
	private static final double BASE_VALUE_TO_CONVERT_TO_MILLI = 1000;
	
	public Meter(double meter) {
			this.value = meter;
	}
	
	@Override
	public Millimeter convertToBase() {
		return new Millimeter(value*BASE_VALUE_TO_CONVERT_TO_MILLI);
	}
	
	public static Meter convertBackToMeter(Length baseValue) {
		System.out.println(baseValue.value);
		return new Meter(baseValue.convertToBase().value/BASE_VALUE_TO_CONVERT_TO_MILLI);
	}
	
	public boolean equals( Meter meter) {
		if(this.value == meter.value)
			return true;
		return false;
	}


}

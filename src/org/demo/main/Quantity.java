package org.demo.main;

public class Quantity {

	private Length meter;
	private Length centiMeter;

	public Quantity(Length meter, Length centiMeter) {
		this.meter = meter;
		this.centiMeter = centiMeter;
	}

	public boolean isEqual(Length obj1, Length obj2) {
		Millimeter m1 = obj1.convertToBase();
		Millimeter m2 = obj2.convertToBase();
		return m1.equals(m2);
	}
}

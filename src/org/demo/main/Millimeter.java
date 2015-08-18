package org.demo.main;

public class Millimeter extends Length {

	public Millimeter(double value) {
		this.value = value;
	}
	@Override
	public Millimeter convertToBase() {
		return this;
	}

}

package org.demo.main;

public abstract class Length {
	
	protected double value;
	
	public abstract Millimeter convertToBase();
	
	public boolean isEqual(Length length) {
		if(this.value == length.value)
			return true;
		return false;
	}
	
	public boolean equals(Length length) {
		
		if(this.value == length.value) {
			System.out.println(this.value);
			System.out.println(length.value);
			return true;
		}
			
		return false;
	}
	
	public Length add(Length length) {
		return new Millimeter(this.convertToBase().value + length.convertToBase().value);
	}

}

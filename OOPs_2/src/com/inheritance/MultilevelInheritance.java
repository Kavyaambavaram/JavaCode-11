package com.inheritance;

class Car {
	private String engineType = "PetrolEngine";

	public String getEngineType() {
		return this.engineType;
	}
}

class FourWheeler extends Car {
	private int numberofWheels = 4;

	public int getWheels() {
		return this.numberofWheels;
	}
}

class RangeRover extends FourWheeler {
	private String brandName = "Tata Motors";

	public String getBrandName() {
		return this.brandName;
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		RangeRover rangerover = new RangeRover();
		System.out.println(rangerover.getBrandName());
		System.out.println(rangerover.getWheels());
		System.out.println(rangerover.getEngineType());

	}

}

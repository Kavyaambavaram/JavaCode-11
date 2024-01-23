package com.inheritance;

class Vehicles {
	private String brandName = "Tata Motors";

	public String getBrandName() {
		return this.brandName;
	}
}

class FourWheelersVehicles extends Vehicles {
	private String vehiclName = "RangeRover";

	public String getVehicleName() {
		return this.vehiclName;
	}
}

class TwoWheelerVehicle extends Vehicles {
	private String vehicleName = "X bike";

	public String getVehicleName() {
		return this.vehicleName;
	}
}

public class HierarchicalINheritance {

	public static void main(String[] args) {
		FourWheelersVehicles obj = new FourWheelersVehicles();
		System.out.println(obj.getBrandName() + " " + obj.getVehicleName());

		TwoWheelerVehicle obj2 = new TwoWheelerVehicle();
		System.out.println(obj2.getBrandName() + " " + obj2.getVehicleName());
	}

}

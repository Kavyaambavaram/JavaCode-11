package com.abstraction;

abstract class Mobile{
	public abstract String getSim();
	
	public int getPrice(){
		return 64000;
	}	
}

abstract class AirtelUsers extends Mobile{
    public abstract boolean is5GUser();
	@Override
	public String getSim() {
		return "Airtel";
	}
	
}

class FiveGUsers extends AirtelUsers{

	@Override
	public boolean is5GUser() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		//Mobile mobile = new Mobile();
		
//		AirtelUsers airtel = new AirtelUsers();
//		System.out.println(airtel.getSim());
//		System.out.println(airtel.getPrice());
		
		FiveGUsers fiveGUsers = new FiveGUsers();
		System.out.println(fiveGUsers.getPrice());
		System.out.println(fiveGUsers.getSim());
		System.out.println(fiveGUsers.is5GUser());

	}

}
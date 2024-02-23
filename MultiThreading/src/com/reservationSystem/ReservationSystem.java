package com.reservationSystem;

public class ReservationSystem {
	
	public synchronized void bookingTicket(String userName, int seatsRequired) {
		System.out.println("------ Welcome to Indian Railways ------");
		System.out.println("Hello Mr/Mrs/Miss :"+userName+" and Seats requested :"+seatsRequired);
		System.out.println("Checking Availability, Please Wait..!");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int availableSeats = RailwayDatabase.getAvailableSeats();
		if(seatsRequired<=availableSeats) {
			availableSeats = availableSeats - seatsRequired;
			RailwayDatabase.setAvailableSeats(availableSeats);
			System.out.println("Hello "+userName+" .Seats Confirmed..!");
		}else {
			System.out.println("Hello "+userName+" .No Seats available...Sorry for inconvience");
		}
	}

}
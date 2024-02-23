package com.reservationSystem;

public class RailwayDatabase {
	static int availableSeats = 10;
	
	public static void setAvailableSeats(int seats) {
		availableSeats = seats;
	}
	
	public static int getAvailableSeats(){
		return availableSeats;
	}
	
}
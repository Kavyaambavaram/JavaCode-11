package com.reservationSystem;

public class Main {

	public static void main(String[] args) {
		ReservationSystem reservationSystem = new ReservationSystem();
		User user1 = new User("SRIDHAR", 8, reservationSystem);
		User user2 = new User("LIKHITH", 7, reservationSystem);
		
		user1.start();
		user2.start();

	}

}
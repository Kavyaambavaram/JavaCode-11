package com.reservationSystem;

public class User extends Thread {
	private String userName;
	private int seatsRequired;
	private ReservationSystem reservationSystem;
	public User(String userName, int seatsRequired, ReservationSystem reservationSystem) {
		super();
		this.userName = userName;
		this.seatsRequired = seatsRequired;
		this.reservationSystem = reservationSystem;
	}
	
	public void run() {
		this.reservationSystem.bookingTicket(userName, seatsRequired);
	}

}

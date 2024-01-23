package com.exceptionhandling;

public class ThrowsKeyword {
	public static void DBConnection() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver"); // Exception occurs here
	}

	public static void main(String[] args) {
		try {
			DBConnection();
		}catch(ClassNotFoundException e) {
			e.printStackTrace(); // Exception Handled Here
		}
	}

}

package com.if_else;

import java.util.Scanner;

class DB{
	private static final String storedUsername = "admin"; //final -- used to data constant
	private static final String storePassword = "admin";
	
	public static String getUsername() {
		return storedUsername;
	}
	public static String getPassword() {
		return storePassword;
	}
}

class LoginSystem {
	public static void loginCredentials() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name");
		String enteredUsername = sc.next();

		if (enteredUsername.equals(DB.getUsername()))
		{
			System.out.println("Inside the outer if-block");
			System.out.println("Enter your password");
			
			String enteredPassword = sc.next();
			
			if (enteredPassword.equals((DB.getPassword()))) {
				System.out.println("welcome " + enteredUsername);
			} else {
				System.out.println("Wrong password.Login failed!");
			}
		} else {
			System.out.println("Invalid username");
		}
	}
}

public class Test2 {

	public static void main(String[] args) {
		LoginSystem.loginCredentials();

	}

}

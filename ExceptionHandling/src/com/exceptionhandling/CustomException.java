package com.exceptionhandling;

class AgeVerificationFailedException extends Exception{
	private String message;
	public AgeVerificationFailedException(String message) {
		this.message = message;
	}
	public String getErrorMessage() {
		return this.message;
	}
}

class LicenseRegistration{
	public static String getRegistration(int age) {
		if(age>=18) {
			return "Application Processing. Please wait..!";
		}else {
			try {
				throw new AgeVerificationFailedException("Age Verification Failed. Try Again..!");
			}catch(AgeVerificationFailedException ae) {
				return ae.getErrorMessage();
			}
		}
	}
}

public class CustomException {

	public static void main(String[] args) {
		String res = LicenseRegistration.getRegistration(18);
		System.out.println(res);
		System.out.println("-------------");
		String res1 = LicenseRegistration.getRegistration(16);
		System.out.println(res1);

	}

}
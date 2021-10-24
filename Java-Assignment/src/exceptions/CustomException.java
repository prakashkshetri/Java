package exceptions;

import java.util.Scanner;

public class CustomException {

	static void validate(int age) throws InvalidAgeException {
		if(age<=17) {
			throw new InvalidAgeException("Age is below 18");
		}
		else {
			System.out.println("Eligible for voting...");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Age : ");
		int ageInput = scanner.nextInt();
		try {
			validate(ageInput);
		}
		catch(Exception e) {
			System.out.println("Exception occured :" + e.getMessage());
		}
	}
}
class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}
}


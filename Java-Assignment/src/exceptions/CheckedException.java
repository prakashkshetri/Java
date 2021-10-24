package exceptions;

import java.util.Scanner;

public class CheckedException {

	public static int add(int num1, int num2) throws java.io.IOException {
        if(num1==num2){
            System.out.println("Both Input values are same..");
            return num1 + num2;
        }
        if(num1 > num2){
            throw new java.io.IOException("First Input is greater than Second Input..");
        }
        else {
            throw new ArithmeticException("Second input is greater than First input..");
        }
	}
	
	public static void main(String[] args) {
		 int result = 0;
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter First Value : ");
	        int num1 = scanner.nextInt();
	        System.out.println("Enter Second Value : ");
	        int num2 = scanner.nextInt();

	        try {
	            result = add(num1, num2);
	            System.out.println("Addition Result : "+ result);
	        }
	        catch(Exception e){
	            System.out.println(e.getMessage());
	        }
	        
	    }

}
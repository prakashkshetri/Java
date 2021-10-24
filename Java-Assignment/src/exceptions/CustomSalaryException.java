package exceptions;
import java.util.*;

public class CustomSalaryException {
    static int check(int salary) throws SalaryException{
        if(salary <=9000 && salary >=5100){
            throw new SalaryException("Salary is very good..");
        }
        else if(salary <=5100 && salary >=2100){
            throw new SalaryException("Your salary is somehow good..");
        }
        else {
            throw new SalaryException("You need to work hard..");
        }
    }
    
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter your Salary : ");
	        int salary = scanner.nextInt();
	        try {
	            check(salary);
	        }
	        catch(Exception e) {
	            System.out.println("Exception occur: "+ e.getMessage());
	        }
	    }
}
class SalaryException extends Exception {
    public SalaryException(String msg){
        super(msg);
    }
}
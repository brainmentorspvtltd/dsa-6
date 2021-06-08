package exceptionhandlingdemos;

import java.util.Scanner;

// Checked Exception
//class MinorAgeException extends Exception{
// UnChecked Exception
class MinorAgeException extends RuntimeException{
	String message ;
	 MinorAgeException() {
		this.message = "";
		
	}
	MinorAgeException(String message){
		this.message = message;
	}
	@Override
	public String toString() {
		return "MinorAgeException [message=" + message + "]";
	}
	
}

public class CustomDemo {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
//		if(age>18) {
//			System.out.println("Driving Lic");
//			System.out.println("Vote");
//		}
		try {
		if(age<18) {
			throw new MinorAgeException("Age can't be less than 18"); // explicit throw
		}
		System.out.println("DL Apply");
		System.out.println("Voter ID Apply");
		}
		catch(MinorAgeException e) {
			System.out.println(e);// e.toString() 
		}
		finally {
			scanner.close();
		}
		

	}

}

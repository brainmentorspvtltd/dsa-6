package exceptionhandlingdemos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {
	Scanner scanner = new Scanner(System.in);
	int firstNumber;
	int secondNumber;
	int result;
	void takeFirstNumber() {
		try {
			System.out.println("Enter the First Number");
			firstNumber = scanner.nextInt(); // throw new InputMismatchException(); // Implicit throw
			}
			catch(InputMismatchException e) {
				System.out.println("Number Must be B/w 0 to 9");
				scanner.nextLine();
				takeFirstNumber(); 
				
			}
	}
	
	void takeSecondNumber(String msg) {
		if(msg==null) {
			msg = "Number Must be B/w 0 to 9";
		}
		try {
			System.out.println("Enter the Second Number");
			secondNumber = scanner.nextInt(); // throw new InputMismatchException(); // Implicit throw
			}
			catch(InputMismatchException e) {
				System.out.println(msg);
				scanner.nextLine();
				takeSecondNumber(msg);
				
			}
	}
	
	void divide() {
		try {
		 result = firstNumber / secondNumber; 
		}
		catch(ArithmeticException e) {
			System.out.println("U divide a Number with Zero ");
			takeSecondNumber("Number Must be B/w 1 to 9 , Zero Not Allowed");
			divide();
		}
	}
	
	void print() {
		System.out.println("Result is "+result);
		scanner.close();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc obj = new Calc();
		obj.takeFirstNumber();
		obj.takeSecondNumber("Number Must be B/w 0 to 9");
		obj.divide();
		obj.print();
		
//		int firstNumber =0;
//		int secondNumber =0 ;
//		Scanner scanner = new Scanner(System.in);
//		try {
//		System.out.println("Enter the First Number");
//		firstNumber = scanner.nextInt(); // throw new InputMismatchException(); // Implicit throw
//		}
//		catch(InputMismatchException e) {
//			System.out.println("Number Must be B/w 0 to 9");
//			
//		}
//		System.out.println("Enter the Second Number");
//		secondNumber = scanner.nextInt(); // throw new InputMismatchException
//		int result = firstNumber / secondNumber; // throw new ArithmeticException
//		System.out.println("Result "+result);
//		scanner.close();
	}

}

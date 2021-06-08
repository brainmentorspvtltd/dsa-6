package exceptionhandlingdemos;

import java.util.Scanner;

public class TryWithResourceDemo {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		try {
//			System.out.println("Enter the NAme");
//			String name = scanner.nextLine();
//			System.out.println("Your Name is "+name);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		finally {
//			if(scanner!=null) {
//				scanner.close();
//			}
//		}
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Enter the NAme");
			String name = scanner.nextLine();
			System.out.println("Your Name is "+name);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}

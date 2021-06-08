package exceptionhandlingdemos;

public class BeSpecific {

	public static void main(String[] args) {
		int a  = 10;
		int b = 0;
		try {
		int arr [] = new int[10];
		arr[11] = 4343;
		String e = null;
		e.toUpperCase();
		int c = a/b;
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Beyond ");
			System.out.println(e.toString());
		}
		catch(NullPointerException e) {
			System.out.println("Vallue is Null so can't perform any operation");
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println("Divide by Zero ");
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Some other Exception occur , contact to system admin");
			System.out.println(e);
		}
		

	}

}

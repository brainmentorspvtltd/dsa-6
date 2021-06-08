package exceptionhandlingdemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


class A{
	int x = 10;
	void show() throws IOException{
		System.out.println("A Show");
	}
	
	void print() throws ArithmeticException{
		System.out.println("A Print");
	}
//	void show() {
//		System.out.println("A Show");
//	}
}
class B extends A{
	int x = 20;
	@Override
	void show() throws FileNotFoundException{
		System.out.println("B Show");
	}
	@Override
	void print() throws NullPointerException {
		
	}
}

public class CheckedDemo {
	
	static void unchecked(){
			String name = null;
			name.toUpperCase();
//			if(name!=null) {
//			name.toUpperCase();
//			}
	}

	public static void main(String[] args) throws FileNotFoundException {
		//A b = new B();
		B b = new B();
		b.show();
		System.out.println(b.x);
		/*unchecked();
		String path = "/Users/amit/Documents/dit-dsa/exceptionhandlingdemos/src/abcd.txt";
		File file = new File(path);
		try {
			file.createNewFile();
			System.out.println("File Created..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/

	}

}

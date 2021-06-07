
import static java.lang.System.out;
import static java.lang.Math.pow;
interface P11{
	static void print() {
		System.out.println("Print ");
	}
}

class P12{
	private P12() {}
	static void disp() {
		System.out.println("Disp");
	}
}


//class Tri{
//	private Tri() {}
//	static void sin() {
//		
//	}
//}

class T2{
	static void disp() {
		print();
		System.out.println("I am Disp");
	}
	static void print() {
		System.out.println("I am Print");
	}
	static {
		System.out.println("i will call when class is loaded");
	}
	{
		System.out.println("I am a init block, when object is created");
	}
	T2(){
		System.out.println("When object is created i will call");
	}
}
public class StaticDemo2 {
	
	
	static void show() {
		System.out.println("I am Static Show");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		T2 obj = new T2();
//		T2 obj2 = new T2();
//		T2 obj3 = new T2();
		//T2.disp();
		//System.out.println();
		out.println("Hello Java "+pow(2,3));
		
//		show();
//		P11.print();
//		P12.disp();
//		Tri.sin();
//		Math.abs(-100);

	}

}

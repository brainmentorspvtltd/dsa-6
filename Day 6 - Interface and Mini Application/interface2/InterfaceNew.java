import java.util.List;

interface N{
	final int MAX = 100;
	void show();
	private  void xyz() {
		System.out.println("I am Xyz");
	}
	public default void disp() {
		xyz();
		System.out.println("I am N Disp");
	}
	public static void print() {
		System.out.println("Static in INterface");
	}
}
interface M{
	public default void disp() {
		System.out.println("I am M Disp");
	}
}
class N1 implements N, M{
	@Override
	public  void disp() {
		N.super.disp();
		M.super.disp();
		System.out.println("N1 Disp");
	}
	@Override
	public void show() {
		System.out.println("I am N1 Show");
		// TODO Auto-generated method stub
		
	}



}

// Utility Class
//final class Tri{
//	private Tri() {}
//	static void sin() {
//		
//	}
//	static void cos() {
//		
//	}
//	static void tan() {
//		
//	}
//}
// Utility Interface
interface Tri{
	
	static void sin() {
		
	}
	static void cos() {
		
	}
	static void tan() {
		
	}
}
//}

public class InterfaceNew {

	//@SuppressWarnings("static-access")
	public static void main(String[] args) {
//		Tri t = new Tri();
//		t.sin();
		Tri.sin();
		N.print();
		N1 obj= new N1();
		//obj.show();
		obj.disp();
		//Math.sin(0)
		List l;

	}

}

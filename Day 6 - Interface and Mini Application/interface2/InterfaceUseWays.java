

// SAM
@FunctionalInterface
interface Calc{
	int compute(int x, int y);
	//int add();
}

class V{
	void show() {
		System.out.println("I am V Show");
	}
}
class V1 extends V{
	@Override
	void show() {
		System.out.println("I am V1 Show");
	}
}

//// 1st way
//class MyCalc implements Calc{
//
//	@Override
//	public int compute(int x, int y) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	
//	
//}

public class InterfaceUseWays {

	public static void main(String[] args) {
		
		
		// Object Creation + Class Creation + Upcasting
		V v = new V() {
			@Override
			void show() {
				super.show();
				print();
				System.out.println("I am Anonymous Class Method");
			}
			void print() {
				System.out.println("I am Anonymous Class Method Print");
			}
		};
		v.show();
		//v.print();
//		V1 obj = new V1();
//		obj.show();
		//new V1().show();
		// TODO Auto-generated method stub
//		MyCalc obj = new MyCalc();
//		int result = obj.compute(10, 20);
//		System.out.println(result);
		int score = 200;
		if(score>100) {
			
			//3rd way (Lambda Expression) SAM Interface JDK 8
			Calc c = (a,b)->a+b;
			System.out.println(c.compute(10,20));
			Calc cc  = (a,b)->{
				System.out.println("a is "+a+" b is "+b);
				return a + b;
			};
			// Object creation + Anonymous class creation
			// class _____ implement Calc{}
			// 2nd way
			Calc calc = new Calc() {

			@Override
			public int compute(int x, int y) {
				//print();
				// TODO Auto-generated method stub
				return x + y;
			}
//			void print() {
//				System.out.println("I am Anonymous class Print....");
//			}
			
		};
			int result = calc.compute(1000, 200);
			//calc.print();
			System.out.println(result);
		}

	}

}

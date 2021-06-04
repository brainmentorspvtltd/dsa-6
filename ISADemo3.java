

//final class X1{
class X1{
	final int z;
	X1(){
		z = 1000;
		System.out.println("I am a X1 Default Cons");
	}
	X1(int x){
		this();
		System.out.println("I am a X1 Param Cons");
	}
	final void show() {
		System.out.println("I am Show");
	}
}
class Y1 extends X1{
	int z = 10;
	
//	@Override
//	void show() {
//		
//	}
	
	Y1(){
		// implicit super call super();
		// explicit super call
		super(100);
		System.out.println("I am a Y1 Default Cons");
	}
	Y1(int z){
		// implicit super call super();
		//super(x);
		this();
		
		//super(100);
		System.out.println("I am a Y1 Param Cons " );
	}
}
class Z1 extends Y1{
	int z =2;
	Z1(int z){
		int result = ((X1)this).z + ((Y1)this).z + this.z + z;
		System.out.println("I am a Z1 Param Cons " + result);
	}
	
}
public class ISADemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Y1 obj = new Y1();
		final Z1 obj = new Z1(1);
		obj.z = 10000;
		//obj = new Z1(2);
		

	}

}

import java.io.IOException;

class X{
	int a, b, c;
	String q;
	double w;
}

class Y extends X{
	int t;
	boolean g;
}


class Parent{
	X show() throws Exception{
		System.out.println("Parent Method Show");
		//return 10;
		return new X();
	}
}
class Child extends Parent{
	@Override
	Y show() throws IOException{
		System.out.println("Child Method Show");
		return new Y();
	}
}

public class ISADemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Child child = new Child();
		 Y obj = child.show();

	}

}

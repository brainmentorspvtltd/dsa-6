

interface X2{
	int MAX = 100; // public static final int MAX = 100;
	void show();
	void disp();
}
interface Y2{
	int MAX = 200;
	void show();
	void output();
}
interface Z extends X2, Y2{
	void print();
}
class M1 implements Z{

	@Override
	public void show() {
		System.out.println(X2.MAX + Y2.MAX);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M1 obj = new M1();
		obj.show();

	}

}

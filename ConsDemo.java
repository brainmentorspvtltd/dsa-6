
class G1{
	int x;
	int z;
	G1(int x){
		this.x = x;
	}
}
class G2 extends G1{
	int x;
	G2(int x){
		super(x);
		//x = 2;
		//this.x = x;
	}
}
class G3 extends G2{
	int x;
	G3(){
		super(2);
		x = 3;
		System.out.println(((G1)this).x + super.x + this.x);
	}
}
public class ConsDemo {

	public static void main(String[] args) {
		G3 obj = new G3();

	}

}

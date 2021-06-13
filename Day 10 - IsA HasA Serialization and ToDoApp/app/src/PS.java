import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;

class C implements Serializable{
	int p;
	C(){
		p = 100;
		System.out.println("C Cons Call "+p);
	}
}
//class A implements Serializable{
class A {
	int x,y,z;
	A(){
		x = 1;
		y = 2;
		z = 3;
		System.out.println("A Cons  Call x "+x +" y "+ y +" z "+ z);
	}
	A(int x, int y , int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
class B extends A implements Serializable{
//class B extends A{
	String msg = "Hello";
	C c = new C(); // Has -A Member
	int a ,b; 
	B(){
		//super(1,2,3);
		a=10;
		b = 20;
		x = x + a; //11
		y = y + b; //22
		z = a + b + z; //33
		System.out.println("B Cons Call x "+x +" y "+ y +" z "+ z+" a "+a + " b "+b);
	}
	@Override
	public String toString() {
		return "B [a=" + a + ", b=" + b + ", x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}

public class PS {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path = "/Users/amit/Documents/dit-dsa/app/obj.dat";
		 B b = new B();
		 FileOutputStream fo = new FileOutputStream(new File(path)); // Bytes write in a file
		 ObjectOutputStream os = new ObjectOutputStream(fo); // object convert into bytes
		 os.writeObject(b); // Seriaization (Object convert into bytes)
		 os.close();
		 fo.close();
		 System.out.println("Done...");
		 
		 FileInputStream fs = new FileInputStream(path); // read bytes from a file
		 ObjectInputStream oi = new ObjectInputStream(fs);
		 B bFromFile  = (B)oi.readObject(); // Deserialization
		 System.out.println(bFromFile);
		 oi.close();
		 fs.close();
		//System.setOut(new PrintStream(new File("/Users/amit/Documents/dit-dsa/app/src/abcd.txt")));
		//System.out.println("Hello Java");
		//		PrintStream ps = new PrintStream(new File("/Users/amit/Documents/dit-dsa/app/src/abcd.txt"));
//		ps.write("Hello How are U ".getBytes());
//		ps.close();
	}

}

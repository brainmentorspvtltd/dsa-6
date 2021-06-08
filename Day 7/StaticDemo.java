

class Customer{
	int id; // Instance Variables (Comes in the Memory when object is created) , Instance Members are bind with an object
	String name;
	double balance;
	 static int countCustomer; // int default value that is 0
	static String companyName; // Class Variable (It comes in the memory when class is loaded)
	// static things bind with a class not with the object
	/*
	 * Constructor is used to initalize the Instance Variable of the class
	 * Constructor call Per Object Creation
	 * e.g 4 Object so 4 time constructor call
	 * Constructor call when object is created
	 */
	Customer(int id, String name, double balance){
		companyName = "Brain Mentors"; // Init
		countCustomer++;
		this.id = id ;
		this.name = name;
		this.balance = balance;
		System.out.println("Customer Count "+countCustomer);
		//System.out.println("I am a Customer class Constructor and i will call when object is created");
	}
	// static block call when class is loaded and class is loaded only once
	static {
//		id++;
//		name = "Ramesh";
		System.out.println("Third Static Block");
	}
	static {
		int myLocalVar = 10000;
		System.out.println("I Will call when class is loaded...."+myLocalVar);
		companyName = "Brain Mentors";
	}
	static {
		//myLocalVar++;
		System.out.println("Second Static Block");
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", balance=" + balance + "Company Name "+companyName+"]";
	}
	
}
public class StaticDemo {
	static int Y = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Y);
		int x = 100;
		System.out.println(Customer.companyName);
		Customer amit = new Customer(1001, "Amit", 9999);
		Customer ram =new Customer(1002, "Ram",2222);
		System.out.println("########################");
		System.out.println(amit);
		System.out.println(ram);
		//System.out.println(Customer.id);
		

	}

}

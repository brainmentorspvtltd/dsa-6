

public class TestStudent {

	public static void main(String[] args) {
		double marks [] = {90,77,87};
		Student ram = new Student(1001, "Ram", "java", marks);
		ram.setName(ram.getName()+" Kumar");
		ram.print();
		Student shyam = new Student(1002,"Shyam","JavaScript",new double[] {99,77,88});
		shyam.print();
//		Student ram;
//		ram = new Student(); // Instance Create == Object Creation (e.g new Student())
//		
//		if(ram.input(-1001, "Ram", "Java", -9090)) {
//			ram.print();
//		}
//		System.out.println("**************************");
//		Student shyam = new Student();
//		shyam.input(1002, "Shyam","JavaScript",5454);
//		shyam.print();
		// Default Values
//		System.out.println("RollNo is "+ram.rollno);
//		System.out.println("Name "+ram.name);
//		System.out.println("Course "+ram.course);
//		System.out.println("Marks "+ram.marks);
//		ram.rollno = -1001;
//		ram.name = "Ram";
//		ram.course = "Java";
//		ram.marks=-90;
//		System.out.println("RollNo is "+ram.rollno);
//		System.out.println("Name "+ram.name);
//		System.out.println("Course "+ram.course);
//		System.out.println("Marks "+ram.marks);
		
		int x;
		x = 100;

	}

}

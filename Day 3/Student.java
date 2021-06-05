
public class Student {
	// private data members + public methods = Good Encapsulation
	// Data Hiding
	private int rollno; // Instance Variables 
	private String name;
	private String course;
	private double marks;
	private String centerName;
	private String email;
	private String phone;
	private String city;
	private String pincode;
	private String streetAddress;
	private String secondaryPhone;
	private String reference;

	public Student (){
		centerName = "Brain Mentors";
//		rollno = 0;
//		name = "";
//		course = "";
//		marks = 0.0;
	}
	public Student(int rollno, String name) {
		this();
		this.rollno = rollno;
		this.name = name;
	}
	// Primary Member Initalize
	Student(int rollno, String name, String course, double marks){
		//this();
		this(rollno, name);
		//this(); // Calling Default Constructor
		//this.rollno = rollno;
		//this.name = name;
		this.course = course +"-" +this.rollno+" - "+this.centerName;
		this.marks = marks;
	}



//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public String getName() {
//		return name;
//	}

public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getSecondaryPhone() {
		return secondaryPhone;
	}
	public void setSecondaryPhone(String secondaryPhone) {
		this.secondaryPhone = secondaryPhone;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public int getRollno() {
		return rollno;
	}
	//	public boolean input(int rollno , String name , String course, double marks) {
//		// Local Variables input(int rollno , String name , String course, double marks)
//		// LOcal Variables - Near Variable
//		if(rollno>0 && marks>0) {
//		//this.rollno = r;
//		this.rollno = rollno; // Instance Var = Local Var
//		this.name = name;
//		this.course = course;
//		this.marks=marks;
//		return true;
//		}
//		else {
//			System.out.println("Invalid Data to Enter Not Accepted");
//			return false;
//		}
//	}
	// DRY 
	public void print() {
		System.out.println("RollNo is "+rollno);
		System.out.println("Name "+name);
		System.out.println("Course "+course);
		System.out.println("Marks "+marks);
		System.out.println("Center Name "+centerName);
	}
}
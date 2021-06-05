

abstract class ITEmployee{
	int id;
	String name;
	double salary;
	String companyName;
	ITEmployee(){
		companyName = "Google";
	}
	ITEmployee(int id, String name , double salary){
		this();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	abstract void computeAtt();
//	abstract void computeAtt() {
//		
//	}
	
	void printEmployee() {
		System.out.println("Company Name "+companyName+"\nId "+id+" Name "+name+" Salary "+salary);
	}
	
	void location() {
		System.out.println("Location Assign ");
	}
	
}
class PartTimeEmployee extends ITEmployee{
	int noOfHours ;
	PartTimeEmployee(int id, String name, double salary, int noOfHours){
		super(id, name, salary);
		this.noOfHours = noOfHours;
	}
	
	@Override
	void printEmployee() {
		super.printEmployee();
		System.out.println("No of Hours "+noOfHours);
	}

	@Override
	void computeAtt() {
		System.out.println("Att Hourly Basis");
		
	}
	
	
	
}
class FullTimeEmployee extends ITEmployee{
	double pf;
	double bonus;
	@Override
	void computeAtt() {
		System.out.println("Att Monthly Basis");
		
	}
	FullTimeEmployee(int id, String name, double bonus){
		super(id, name, bonus);
	}
	void computePF(){
		System.out.println("PF "+(salary * 0.10));
	}
	void computeBonus(){
		System.out.println("Bonus "+(salary * 0.50));
	}
	@Override
	void printEmployee() {
		super.printEmployee();
		//computePF();
		//computeBonus();
	}
}
class FreeLancer extends ITEmployee{
	String project;
	int duration;
	@Override
	void computeAtt() {
		System.out.println("Att Project Basis");
		
	}
	FreeLancer(int id, String name, double salary, String project, int duration){
		super(id, name, salary);
		this.project = project;
		this.duration = duration;
	}
	void rating() {
		System.out.println("Rating A");
	}
	@Override
	void printEmployee() {
		super.printEmployee();
		System.out.println("Project "+project);
		System.out.println("Duration "+duration);
		//rating();
	}
}

class Caller{
	
	void callEmployee(ITEmployee employee) {
		employee.printEmployee();
		employee.location();
		employee.computeAtt();
		if(employee instanceof FullTimeEmployee) {
			FullTimeEmployee fte = (FullTimeEmployee) employee; // Downcasting
			fte.computeBonus();
			fte.computePF();
		}
		else
		if(employee instanceof FreeLancer) {
			((FreeLancer)employee).rating(); // Downcasting
		}
		
		System.out.println("#####################################");
		
	}
}

public class ISADemo5 {

	public static void main(String[] args) {
		
		Caller caller = new Caller();
		//caller.callEmployee(new ITEmployee(1000,"Amit", 5454));
		caller.callEmployee(new FullTimeEmployee(1001, "Ram", 9999));
		caller.callEmployee(new PartTimeEmployee(1002, "Ramesh", 9999,30));
		caller.callEmployee(new FreeLancer(1003, "Tim", 9999,"A",40));
		
//		ITEmployee emp = new FullTimeEmployee(1001, "Ram", 9999); // UpCasting
//		emp.printEmployee();
//		emp.location();
//		//emp.computePF();
//		emp = new FreeLancer(0, null, 0, null, 0); // Upcasting
//		emp.printEmployee();
//		emp.location();
//		
//		emp = new PartTimeEmployee(0, null, 0, 0); // Upcasting
//		emp.printEmployee();
//		emp.location();
		
		//FullTimeEmployee ram =new FullTimeEmployee(1001 , "Ram",9999);
		
//		FullTimeEmployee ram =new FullTimeEmployee(1001 , "Ram",9999);
//		ram.printEmployee();
//		ram.location();
//		ram.computeBonus();
//		ram.computePF();
//		System.out.println("************************************");
//		PartTimeEmployee ramesh = new PartTimeEmployee(1002, "Ramesh",5555,20);
//		ramesh.printEmployee();
//		ramesh.location();
//		System.out.println("#######################################");
//		FreeLancer amit = new FreeLancer(1003, "Amit",11111, "ReactJS",30);
//		amit.printEmployee();
//		amit.rating();
//		amit.location();
		
	}

}

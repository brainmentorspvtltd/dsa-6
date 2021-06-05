
public class Employee {//extends Object{
	
	int id;
	String name;
	double salary;
	
	Employee(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Id " +id+" Name "+name+" Salary "+salary;
	}

}

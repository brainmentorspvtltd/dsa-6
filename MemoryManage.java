import java.util.ArrayList;

public class MemoryManage {

	public static void main(String[] args) throws Exception {
		System.out.println("Memory Load Start");
		long id =1;
		ArrayList<Employee> list = new ArrayList<>();
		while(true) {
			Employee emp = new Employee((int)id, "Amit"+id, 98999);
			list.add(emp);
			Thread.sleep(150);
			id++;
		}

	}

}

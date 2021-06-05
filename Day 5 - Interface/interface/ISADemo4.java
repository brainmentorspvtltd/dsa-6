import java.util.Scanner;

public class ISADemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name");
		name = scanner.nextLine();
		String names[] = name.split(" ");
		System.out.println(names.length);
		String result = "";
		for(String currentName : names) {
			result +=String.valueOf(currentName.charAt(0)).toUpperCase() + currentName.substring(1).toLowerCase() + " ";
		}
		System.out.println(result);
		scanner.close();
		

	}

}

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Name");
		String strName = scanner.next();
		//char name [] = {'A','m','i','t'};
		char name[] = strName.toCharArray();
		int i= 0;
		int j = name.length-1;
		while(i<j) {
			char temp = name[i];
			name[i] = name[j];
			name[j] = temp;
			i++;
			j--;
		}
		for(char singleChar : name) {
			System.out.print(singleChar);
		}

	}

}

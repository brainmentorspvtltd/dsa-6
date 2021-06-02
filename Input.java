import java.util.Scanner;;
public class Input {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner("Hello How are You");
       // Scanner scanner = new Scanner("Hello How are You\n I am Fine \n Thank u");
        // String t = scanner.next();
        // System.out.println(t);
        // t = scanner.next();
        // System.out.println(t);
        // int wordCount = 0;
        // while(scanner.hasNext()){
        //     System.out.println(scanner.next());
        //     wordCount++;
        // }
        // System.out.println(wordCount);
        // int lineCount = 0;
        // while(scanner.hasNextLine()){
        //     System.out.println("Current Line "+scanner.nextLine());
        //     lineCount++;
        // }
        // System.out.println("No of Lines "+lineCount);

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = scanner.nextInt();
        System.out.println("Enter the Name");
        //String name = scanner.next();
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("Enter the Salary");
        double salary = scanner.nextDouble();
        System.out.println("Name  "+name);
        System.out.println("Age "+age);
        System.out.println("Salary "+salary);
        //scanner.close();
        //scanner = new Scanner(System.in);
        System.out.println("Enter the City");
        String city = scanner.next();
        System.out.println("City "+city);
        scanner.close();
    }
}

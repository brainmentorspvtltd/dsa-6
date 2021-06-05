//import java.lang.*; // by default import
public class Demo5 {
    public static void main(String[] args) {
        String name = "Amit";
        String name2 = "Amit";
        String name3 = "Amit";
        name = name + " Srivastava";
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name == name3); // Reference Compare
        System.out.println(name.equals(name3)); // Value compare
        System.out.println("Amit".equalsIgnoreCase("AMIT"));
    }

}

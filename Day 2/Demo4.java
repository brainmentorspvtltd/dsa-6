public class Demo4 {
    public static void main(String[] args) {
        String name = "Amit".intern();
        String name2 = new String("Manik").intern();
        String name5 = "Manik"; // "Manik".intern()
        String name3 = "Amit".intern();
        String name4  = new String("Amit");
        System.out.println(name == name3); // true
        System.out.println(name == name4); // false
        System.out.println(name2 == name5); // true

    }

}

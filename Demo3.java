public class Demo3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Amit");
        StringBuffer sb2 = sb;
        sb2.append(" Srivastava");
        System.out.println(sb2);
        System.out.println(sb);
        String name = "Amit";
        String name2 = name;
        System.out.println(name== name2);
        String name3 = new String("Amit");
        System.out.println(name == name3);
    }
}

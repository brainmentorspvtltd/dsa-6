import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;


public class Demo6 {
   public static void main(String[] args) {
    int w1 = 100;
    int w2 = 200;
    int w3 = w1 + w2;

    Integer q = new Integer(100);
    Integer q2  = new Integer(200);
    //q + q2
    int b = q.intValue() + q2.intValue();
    LinkedList<Integer> list = new LinkedList<>();
        list.add(new Integer(100));
        list.add(new Integer(200));
        list.add(8888);
        Integer z = 1000;
        list.add(z);
        Integer dd = 1000; // AutoBoxing
        Integer ee = 2000;
        int f = dd + ee; // AutoBoxing
        System.out.println(f);
        BigInteger w4 = new BigInteger("5345353534534534535345"); // 64 byte
        BigInteger w5 = new BigInteger("5345353534534534535345"); // 64 byte
        BigInteger w6 = w4.add(w5); // Immutable
        System.out.println(w6);
        BigDecimal bb = new BigDecimal("645645543534.24343"); // 32 byte


   }
}

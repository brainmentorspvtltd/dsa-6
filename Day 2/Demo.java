public class Demo {
    public static void main(String[] args) {
        int sum = 0;
        // 0 to N Args
        for(int i = 0 ; i<args.length; i++){
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum is "+sum);
    }
}

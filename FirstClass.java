import java.io.File;
import java.io.PrintStream;

class SecondClass{


    static public void main(){
        System.out.println("I am Another Main");
    }
    static public  void main(String ...aa) throws Exception{
        //"c:\\abcd\\myfile.txt"
        // Custom Print
        // PrintStream myOut = new PrintStream(new File("/Users/amit/Documents/dit-java-group-6/myfile.txt"));
        // System.setOut(myOut);
        System.out.println("Hello Java ");
        main();
        //print - same line
        // println - new line
    }
}
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class I18NDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Press 1. For Hindi");
		System.out.println("Press 2 for English");
		int choice = new Scanner(System.in).nextInt();
		Locale locale = new Locale("en", "US");
		if(choice==1) {
			locale = new Locale("hi", "IN");
		}
		
		ResourceBundle rb = ResourceBundle.getBundle("message", locale);
		double salary = 324229000.43;
		System.out.println(rb.getString("welcome"));
		Date date = new Date();
		System.out.println(date);
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
		String formattedDate = df.format(date);
		System.out.println(rb.getString("date") +" " +formattedDate);
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		String formattedSalary = nf.format(salary);
		System.out.println(rb.getString("salary")+" "+formattedSalary);
		

	}

}

package recursion;

public class AssignmentQuestions {

	static String str = "2*pi+3*pi+10*pi";
	static String pi(int index) {
		if(index== str.length()) {
			return "";
		}
		// for checking the value contains pi
		if(index+1<str.length() && str.charAt(index)=='p' && str.charAt(index+1)=='i') {
			return "3.14" + pi(index+2); // concate 3.14 and skip the pi 
		}
		return str.charAt(index) + pi(index+1);  // for rest of the chars
	}
	
	static int printDigit(int noOfDigit, int currentDigit) {
		if(noOfDigit==0) {
			return currentDigit;
		}
		System.out.print(currentDigit);
		noOfDigit = noOfDigit - 1;
		return printDigit(noOfDigit, currentDigit+1);
	}
	
	static void printRow(int noOfRows, int noOfDigit, int startDigit) {
		if(noOfRows==0) {
			return ;
		}
		startDigit = printDigit(noOfDigit, startDigit);
		System.out.println(); //New Line Add
		printRow(noOfRows-1, noOfDigit+1, startDigit);
	}
	
	public static void main(String[] args) {
		System.out.println(pi(0));
		//printRow(5,1,1);
	}

}

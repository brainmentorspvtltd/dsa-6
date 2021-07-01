package recursion;

import java.io.PrintStream;

public class Printing {
	
	
	static int sum(int num) {
		
		if(num==0) {
			return 0;
		}
//		int total = 0;
//		total+= num % 10;
		
		//return total +  sum(num/10);
		return num%10 + sum(num/10);
	}
	
static int sum2(int num) {
		
		if(num==0) {
			return 0;
		}
		int total = 0;
		total+= num % 10 + sum(num/10);
		
		//return total +  sum(num/10);
		return total  ;
	}

static int sum2(int num, int total) {
	
	if(num==0) {
		return total;
	}
	total+= num % 10;
	return sum2(num/10, total);
	
	
	
}
	
	// 5 to 1 numbers
	// 1 to 5 print
	static void print(int n) {
		// Termination Case
		if(n==0) {
			return ;
		}
		// Pre logic
		System.out.println(n);
		// Recurrance Equ
		print(n-1); // 
		// Post Logic
		System.out.println(n);
		
	}
	
	static int sum3(int num, int count) {
		if(num==0) {
			return count;
		}
		if(num%10==0) {
			count++;
		}
		
		return sum3(num/10, count);
	}

	
	static String reverse(String str) {
		if(str.length()==1) {
			return String.valueOf(str.charAt(0));
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}
	
	
	static void printAStar(int noOfStar) {
		// Termination Case
		if(noOfStar == 0) {
			return ;
		}
		System.out.print("*"); // Logic
		printAStar(noOfStar-1);  // Small Problem
	}
	
	static void printRow(int noOfRow, int noOfStar) {
		// Termination Case
		if(noOfRow == 0) {
			return ;
		}
		noOfStar = noOfStar+1; 
		printAStar(noOfStar);
		System.out.println(); // logic
		printRow(noOfRow - 1, noOfStar); // Small Problem
	}
	
	
	public static void main(String[] args) {
		
		printRow(5, 0);
		
		// TODO Auto-generated method stub
		//print(5);
		//System.out.println(sum(123));
//		System.out.println(sum2(123,0));
//		
//		System.out.println(sum3(102030,0));
//		System.out.println(reverse("amit"));
	
	}

}

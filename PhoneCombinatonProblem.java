package backtracking;

import java.util.ArrayList;

public class PhoneCombinatonProblem {
	
	static String keyPadArray [] = {"",".+-", "abc", "def", "ghi"};	
	static ArrayList<String> keyPad(String phoneNumber){
		
		// Termination case
		if(phoneNumber.length()==0) {
			ArrayList<String> combination = new ArrayList<>();
			combination.add("");
			return combination;
		}
		
		// Get the first digit of a number
		char first = phoneNumber.charAt(0); // first digit get it
		String remainingPhoneNumber = phoneNumber.substring(1); 
		int index = first - '0';
		String keyPadKey = keyPadArray[index]; // abc
		ArrayList<String> finalResult = new ArrayList<>();
		for(int i = 0; i<keyPadKey.length(); i++) {
			char currentChar = keyPadKey.charAt(i);
			ArrayList<String> temp = keyPad(remainingPhoneNumber);
			for(String t: temp) {
				finalResult.add(currentChar + t);
			}
			
		} // loop ends
		return finalResult;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(keyPad("23"));

	}

}

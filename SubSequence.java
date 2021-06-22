package recursion;

import java.util.ArrayList;

public class SubSequence {

	static ArrayList<String> getSubsequences(String str){
		if(str.length()==0) {
			ArrayList<String> emptyString = new ArrayList<>();
			emptyString.add("");
			return emptyString;
		}
		
		char currentChar = str.charAt(0);
		String remainingString = str.substring(1); 
		ArrayList<String> result = new ArrayList<>();
		ArrayList<String> temp = getSubsequences(remainingString); //mit
		for(String t : temp) {
			result.add(t);
			result.add(currentChar + t);
		}
		return result;
	}
	
	static ArrayList<String> getPerm(String str){
		if(str.length()==0) {
			ArrayList<String> emptyString = new ArrayList<>();
			emptyString.add("");
			return emptyString;
		}
		
		char currentChar = str.charAt(0);
		String remainingString = str.substring(1); 
		ArrayList<String> result = new ArrayList<>();
		ArrayList<String> temp = getPerm(remainingString); //mit
		for(String t : temp) {
			for(int i = 0; i<=t.length(); i++) {
				StringBuffer sb = new StringBuffer(t);
				sb.insert(i, currentChar);
				result.add(sb.toString());
			}
		}
		return result;
	}
	public static void main(String[] args) {
			ArrayList<String> results = getPerm("abc");
			System.out.println(results);

	}

}

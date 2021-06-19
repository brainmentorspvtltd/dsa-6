package arraydemos;

public class FormPalindrome {

	public static void main(String[] args) {
		//String str = "ababcddee";
		//String str = "aabbcc";
		//String str = "aabbccddd";    // abcdddcba
		String str = "aaaa";
		char arr [] = str.toCharArray();
		int countArr [] = new int[256];
		int oddCount = 0;
		for(int i = 0; i<arr.length; i++) {
			countArr[arr[i]]++;
			if(countArr[arr[i]]%2!=0) {
				oddCount++;
			}
			else {
				oddCount--;
			}
		}
		System.out.println(oddCount);
		if(oddCount!=1) {
			System.out.println("Not Palindrome");
		}
		else {
			System.out.println("Palindrome");
		}

	}

}

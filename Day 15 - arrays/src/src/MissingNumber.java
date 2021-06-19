
public class MissingNumber {

	public static void main(String[] args) {
		int arr[] = {1,2,4,5};
		int xorResult=0;
		int max = arr.length + 1;
		int min = 1;
		for(int i = min; i<=max; i++) {
			xorResult = xorResult ^ i;
		}
		int xorresult2= 0;
		for(int i = 0 ;i<arr.length; i++) {
			xorresult2 = xorresult2 ^ arr[i];
		}
		System.out.println(xorResult ^ xorresult2);

	}

}

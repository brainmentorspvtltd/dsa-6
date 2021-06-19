package arraydemos;

public class PrefixSumDemo {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		for(int i = 1; i<arr.length; i++) {
			arr[i]= arr[i-1]  + arr[i];
		}
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		int arr2[] = {5,1,2,4,3,7};
		int prefixMax[] = new int[arr2.length];
		prefixMax[0] = arr2[0];
		for(int i = 1; i<arr2.length; i++) {
			prefixMax[i] = Math.max(prefixMax[i-1], arr2[i]);
		}
		System.out.println();
		for(int i : prefixMax) {
			System.out.print(i+" ");
		}
		int suffixMax [] = new int[arr2.length];
		suffixMax[arr2.length-1] = arr2[arr2.length-1];
		for(int i = arr2.length-2; i>=0; i--) {
			suffixMax[i] = Math.max(suffixMax[i+1], arr2[i]);
			
		}
		System.out.println();
		
		for(int i : suffixMax) {
			System.out.print(i+" ");
		}
		

	}

}

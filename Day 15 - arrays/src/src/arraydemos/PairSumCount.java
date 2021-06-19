package arraydemos;

import java.util.Arrays;

public class PairSumCount {

	public static void main(String[] args) {
		int arr[] = {1,4,4,5,5,5,6,6,11};
		int sum = 10;
		Arrays.sort(arr);
		int i =0;
		int j = arr.length-1;
		int ans = 0;
		while(i<j) {
			int total =arr[i] + arr[j];
			if(total<sum) {
				i++;
			}
			else
			if(total>sum) {
				j--;
			}
			// If Pair Found then looking for other pair count
			else if(total == sum) {
					// Special Case (Sandwich) + Odd Element (3 *3) Wrong
					if(arr[i] == arr[j]) {
						int len = j - i + 1;
						ans += len * (len-1)/2; //  (len-1)/2 Combination
						break;
					}
					
					// Multiple Occurance Cases Handle
					int value1 = arr[i];
					int value2 = arr[j];
					int count1 = 0;
					int count2 = 0;
					while(arr[i]== value1) {
						i++;
						count1++;
					}
					while(arr[j]== value2) {
						j--;
						count2++;
					}
					ans = count1 * count2;
				}
		}
		System.out.println("Pair Count "+ans);

	}

}

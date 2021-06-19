package arraydemos;

import java.util.ArrayList;
import java.util.List;

public class TargetArray {

	public static void main(String[] args) {
		int arr [] = {0,1,2,3,4};
		int index [] = {0,1,2,2,1};
		int [] target = new int[arr.length];
		for(int i=0; i<target.length; i++) {
			target[i] = -1;
		}
		for(int i = 0; i<arr.length; i++) {
			if(target[index[i]]==-1) { // Empty 
				target[index[i]] = arr[i];
			}
			else { // there is a value on that particular index (Shifting logic)
				for(int j = arr.length-1;j>index[i]; j--) {
					target[j] = target[j-1]; // previous value shift to next value till reach to the end of the array
				}
				target[index[i]] = arr[i];
			}
		}
		System.out.println("Target Array is ");
		for(int t: target) {
			System.out.print(t + " ");
		}
		
//		target2[4] = 1000;
//		System.out.println(target2[4]);
//		int CAP = 10;
//		List<Integer> target = new ArrayList<>(CAP); // Upcasting
//		for(int i = 0; i<CAP; i++) {
//			target.add(-1);
//		}
//		
//		//System.out.println(target.size());
//		target.add(4, 555);
//		System.out.println(target);
//		if(arr.length == index.length) {
//			for(int i = 0; i<arr.length; i++) {
//				target.add(index[i], arr[i]);
//			}
//			System.out.println("Target Array "+target);
//		}
//		else {
//			System.out.println("Not Process Length is Not Equal");
//		}

	}

}

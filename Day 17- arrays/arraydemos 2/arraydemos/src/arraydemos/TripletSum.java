package arraydemos;

import java.util.Arrays;

public class TripletSum {

	public static void main(String[] args) {
		int arr [] = {-5, -5,0,1,1,2,3,3,4,4};
		int sum =0;
		Arrays.sort(arr);
		// this i the loop is basically to fix the a 
		for(int i = 0 ; i<arr.length; i++) {
			if(i>0 && arr[i]== arr[i-1]) // more than one element present in an array
			{
				// arr[i] == arr[i-1] the previous -5 is already processed so no need to process
				// the same one because we need unique triplet
				continue; // skip the iteration because the previous element is already processed
			}
			else {
				// first time process , a[i] is basically a (fix) e.g -5
				// a is fix so now the focus to pick the remaining array
				int remSum= -1 * arr[i];
				int firstPointor = i+1;
				int secondPointor = arr.length-1; // place at last 
				while(firstPointor<secondPointor) {
					if(arr[firstPointor] +arr[secondPointor]< remSum) {
						firstPointor++;
					}
					else
					if(arr[firstPointor]+ arr[secondPointor]>remSum) {
						secondPointor--;
					}
					else
					if(arr[firstPointor]+ arr[secondPointor] == remSum) {
						System.out.println("A "+arr[i]+" B "+arr[firstPointor]+" C "+arr[secondPointor]);
						// if u found duplicate already by using set or by ur logic so skip the below code
						int firstValue = arr[firstPointor];
						int secondValue = arr[secondPointor];
						if(arr[firstPointor] == arr[secondPointor]) {
							break;
						}
						while(arr[firstPointor]== firstValue) {
							firstPointor++;
						}
						while(arr[secondPointor]== secondValue) {
							secondPointor--;
						}
					}
				}
				
			}
		}

	}

}

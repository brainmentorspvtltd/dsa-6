package arraydemos;

public class RemoveDuplicateSorted {

	public static void main(String[] args) {
		int arr[] = {1,1,1,2,2,3,4};
		//int arr2[] = new int[arr.length];
		int i = 0;
		for(int j = i+1;j<arr.length; j++ ) {
			if(arr[i]!=arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}

	}

}

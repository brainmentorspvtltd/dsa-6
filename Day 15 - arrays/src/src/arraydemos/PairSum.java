package arraydemos;

public class PairSum {

	public static void main(String[] args) {
		int arr [] = {2,9,6,3,1,10,4};
		int sum = 9;
		int hash [] = new int [10000];
		
		for(int i = 0; i<arr.length; i++) {
			int index = sum - arr[i];
			if(hash[index]==1) {
				System.out.println("Pair Found "+ arr[i] + " "+index);
				return ;
			}
			else {
				hash[arr[i]] = 1;
			}
		}
		System.out.println("NO Pair Found...");

	}

}

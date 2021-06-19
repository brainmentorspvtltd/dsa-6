package arraydemos;

public class WindowSlideDemo {

	public static void main(String[] args) {
		int arr[] = {5,2,6,1,9,7,8};
		int k = 3;
		int subArrayCount = 0;
		int sum = 0;
		for(int i = 0; i<k; i++) {
			sum+=arr[i];
		}
		System.out.println(sum); // 1st window
		for(int i = k ; i<arr.length; i++) {
			int result =  sum - arr[i-k] + arr[i];
			System.out.println(result);
			sum =  result;
		}
		//System.out.println(subArrayCount);

	}

}

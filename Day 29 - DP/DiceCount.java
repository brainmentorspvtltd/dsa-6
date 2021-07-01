package dp;

public class DiceCount {
	
	static int countWays(int currentValue , int endValue) {
		if(currentValue == endValue) {
			return 1;
		}
		if(currentValue>endValue) {
			return 0;
		}
		int count = 0;
		for(int dice = 1 ; dice<=6; dice++) {
			count = count + countWays(currentValue + dice, endValue);
		}
		return count;
	}
	
	static int countWaysMemo(int currentValue , int endValue , int cache[]) {
		if(currentValue == endValue) {
			return 1;
		}
		if(currentValue>endValue) {
			return 0;
		}
		if(cache[currentValue]!=0) {
			return  cache[currentValue];
		}
		int count = 0;
		for(int dice = 1 ; dice<=6; dice++) {
			count = count + countWaysMemo(currentValue + dice, endValue, cache);
		}
		cache[currentValue] = count;
		return cache[currentValue];
	}
	
	
	static int tabulation(int start, int end) {
		int arr [] = new int[end+1];
		arr[end] = 1;
		for(int i = end-1; i>=0; i--) {
			int count = 0;
			// i current
			for(int dice = 1; dice<=6 && dice + i< arr.length ; dice++) {
				count = count + arr[dice + i];
			}
			arr[i] = count;
			
		}
		for(int i = arr.length-1; i>=0; i--) {
			System.out.println(arr[i] + " "+i);
		}
		
	return arr[start];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int cache[] = new int[n+1];
		int result = countWaysMemo(0,n, cache);
		System.out.println(result);
		for(int i = 0 ; i< cache.length; i++) {
			System.out.println("Value "+cache[i] + " Index "+i);
		}
		tabulation(0, 10);

	}

}

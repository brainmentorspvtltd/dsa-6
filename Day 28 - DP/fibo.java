package dp;

public class fibo {
	
	static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int first = fib(n-1);
		int second = fib(n-2);
		int sum = first + second;
		return sum;
	}
	
	static int fibWithMemo(int n, int [] cache) {
		if(n==0 || n==1) {
			return n;
		}
		if(cache[n]!=0) {
			return cache[n];
		}
		int first = fibWithMemo(n-1, cache);
		int second = fibWithMemo(n-2, cache);
		int sum = first + second; // nth 
		cache[n] = sum;
		return cache[n];
	}
	
	static int fibWithTab(int n) {
		int arr[] = new int[n+1];
		arr[0] = 0; // n-2
		arr[1] = 1; // n-1
		for(int current = 2; current<=n; current++) {
			arr[current] = arr[current-1] +  arr[current-2];
		}
		return arr[n];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nthTerm = 3;
		int cache [] = new int[nthTerm+1];
		System.out.println(fibWithMemo(nthTerm, cache));
		

	}

}

package com.dit.dsa.mix;

public class TrapWaterOptimized {
	
	public static int waterStored(int arr[], int n)
	{
		int result = 0;
		int left = 0, right = 0;
		
		int low = 0, high = n - 1;
		
		while(low <= high)
		{
			if(arr[low] < arr[high])
			{
				if(arr[low] > left)
				{
					left = arr[low];
				}
				else {
					result += left - arr[low];
				}
				
				low++;
			}
			else {
				if(arr[high] > right)
				{
					right = arr[high];
				}
				else {
					result += right - arr[high];
				}
				
				high--;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3, 0, 2, 0, 4}; // 7
				//int arr[] = {2, 0, 2}; // 2
				
				System.out.println(waterStored(arr, arr.length));

	}

}

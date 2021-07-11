package com.dit.dsa.mix;

public class MaximumCircularSumSubArray {
	
	public static int kadane(int arr[], int n)
	{
		int maxResult = 0, max = 0;
		
		for(int i = 0; i < n; i++)
		{
			max += arr[i];
			
			if(max < 0)
			{
				max = 0;
			}
			if(maxResult < max)
			{
				maxResult = max;
			}
		}
		
		return maxResult;
	}
	
	public static int maxSumCircular(int arr[], int n)
	{
		//No-wrap sum = kadane sum
		int kadaneSum = kadane(arr, n);
		
		//wrap sum = circular sum
		int circularSum = 0;
		
		for(int i = 0; i < n; i++)
		{
			circularSum += arr[i]; // sum of all elements
			arr[i] = -arr[i]; // invert the elements
		}
		
		circularSum += kadane(arr, n);
		
		if(circularSum > kadaneSum)
		{
			return circularSum;
		}
		else {
			return kadaneSum;
		}
	}
	
	public static void main(String[] args) {
		
		//int arr[]  = {7, 9, -11, 2, 7, -1, 6}; // 30
		int arr[] = {1, 4, 6, 4, -3, 8, -1}; // 22
		
		int result = maxSumCircular(arr, arr.length);
		System.out.println(result);
	}

}

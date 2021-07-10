package com.dit.dsa.mix;

public class TrapWaterNaive {
	
	public static int waterStored(int arr[], int n)
	{
		int result = 0;
		
		for(int i = 0; i < n; i++)
		{
			int left = arr[i];
			for(int j = 0; j < i; j++)
			{
				left = Math.max(left, arr[j]);
			}
			
			int right =  arr[i];
			for(int j = i + 1; j < n; j++)
			{
				right = Math.max(right, arr[j]);
			}
			
			result = result + Math.min(left, right) - arr[i]; 
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[] = {3, 0, 2, 0, 4}; // 7
		int arr[] = {2, 0, 2}; // 2
		
		System.out.println(waterStored(arr, arr.length));

	}

}

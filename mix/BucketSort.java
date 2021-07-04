package com.dit.dsa.mix;

public class BucketSort {
	
	public static void bucketSort(int arr[], int n)
	{
		int count[] = new int[n + 1];
		
		for(int i = 0; i < n; i++)
		{
			count[arr[i]]++;
		}
		
		for(int i = 0, j = 0; i <= n; i++)
		{
			while(count[i] > 0)
			{
				arr[j++] = i;
				count[i]--;
			}
		}
	}
	
	public static void printArray(int arr[], int n)
	{
		System.out.println("Sorted Array ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 3, 7, 5, 2, 10, 3, 7, 5, 2};
		int n = arr.length;
		
		bucketSort(arr, n);
		printArray(arr, n);

	}

}

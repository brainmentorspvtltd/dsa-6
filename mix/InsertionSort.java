package com.dit.dsa.mix;

public class InsertionSort {
	
	public static void insertionSort(int arr[], int n)
	{
		for(int i = 1; i < n; i++)
		{
			int temp = arr[i]; // 3
			int j = i - 1;
			
			while(j >= 0 && arr[j] > temp) // 10 > 3
			{
				arr[j + 1] = arr[j];
				j = j - 1; // -1
			}
			
			arr[j + 1] = temp;
		}
	}
	
	public static void sortedArray(int arr[], int n)
	{
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 3, 7, 5, 2};
		
		insertionSort(arr, arr.length);
		sortedArray(arr, arr.length);

	}

}

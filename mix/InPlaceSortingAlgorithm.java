package com.dit.dsa.mix;

public class InPlaceSortingAlgorithm {
	
	public static void reverseArray(int arr[], int n)
	{
		for(int i = 0, j = n - 1; i < j; i++, j--)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	
	public static void printArray(int arr[], int n)
	{
		System.out.println("In Place Sorting ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 3, 4, 5};
		int n = arr.length;
		
		reverseArray(arr, n);
		printArray(arr, n);

	}

}

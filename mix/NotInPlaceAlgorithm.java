package com.dit.dsa.mix;

public class NotInPlaceAlgorithm {
	
	public static void reverseArray(int arr[], int n)
	{
		int revArray[] = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			revArray[n - i - 1] = arr[i];
		}
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = revArray[i];
		}
	}
	
	public static void printArray(int arr[], int n)
	{
		System.out.println("Not In Place Sorting ");
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

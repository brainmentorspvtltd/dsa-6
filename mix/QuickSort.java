package com.dit.dsa.mix;

public class QuickSort {
	
	public static void quickSort(int arr[], int first, int last)
	{
		int pivot, temp, i, j;
		
		if(first < last)
		{
			pivot = first;
			i = first;
			j = last;
			
			while(i < j)
			{
				while(arr[pivot] >= arr[i] && i < last)
				{
					i++;
				}
				
				while(arr[pivot] < arr[j])
				{
					j--;
				}
				
				if(i < j)
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			//swapping the pivot value with j
			temp = arr[pivot];
			arr[pivot] = arr[j];
			arr[j] = temp;
			
			//Left SubArray
			quickSort(arr, 0, j - 1);
			
			//Right SubArray
			quickSort(arr, j + 1, last);
		}
	}
	
	public static void printArray(int arr[], int n)
	{
		System.out.println("Sorted Array: ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 3, 7, 5, 2};
		int n = arr.length;
		
		quickSort(arr, 0, n - 1);
		printArray(arr, n);

	}

}

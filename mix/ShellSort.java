package com.dit.dsa.mix;

public class ShellSort {
	
	public static void shellSort(int arr[], int n)
	{
		int s = n / 2;
		
		while(s > 0)
		{
			for(int j = s; j < n; j++)
			{
				for(int i = j - s; i >= 0; i = i - s)
				{
					if(arr[i] > arr[i + s])
					{
						int temp = arr[i];
						arr[i] = arr[i + s];
						arr[i + s] = temp;
					}
					else {
						break;
					}
				}
			}
			
			s = s / 2;
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
		
		int arr[] = {10, 3, 7, 5, 2};
		int n = arr.length;
		
		shellSort(arr, n);
		printArray(arr, n);

	}

}

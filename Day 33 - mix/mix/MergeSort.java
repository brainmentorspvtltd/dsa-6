package com.dit.dsa.mix;

public class MergeSort {
	
	public static void mergeSort(int arr[], int n)
	{
		/*arr:
		 * 11, 22, 44, 33, 11, 66, 55, 88, 77
		 * 
		 * temp:
		 * 11, 22
		 * */
		
		int temp[] = new int[n];
		
		for(int size = 1; size < n; size = size * 2)
		{
			int l1 = 0; 
			int k = 0; // index for temp array
			
			while(l1 + size < n) // 0 + 1 < 9, 2 + 1 = 3 < 9
			{
				int h1 = l1 + size - 1; // 0 + 1 - 1 = 0 , 2
				int l2 = h1 + 1; // 1, 3
				int h2 = l2 + size - 1; // 1 + 1 - 1 = 1 , 3 , 8 + 8 - 1 = 15
				
				//h2 exceeds the limit of the array
				if(h2 >= n) // 15 >= 9
				{
					h2 = n - 1; // 9 - 1 = 8
				}
				
				//merge 
				
				int i = l1; // 0
				int j = l2; // 1
				
				while(i <= h1 && j <= h2) { // 0 <= 0 && 1 <= 1
					
					if(arr[i] <= arr[j]) // 11 <= 22
					{
						temp[k++] = arr[i++]; // k = 1, i = 1
					}
					else {
						temp[k++] = arr[j++];
					}
				}
				
				while(i <= h1)
				{
					temp[k++] = arr[i++];
				}
				
				while(j <= h2) // 1 <= 1
				{
					temp[k++] = arr[j++]; // k = 2, j = 2
				}
				
				//merge completed
				
				l1 = h2 + 1; // 2
				
			}
			
			//Any pair left
			for(int i = l1; i < n; i++)
			{
				temp[k++] = arr[i];
			}
			
			for(int i = 0; i < n; i++)
			{
				arr[i] = temp[i];
			}
			
			System.out.println("\nSize of "+size+" elements are ");
			for(int i = 0; i < n; i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

	public static void sortedArray(int arr[], int n)
	{
		System.out.println("\nSorted Array ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {11, 22, 44, 33, 11, 66, 55, 88, 77};
		mergeSort(arr, arr.length);
		sortedArray(arr, arr.length);

	}

}

package com.dit.dsa.mix;

public class BinarySearch {
	
	public static int binarySearch(int arr[], int srcElement)
	{
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right)
		{
			int mid = (left + right) / 2;
			
			if(arr[mid] == srcElement)
			{
				return mid;
			}
			else if(arr[mid] < srcElement)
			{
				left = mid + 1;
			}
			else if(arr[mid] > srcElement){
				
				right = mid - 1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 3, 4, 10, 40};
		int searchElement = 10;
		
		int index = binarySearch(arr, searchElement);
		
		if(index == -1)
		{
			System.out.println("Element is not found");
		}
		else {
			System.out.println("Element is found at index "+index);
		}

	}

}

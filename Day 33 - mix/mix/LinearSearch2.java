package com.dit.dsa.mix;

public class LinearSearch2 {
	
	public static void search(int arr[], int srcElement)
	{
		int left = 0;
		int right = arr.length - 1;
		int index = -1;
		
		for(left = 0; left <= right; left++, right--)
		{
			if(arr[left] == srcElement)
			{
				index = left;
				System.out.println("Element is found at index "+index);
				break;
			}
			
			if(arr[right] == srcElement)
			{
				index = right;
				System.out.println("Element is found at index "+index);
				break;
			}
		}
		
		if(index == -1)
		{
			System.out.println("Element is not found");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10, 20, 60, 70, 90, 100, 150};
		int searchElement = 90;
		
		search(arr, searchElement);
		
	}

}

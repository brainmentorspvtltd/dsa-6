package com.dit.dsa.mix;

public class LinearSearch1 {
	
	public static int search(int arr[], int srcElement)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == srcElement)
			{
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 20, 60, 70, 90, 100, 150};
		int searchElement = 90;
		
		int index = search(arr, searchElement);
		
		if(index == -1)
		{
			System.out.println("Element is not found ");
		}
		else {
			System.out.println("Element is found at index "+index);
		}
	}

}

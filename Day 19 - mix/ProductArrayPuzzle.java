package com.dit.dsa.mix;

public class ProductArrayPuzzle {
	
	public static void PAP(int arr[])
	{
		
		int prod = 1;
		
		for(int i = 0; i < arr.length; i++)
		{
			prod *= arr[i];
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			int result = (int)(prod * Math.pow(arr[i], -1));
			System.out.print(result+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 3, 5, 6, 2};
		
		PAP(arr);

	}

}

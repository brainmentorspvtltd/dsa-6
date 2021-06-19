package com.dit.dsa.mix;

public class SquareRoot {
	
	//Approach - 2, Binary Search, O(log n)
	
	public static int floorSqrt(int n) {
		
		int first = 1, last = n, result = 0;
		
		if(n == 0 || n == 1)
		{
			return n;
		}
		
		while(first <= last) {
			
			int mid = (first + last)/2;
			
			if(mid * mid == n)
			{
				return mid;
			}
			
			if(mid * mid < n)
			{
				first = mid + 1;
				result = mid;
			}
			else {
				last = mid - 1;
			}
			
		}
		
		return result;
	}
	
	
	/*
	 * Approach - 1, O(square root of N)
	public static int floorSqrt(int n)
	{
		if(n == 0 || n == 1)
		{
			return n;
		}
		
		int i = 1;
		int result = 1;
		
		while(result <= n) // 1 <= 18, 4 <= 18, 9 <= 18, 16 <= 18, 25 <= 18 - false
		{
			i++; // 2, 3, 4, 5
			result = i * i; // 4, 9, 16, 25
		}
		
		return i - 1; // 5 - 1 = 4
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 18; // 4
		
		System.out.println(floorSqrt(n));

	}

}

package com.dit.dsa.mix;

public class JumpGame {
	
	public static boolean canJump(int arr[])
	{
		if(arr.length <= 1)
		{
			return true;
		}
		
		for(int i = 0; i < arr.length;)
		{
			if(arr[i] == 0)
			{
				return false;
			}
			
			i = i + arr[i];
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3, 2, 1, 0, 4};
		
		System.out.println(canJump(arr));

	}

}

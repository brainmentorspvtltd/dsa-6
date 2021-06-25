<<<<<<< HEAD:Day 19 - mix/mix/JumpGame1.java
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
=======
package com.dit.dsa.mix;

public class JumpGame {
	
	public static boolean canJump(int arr[])
	{
		int max = arr[0];
		
		if(arr.length == 1)
		{
			return true;
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			if(max <= i && arr[i] == 0)
			{
				return false;
			}
			
			if(i + arr[i] > max)
			{
				max = i + arr[i];
			}
			
			if(max >= arr.length-1)
			{
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 3, 1, 1, 4};
		
		System.out.println(canJump(arr));

	}

}
>>>>>>> upstream/main:mix/JumpGame.java

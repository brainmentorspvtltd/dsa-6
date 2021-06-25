package com.dit.dsa.mix;

public class PartitionSubset {
	
	public static boolean canPartition(int arr[])
	{
		int sum = 0;
		
		for(int i : arr)
		{
			sum += i;
		}
		
		if(sum % 2 != 0)
		{
			return false;
		}
		
		int subsetSum = sum / 2;
		
		boolean dp[] = new boolean[subsetSum + 1];
		dp[0] = true;
		
		for(int num : arr)
		{
			for(int j = subsetSum; j >= 0; j--)
			{
				if(j >= num)
				{
					dp[j] = dp[j] | dp[j - num];
				}
			}
		}
		
		return dp[subsetSum];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 5, 11, 5};
		
		System.out.println(canPartition(arr));

	}

}

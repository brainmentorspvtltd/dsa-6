package com.dit.dsa.mix;

public class CoinChangeApproach1 {
	
	public static void coinChange(int i, int coins[], int amt, int tamt, String result)
	{
		//base case
		if(i == coins.length)
		{
			if(amt == tamt)
			{
				System.out.println(result);
			}
			
			return;
		}		
		
		coinChange(i + 1, coins, amt + coins[i], tamt, result + coins[i] + " ");
		coinChange(i + 1, coins, amt, tamt, result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int coins[] = {2, 3, 5, 6};
		int tamt = 10;
		
		coinChange(0, coins, 0, tamt, "");

	}

}

package com.dit.dsa.mix;

public class CoinChangeApproach2 {
	
	public static void coinChange(int coins[], int amount, String result, int index)
	{
		
		//base case
		
		if(amount == 0)
		{
			System.out.println(result);
			return;
		}
		
		for(int i = index; i < coins.length; i++)
		{
			if(amount >= coins[i])
			{
				coinChange(coins, amount - coins[i], result + coins[i], i);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int coins[] = {2, 3, 5, 6};
		int amt = 10;
		
		coinChange(coins, amt, "", 0);
		

	}

}

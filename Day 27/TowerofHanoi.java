package com.dit.dsa.mix;

public class TowerofHanoi {
	
	public static void TOH(int n, int A, int B, int C)
	{
		if(n > 0)
		{
			TOH(n - 1, A, C, B);
			System.out.println("(" + A + ", " + C + ")");
			TOH(n - 1, B, A, C);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int disks = 3;
		
		TOH(disks, 1, 2, 3);

	}

}

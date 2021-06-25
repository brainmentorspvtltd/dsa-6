package com.dit.dsa.mix;

import java.util.HashMap;

public class RepeatedMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4, 3, 6, 2, 1, 1};
		
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for(int i : arr)
		{
			if(map.get(i) == null)
			{
				map.put(i, true);
			}
			else {
				System.out.println("Repeated "+i);
			}
		}
		
		
		for(int i = 1; i <= arr.length; i++)
		{
			if(map.get(i) == null)
			{
				System.out.println("Missing Number "+i);
			}
		}

	}

}

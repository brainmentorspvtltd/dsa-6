package com.dit.dsa.mix;

public class PalindromePartition {
	
	public static boolean isPalindrome(String str)
	{
		int li = 0;
		int ri = str.length() - 1;
		
		while(li < ri)
		{
			char left = str.charAt(li);
			char right = str.charAt(ri);
			
			if(left != right)
			{
				return false;
			}
			
			li++;
			ri--;
		}
		
		return true;
	}
	
	public static void palPartitioning(String str, String result)
	{
		//base case
		if(str.length() == 0)
		{
			System.out.println(result);
			return;
		}
		
		for(int i = 0; i < str.length(); i++)
		{
			String prefix = str.substring(0, i + 1);
			String remString = str.substring(i + 1);
			
			if(isPalindrome(prefix))
			{
				palPartitioning(remString, result + "[" + prefix + "]");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aab";
		
		palPartitioning(str, "");

	}

}

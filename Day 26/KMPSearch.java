package com.dit.dsa.mix;

public class KMPSearch {
	
	public static void computeLPSArray(String pat, int M, int lps[])
	{
		int len = 0;
		int i = 1;
		
		lps[0] = 0;
		
		while(i < M)
		{
			if(pat.charAt(i) == pat.charAt(len)) {
				lps[i] = len + 1;
				len += 1;
				i += 1;
			}
			else {
				
				if(len != 0)
				{
					//len = 0;
					len = lps[len - 1];
				}
				
				else {
					lps[i] = 0;
					i += 1;
				}
			}
		}
	}
	
	public static void kmpSearch(String pat, String str)
	{
		
		int M = pat.length(); // 2
		int N = str.length(); // 12
		
		int lps[] = new int[M];
		
		computeLPSArray(pat, M, lps);
		
		int i = 0;
		int j = 0; // index of pat
		
		while(i < N)
		{
			if(pat.charAt(j) == str.charAt(i)) {
				
				i += 1;
				j += 1;
			}
			
			else {
				
				if(j != 0)
				{
					j = lps[j - 1];
				}
				else {
					i += 1;
				}
			}
			
			if(j == M)
			{
				System.out.println("Pattern Found at index "+ (i - j));
				j = lps[j - 1];
			}
		}	
		
	}
	
	public static void main(String[] args) {
		
		String str = "aaddaaccaagg";
		String pat = "aa";
		
		kmpSearch(pat, str);
		
	}

}

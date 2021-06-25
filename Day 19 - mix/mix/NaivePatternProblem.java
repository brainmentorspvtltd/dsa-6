package com.dit.dsa.mix;

public class NaivePatternProblem {
	
	public static void searchPattern(String str, String pattern)
	{
		for(int i = 0; i <= (str.length() - pattern.length()); i++)
		{
			int j;
			for(j = 0; j < pattern.length(); j++)
			{
				if(str.charAt(i+j) != pattern.charAt(j)) {
					break;
				}
			}
			
			if(j == pattern.length())
			System.out.println("Pattern found at index  "+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "AABAACAADAABAABA";
		String pattern = "AABA";
		
		searchPattern(str, pattern);

	}

}

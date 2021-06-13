package com.dit.los.utils;

import java.util.Scanner;

public class Utility implements StageConstants {
	
	public static int serialCounter = 1;
	private Utility(){}
	public static Scanner scanner = new Scanner(System.in);
	
	public static String getStageName(int stageId)
	{
		switch(stageId)
		{
		case SOURCING:
			return "Sourcing Stage";
		
		case QDE:
			return "QDE Stage";
			
		case DEDUPE:
			return "Dedupe Stage";
			
		case SCORING:
			return "Scoring Stage";
			
		case REJECT:
			return "Rejection Stage";
			
		default:
			return "Invalid Stage";
		}
		
	}

}

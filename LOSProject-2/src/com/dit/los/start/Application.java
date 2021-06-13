package com.dit.los.start;

import com.dit.los.operation.LOSProcess;
import com.dit.los.utils.Utility;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LOSProcess process = new LOSProcess();
		while(true)
		{
		System.out.println("Do you have Application Number or Not(Enter 0) Press -1 to Exit()");
		int applicationNumber = Utility.scanner.nextInt();
		
		if(applicationNumber == -1)
		{
			System.out.println("Thanks for Using");
			System.exit(0);
		}
		
		if(applicationNumber == 0)
		{
			//New Customer
			
			process.sourcing();
			
		}
		else {
			//Existing Customer
			
			process.checkStage(applicationNumber);
			
		}
		}

	}

}

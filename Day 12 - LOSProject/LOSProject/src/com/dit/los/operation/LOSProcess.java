package com.dit.los.operation;
import com.dit.los.customer.Customer;
import com.dit.los.customer.LoanDetails;
import com.dit.los.customer.PersonalInformation;
import com.dit.los.utils.StageConstants;
import com.dit.los.utils.Utility;

import static com.dit.los.utils.Utility.scanner;
import static com.dit.los.utils.Utility.serialCounter;

import java.util.ArrayList;

public class LOSProcess implements StageConstants{
	//Logic in this process class
	
	//private Customer customers[] = new Customer[100];
	
	private ArrayList<Customer> customers = new ArrayList<>();
	
	public void sourcing()
	{
		Customer customer = new Customer();
		customer.setId(serialCounter);
		customer.setStage(SOURCING);
		
		System.out.println("Enter the First Name");
		String firstName = scanner.next();
		System.out.println("Enter the Last Name");
		String lastName = scanner.next();
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		System.out.println("Enter the Loan Type HL, AL, PL");
		String type = scanner.next();
		System.out.println("Enter the Amount");
		double amount = scanner.nextDouble();
		System.out.println("Duration of a Loan");
		int duration = scanner.nextInt();
		
		PersonalInformation pd = new PersonalInformation();
		pd.setFirstName(firstName);
		pd.setLastName(lastName);
		pd.setAge(age);
		customer.setPersonal(pd);
		
		LoanDetails loanDetails = new LoanDetails();
		loanDetails.setType(type);
		loanDetails.setAmount(amount);
		loanDetails.setDuration(duration);
		customer.setLoanDetails(loanDetails);
		
		customers.add(customer);
		serialCounter++;
		System.out.println("Sourcing Done...");
	}
	
	public void checkStage(int applicationNumber)
	{
		boolean isStageFound = false;
		
		if(customers != null && customers.size() > 0)
		{
		for(Customer customer : customers)
		{
			if(customer.getId() == applicationNumber)
			{
				System.out.println("You are on "+Utility.getStageName(customer.getStage()));
				isStageFound = true;
				break;
			}
		}
		}
		
		if(!isStageFound) {
			System.out.println("Invalid Application Number");
		}
	}

}

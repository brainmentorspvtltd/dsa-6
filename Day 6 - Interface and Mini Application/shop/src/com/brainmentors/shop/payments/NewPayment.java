package com.brainmentors.shop.payments;

public class NewPayment implements IPayment {

	@Override
	public boolean pay(double amount) {
		System.out.println("New Payment call "+amount);
		// TODO Auto-generated method stub
		return false;
	}
	
	public String[] newPaymentGateWays() {
		return new String [] {"Amazon Money", "Airtel Money"};
	}
	

}

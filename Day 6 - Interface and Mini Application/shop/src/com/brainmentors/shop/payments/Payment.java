package com.brainmentors.shop.payments;

import com.brainmentors.shop.tax.GST;

public class Payment implements IPayment{
	
	public boolean chooseGateWay(String gateWayName){
		PaymentGateway gateWay = new PaymentGateway();
		String []gateways = gateWay.getPaymentGateway();
		for(String currentGateWay : gateways) {
			if(currentGateWay.equals(gateWayName)) {
				return true;
			}
		}
		return false;
	}
	
	public GST getCurrentTaxScheme() {
		return new GST();
	}
	
	public boolean pay(double amount) {
		System.out.println("Payment Pay Method "+amount);
		if(chooseGateWay("PayTM")) {
			GST gst = getCurrentTaxScheme();
			int tax = gst.getTax();
			double finalAmount = amount + amount * tax;
			System.out.println("Final Amount to Pay "+finalAmount);
			return true;
		}
		return false;
	}
	
}

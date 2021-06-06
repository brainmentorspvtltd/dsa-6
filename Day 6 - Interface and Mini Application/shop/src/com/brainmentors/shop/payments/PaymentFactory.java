package com.brainmentors.shop.payments;

import java.util.ResourceBundle;

public class PaymentFactory {
	private PaymentFactory() {}
	public static IPayment getPayment(){
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String className = rb.getString("classname");
		IPayment ipayment = null;
		try {
			ipayment = (IPayment)Class.forName(className).newInstance();
		} catch(Exception e) {
			System.out.println("Wrong Class ....");
		}
		return ipayment;
		//return new Payment();
	}

}

package com.brainmentors.shop.order;

import com.brainmentors.shop.payments.IPayment;
import com.brainmentors.shop.payments.NewPayment;
import com.brainmentors.shop.payments.Payment;
import com.brainmentors.shop.payments.PaymentFactory;

public class OrderBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orderName = "Apple IPhone 12";
		double amount = 90000;
		//IPayment payment = new NewPayment();
		IPayment payment = PaymentFactory.getPayment();
		//PaymentFactory pf = new PaymentFactory();
		//IPayment payment = pf.getPayment();
		//IPayment payment =new Payment(); // Upcasting
		//payment.getCurrentTaxScheme();
		//payment.chooseGateWay("");
		payment.pay(amount);
	

	}

}

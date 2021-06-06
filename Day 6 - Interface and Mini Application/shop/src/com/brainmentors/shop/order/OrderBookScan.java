package com.brainmentors.shop.order;

import com.brainmentors.shop.payments.IPayment;
import com.brainmentors.shop.payments.Payment;
import com.brainmentors.shop.payments.PaymentFactory;

public class OrderBookScan {
public static void main(String[] args) {
	//IPayment payment =new Payment(); 
	//payment.pay(2000);
	//PaymentFactory pf = new PaymentFactory();
	IPayment payment = PaymentFactory.getPayment();
	payment.pay(9000);
}
}

package com.bsos.payment.paymenthistory;

public interface PaymentHistoryService {
	public void registerPaymentHistory(PaymentHistory paymentHistory);
	public PaymentHistory searchPaymentHistory(int paymentHistoryNo);
}

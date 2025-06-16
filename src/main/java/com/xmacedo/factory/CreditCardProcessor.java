package com.xmacedo.factory;

public class CreditCardProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing $" + amount + " via credit card");
    }
}

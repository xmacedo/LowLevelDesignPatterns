package com.xmacedo.factory;

public class FactoryExample {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = PaymentFactory.getProcessor("credit");
        creditCardProcessor.processPayment(100);

        creditCardProcessor = PaymentFactory.getProcessor("paypal");
        creditCardProcessor.processPayment(150);
    }
}

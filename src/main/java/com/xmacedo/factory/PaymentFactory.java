package com.xmacedo.factory;

public class PaymentFactory {
    public static PaymentProcessor getProcessor(String type) {
        if (type.equalsIgnoreCase("credit")) {
            return new CreditCardProcessor();
        } else if (type.equalsIgnoreCase("paypal")) {
            return new PayPalProcessor();
        }
        throw new IllegalArgumentException("Unknown processor type");
    }
}

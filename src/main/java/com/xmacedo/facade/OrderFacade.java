package com.xmacedo.facade;

public class OrderFacade {
    private Inventory inventory;
    private Payment payment;

    public OrderFacade() {
        this.inventory = new Inventory();
        this.payment = new Payment();
    }

    public void placeOrder() {
        inventory.checkStock();
        payment.processPayment();

        System.out.println("Order placed!");
    }
}

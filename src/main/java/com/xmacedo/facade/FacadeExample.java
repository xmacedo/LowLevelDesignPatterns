package com.xmacedo.facade;

public class FacadeExample {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder();
    }
}

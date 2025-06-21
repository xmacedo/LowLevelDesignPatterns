package com.xmacedo.observer;

public class Trader implements Observer {

    public void update(String stock, double price) {
        System.out.println("Trader notified: " + stock + " price is R$ " + price);
    }
}

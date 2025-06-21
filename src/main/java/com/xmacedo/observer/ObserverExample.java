package com.xmacedo.observer;

public class ObserverExample {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        stockMarket.addObserver(new Trader());
        stockMarket.setPrice("VGRI11", 8.55);
    }
}

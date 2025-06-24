package com.xmacedo.adapter;

public class AdapterExample {
    public static void main(String[] args) {
        LegacySystem legacySystem = new LegacySystem();
        ModernApi modernApi = new LegacyAdapter(legacySystem);
        modernApi.modernApiMethod();
    }
}

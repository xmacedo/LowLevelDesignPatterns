package com.xmacedo.adapter;

public class LegacyAdapter implements ModernApi {
    private LegacySystem legacySystem;

    public LegacyAdapter(LegacySystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    public void modernApiMethod() {
        legacySystem.legacyRequest();
    }
}

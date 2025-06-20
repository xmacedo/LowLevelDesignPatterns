package com.xmacedo.strategy;

public class DataProcessor {
    private SortStrategy sortStrategy;

    public DataProcessor(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void processData(int[] data) {
        sortStrategy.sort(data);
    }
}

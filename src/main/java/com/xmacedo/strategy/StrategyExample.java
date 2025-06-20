package com.xmacedo.strategy;

public class StrategyExample {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Using a BubbleSort
        DataProcessor dataProcessor = new DataProcessor(new BubbleSort());
        dataProcessor.processData(data);

        //Using a QuickSort
        dataProcessor = new DataProcessor(new QuickSort());
        dataProcessor.processData(data);
    }
}

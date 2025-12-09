package StrategyDesignPattern;

import StrategyDesignPattern.SortingStrategies.InsertionSort;
import StrategyDesignPattern.SortingStrategies.MergeSort;

public class Client {

    public static void main(String[] args) {
        DataProcessor dataProcessor = new DataProcessor(new InsertionSort());

        int[] arr = {1, 2, 3, 4, 5};
        dataProcessor.sortDataByStrategy(arr);

        int[] arr2 = new int[1000];
        dataProcessor.sortData(arr2);
    }
}

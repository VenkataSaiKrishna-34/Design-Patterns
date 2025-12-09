package StrategyDesignPattern;

import StrategyDesignPattern.SortingStrategies.InsertionSort;
import StrategyDesignPattern.SortingStrategies.MergeSort;
import StrategyDesignPattern.SortingStrategies.QuickSort;
import StrategyDesignPattern.SortingStrategies.SortingStrategy;

public class SortingStrategyFactory {
    public static SortingStrategy getSortingStrategyBySize(int inputSize){
        SortingStrategy sortingStrategy = null;

        if(inputSize < 1000){
            sortingStrategy = new InsertionSort();
        } else if(inputSize < 100000){
            sortingStrategy = new QuickSort();
        } else {
            sortingStrategy = new MergeSort();
        }

        return sortingStrategy;
    }
}

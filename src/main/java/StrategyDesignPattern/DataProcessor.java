package StrategyDesignPattern;

import StrategyDesignPattern.SortingStrategies.SortingStrategy;

public class DataProcessor {
    private SortingStrategy sortingStrategy;

    public DataProcessor(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public void changeSortingStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    //This sorts the data using sorting strategy given by the client
    public void sortDataByStrategy(int[] arr){
        sortingStrategy.sort(arr);
    }

    //This will sort the data based of the size of the array
    //The correct sorting strategy is picked based on the size of the array
    public void sortData(int[] arr){
        int inputSize = arr.length;
        SortingStrategyFactory.getSortingStrategyBySize(inputSize).sort(arr);
    }
}

package com.codeWithAshith.SpringBasics;

public class BinarySearchImpl {

    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        // Sort Array
//        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
//        QuickSortAlgorithm quickSortAlgorithm = new QuickSortAlgorithm();

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        // Search Array

        return 3;
    }
}

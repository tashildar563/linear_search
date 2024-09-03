package org.example;

import static org.example.SortingInJava.printArray;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {1, 5, 3235, 6454, 3647, 23, 9};
        //time comlexity = O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }


}

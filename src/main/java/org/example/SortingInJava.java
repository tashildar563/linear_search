package org.example;

public class SortingInJava {
    public static void main(String[] args) {
        int[] arr = {23, 4234, 53, 53, 5, 64, 52, 253, 634675, 2, 424, 636, 67, -74, 63512};
        //bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
 //time complexity = O(n^2)
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]+", ");
        }
    }
}

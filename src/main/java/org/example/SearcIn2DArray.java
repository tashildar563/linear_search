package org.example;

import java.util.Arrays;

public class SearcIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 43, 1, 342, 53},
                {98, 543, 756, 46},
                {677, 2, 9, 2378, 234, 6, 54, 234, 1243, 354, 43}};
        int target = 54;
        int[] ans = search2dArray(arr, target);
        int max = findMaxValue(arr);
        System.out.print(Arrays.toString(ans));
        System.out.print("max value >> "+max);
    }

    private static int findMaxValue(int[][] arr) {
        int max =arr[0][0];
        for(int row = 0 ; row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                if(max<arr[row][col]){
                    max= arr[row][col];
                }
            }
        }
        return max;
    }

    private static int[] search2dArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{
                            row, col
                    };
                }
            }
        }
        return new int[]{};
    }
}

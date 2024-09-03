package org.example;

public class FindMinNumber {
    public static void main(String[] args) {
        int [] arr = {23,4234,53,53,5,64,52,253,634675,2,424,636,67,-74,63512};;
        int minValue = findMinValue(arr);
        System.out.print(minValue);

    }

    private static int findMinValue(int[] arr) {
        int temp=arr[0];
        for (int i : arr){
            if(i<temp){
                temp=i;
            }
        }
        return temp;
    }
}

package org.example;

public class InsertionSort {
    public static void main (String [] args){
        int arr[] = {23,4,26,74,785};
        //insertion sort
        for (int i = 0 ; i<arr.length-1;i++){
            int current = arr[i];
            int j=i-1;
            while (j>=0 && arr[current]<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+i] = current;
        }

        for (int i = 0; i<arr.length-1;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0&& arr[current]<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }
}

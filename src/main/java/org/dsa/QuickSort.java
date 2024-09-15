package org.dsa;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={4444,6,2,5,235};
        int n= arr.length;
        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(">>"+arr[i]);
        }
        System.out.println("");

    }
    public static void  quickSort(int [] arr,int low, int high){
        if(low<high){
            int pi = partion(arr,low,high);
            quickSort(arr,low,pi);
            quickSort(arr,pi+1,high);
        }
    }

    private static int partion(int[] arr, int low, int high) {
        int pivot =arr[high];
        int i= low;
        for(int j=i;j<=high-1;j++){
            if(pivot>arr[j]){
                i++;
                swapEl(arr,i,j);
        }
    }
        swapEl(arr,i,high);
        return i;
}

    private static void swapEl(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    }
